package tests;

import org.testng.annotations.Test;
import pages.ProductsPage;
import utils.BaseTest;
import utils.ExcelReader;
import validations.Validation;
import constant.Constant;

public class SearchAndFilterProducts extends BaseTest {

    @Test
    public void testSearchAndFilterProducts() {
        ExcelReader reader = new ExcelReader(Constant.FILE_PATH);

        String searchTerm = reader.getCellData(Constant.PRODUCT_SHEET, 
        										Constant.SEARCH_TERM_ROW, 
        										Constant.SEARCH_TERM_COL);

        String brand = reader.getCellData(Constant.PRODUCT_SHEET, 
        									Constant.SEARCH_TERM_ROW, 
        									Constant.BRAND_COL);

        ProductsPage products = new ProductsPage(driver);

        products.goToProducts();
        products.searchProduct(searchTerm);

        Validation.validateSearchedProductVisible(products);

        products.clickBrandPolo(brand);

        Validation.validateFilteredProductsByBrand(products);
    }
}
