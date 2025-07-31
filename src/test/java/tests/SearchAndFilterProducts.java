package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import utils.BaseTest;
import utils.ExcelReader;

public class SearchAndFilterProducts extends BaseTest {

    @Test
    public void testSearchAndFilterProducts() {
        ExcelReader reader = new ExcelReader("testdata/TestData.xlsx");

        String searchTerm = reader.getCellData("Products", 1, 0); // Tshirt
        String brand = reader.getCellData("Products", 1, 2);      // Polo

        ProductsPage products = new ProductsPage(driver);

        products.goToProducts();
        products.searchProduct(searchTerm);

        Assert.assertTrue(products.isSearchedProductVisible(), "Searched product title not visible");

        products.clickBrandPolo(); 

        Assert.assertTrue(products.isProductResultDisplayed(), "Filtered products by brand not visible");
    }
}
