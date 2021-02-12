package readingdatafromxlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester2 {
	public static void  main(String[] args) {
		String filepath="./resources/Test Data.xlsx";
		String sheetName="Sheet1";
		
		//Create the FIN Object
		FileInputStream fin = new FileInputStream(filepath);
		
		//Create Object Representation of ExcelFile
		Workbook workBook = WorkbookFactory.create(fin);
		
		//Create Object Representation of Sheet
		Sheet sheet=workBook.getSheet(sheetName);
		
		//Create Object Representation of Row
		Row row1=sheet.getRow(1);
		
		//Create Object Representation of Sheet
		Cell cell0=row1.getCell(0);
		
		String url=cell0.getStringCellValue();
		System.out.println(url);
		
		
			
		}
	}

}
