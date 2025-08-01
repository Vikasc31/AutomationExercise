package data;

import utils.ExcelReader;
import constant.Constant;

public class ProductTestData {
   

    public static String getSearchTerm() {
        return getData(1, 0); // Tshirt
    }

    public static String getCategory() {
        return getData(1, 1); // Men > T-Shirts
    }

    public static String getBrand() {
        return getData(1, 2); // Polo
    }

    private static String getData(int row, int col) {
        ExcelReader reader = new ExcelReader(Constant.FILE_PATH);
        return reader.getCellData(Constant.PRODUCT_SHEET, row, col);
    }
}
