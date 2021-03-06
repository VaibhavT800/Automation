package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Flib {
	
	
	private static final Cell Cell = null;

	public String readData(String excelPath,String sheetName,int rowcount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell =(com.google.common.collect.Table.Cell) row.getCell(cellCount);
		String data = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
		return data;
	
		
	}
	
	public int getrowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;	
	}

	public String readPropertyFile(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
