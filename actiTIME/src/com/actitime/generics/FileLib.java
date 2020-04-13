package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * generic method for reading from property file
	 * From Pradeep
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
public String getPropertyFileData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/Commondata.properties.txt");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	
}
/**
 * generic method for reading from excel file
 * From Pradeep
 * @param path
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String path,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	
	 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
	
}
public void setExcelData(String path,String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	wb.close();

	
}


}
