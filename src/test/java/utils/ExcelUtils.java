package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	public static String[][] getSheetData(String excelPath, String sheetName){
		
		try {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			
			int rows = sheet.getPhysicalNumberOfRows();
			int cols = sheet.getRow(0).getLastCellNum();
			
			String[][] data = new String[rows - 1][cols];
			
			for(int i = 1; i < rows; i++) {
				Row row = sheet.getRow(i);
				for(int j = 0; j < cols; j++) {
					data[i - 1][j] = row.getCell(j).toString();
				}				
			}
			workbook.close();
			fis.close();
			return data;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
