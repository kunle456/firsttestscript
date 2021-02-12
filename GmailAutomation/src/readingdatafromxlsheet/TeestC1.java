package readingdatafromxlsheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TeestC1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filepath="./resources/Test Data.xlsx";
		String sheetName="Sheet1";
		
		// Create the FIN object
		FileInputStream fin = new FileInputStream(filepath);
		
		// Created Object Representation of ExcelFile
		
		Workbook workBook = WorkbookFactory.create(fin);
		
		// Created Object Representation of Sheet
		Sheet sheet = workBook.getSheet(sheetName);
		
		// Create object representation of row
		Row rowl=sheet.getRow(1);
		
		// Create Object Representation of Cell
		Cell cell0=rowl.getCell(0);
		String url=cell0.toString();
		System.out.println(url);
	}

}
