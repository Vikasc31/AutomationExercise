package data;

import utils.ExcelReader;

public class LoginTestData {
    private static final String FILE_PATH = "testdata/TestData.xlsx";

    public static String getValidEmail() {
        return getData(1, 0);
    }

    public static String getValidPassword() {
        return getData(1, 1);
    }

    public static String getInvalidEmail() {
        return getData(2, 0);
    }

    public static String getInvalidPassword() {
        return getData(2, 1);
    }

    private static String getData(int row, int col) {
        ExcelReader reader = new ExcelReader(FILE_PATH);
        return reader.getCellData("Login", row, col);
    }
}
