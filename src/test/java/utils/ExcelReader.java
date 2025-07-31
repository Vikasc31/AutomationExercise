package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {
    Workbook workbook;

    public ExcelReader(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(new File(filePath));
            workbook = WorkbookFactory.create(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellData(String sheetName, int row, int col) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(col);
        return c.toString();
    }
}
