package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataDriven {
	
	public static String getDataFromSheet;
	
	public static String data(int r, int c) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\cogmentoProject\\Excel\\Contacts.xlsx");	
	Workbook wb = WorkbookFactory.create(fis);	
	getDataFromSheet = wb.getSheet("Contact").getRow(r).getCell(c).getStringCellValue();	
	return getDataFromSheet; 
	
	}

}
