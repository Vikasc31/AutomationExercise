package data;

import utils.ExcelReader;

public class UserTestData {

    private static final String FILE_PATH = "testdata/TestData.xlsx";
    private static final String SHEET = "Register";

    public static String getName() {
        return getData(SHEET, 1, 0);
    }

    public static String getEmail() {
        return getData(SHEET, 1, 1);
    }

    public static String getPassword() {
        return getData(SHEET, 1, 2);
    }

    public static String getDay() {
        return getData(SHEET, 1, 3);
    }

    public static String getMonth() {
        return getData(SHEET, 1, 4);
    }

    public static String getYear() {
        return getData(SHEET, 1, 5);
    }

    public static String getFirstName() {
        return getData(SHEET, 1, 6);
    }

    public static String getLastName() {
        return getData(SHEET, 1, 7);
    }

    public static String getCompany() {
        return getData(SHEET, 1, 8);
    }

    public static String getAddress() {
        return getData(SHEET, 1, 9);
    }

    public static String getCountry() {
        return getData(SHEET, 1, 10);
    }

    public static String getState() {
        return getData(SHEET, 1, 11);
    }

    public static String getCity() {
        return getData(SHEET, 1, 12);
    }

    public static String getZip() {
        return getData(SHEET, 1, 13);
    }

    public static String getMobile() {
        return getData(SHEET, 1, 14);
    }

    private static String getData(String sheet, int row, int col) {
        ExcelReader reader = new ExcelReader(FILE_PATH);
        return reader.getCellData(sheet, row, col);
    }
}
