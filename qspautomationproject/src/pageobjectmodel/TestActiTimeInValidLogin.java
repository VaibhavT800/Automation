package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



public class TestActiTimeInValidLogin extends BaseTest {
public static void main(String[] args) throws IOException {
	
	BaseTest bt = new BaseTest();
	bt.setUp();
	Flibs flib =new Flibs();
	LoginPage lp = new LoginPage(driver);
	
	int rc = flib.getRowCount("./data/ActiTimeTestData.xlsx","invalidcreds");
	
	for(int i=1;i<=rc;i++)
	{
		String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 0);
		String invalidpassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 1);
		
		lp.actiTimeInvalidLogin(invalidUsername, invalidpassword);
		
	}
	
	bt.tearDown();
	
}
}
