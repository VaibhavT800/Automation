package readTextExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import com.google.common.collect.Table;

public class ActiTimeLoginWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=83hlte80bcalu");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("logincreds");
		Row row =sh.getRow(1);
		 org.apache.poi.ss.usermodel.Cell cell =row.getCell(0);
		String username = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sh2 = wb2.getSheet("validcreds");
		Row row2 = sh2.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

}
