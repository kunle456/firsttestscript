package readingdatafromxlsheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary { 
	
	public static String getData(String filePath, String sheetName, int rowNum, int cellNum) {
		try {
			FileInputStream fin = new FileInputStream(filePath);
			
			//Create Object Representation of ExcelFile
			Workbook workBook = WorkbookFactory.create(fin);
			
			//Create Object Representation of Sheet
			Sheet sheet=workBook.getSheet(sheetName);
			
			return sheet.getRow(rowNum).getCell(cellNum).toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
