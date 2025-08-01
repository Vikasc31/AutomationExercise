package data;

import utils.ExcelReader;
import constant.Constant;

public class UserTestData {

    // =================== Register User Data ===================

    public static String getName() {
        return getRegisterData(1, 0);
    }

    public static String getEmail() {
        return getRegisterData(1, 1);
    }

    public static String getPassword() {
        return getRegisterData(1, 2);
    }

    public static String getDay() {
        return getRegisterData(1, 3);
    }

    public static String getMonth() {
        return getRegisterData(1, 4);
    }

    public static String getYear() {
        return getRegisterData(1, 5);
    }

    public static String getFirstName() {
        return getRegisterData(1, 6);
    }

    public static String getLastName() {
        return getRegisterData(1, 7);
    }

    public static String getCompany() {
        return getRegisterData(1, 8);
    }

    public static String getAddress() {
        return getRegisterData(1, 9);
    }

    public static String getCountry() {
        return getRegisterData(1, 10);
    }

    public static String getState() {
        return getRegisterData(1, 11);
    }

    public static String getCity() {
        return getRegisterData(1, 12);
    }

    public static String getZip() {
        return getRegisterData(1, 13);
    }

    public static String getMobile() {
        return getRegisterData(1, 14);
    }

    // =================== Login User Data ===================

    public static String getValidEmail() {
        return getLoginData(1, 0);
    }

    public static String getValidPassword() {
        return getLoginData(1, 1);
    }

    public static String getInvalidEmail() {
        return getLoginData(2, 0);
    }

    public static String getInvalidPassword() {
        return getLoginData(2, 1);
    }

    // =================== Private Helpers ===================

    private static String getRegisterData(int row, int col) {
        ExcelReader reader = new ExcelReader(Constant.FILE_PATH);
        return reader.getCellData(Constant.REGISTER_SHEET, row, col);
    }

    private static String getLoginData(int row, int col) {
        ExcelReader reader = new ExcelReader(Constant.FILE_PATH);
        return reader.getCellData(Constant.LOGIN_SHEET, row, col);
    }
}
