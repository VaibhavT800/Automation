package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeSaveBtn extends BaseTest {
public static void main(String[] args) throws IOException {
	
	BaseTest bt = new BaseTest();
	bt.setUp();//open the browser and launch the web app
	Flibs flib = new Flibs();
	
	//read the data from the property file by using generic reusable methods
	String validUsername = flib.readPropertyFile("./data/config.properties", "username");
	String validPassword = flib.readPropertyFile("./data/config.properties", "password");
	
	LoginPage lp = new LoginPage(driver);
	//perform login
	lp.actiTimevalidLogin(validUsername, validPassword);
	HomePage hp = new HomePage(driver);
	hp.clickSaveLeaveTimeBtn();
}
}