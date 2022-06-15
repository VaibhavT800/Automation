package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGDataProvider {
  WebDriver driver;
 
  @BeforeMethod
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver","./drives/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=2nuhsw0s9mqe6");
  }
@DataProvider(name="testActiTimeData")
public Object[][] dataprovider()
{
	Object[][] data=new Object[5][2];
	data[0][0]="admin1";
	data[0][1]="manager123";
	
	data[1][0]="ad min";
	data[1][1]="manager 123";
	
	data[2][0]="xcg648";
	data[2][1]="@#744";
	
	data[3][0]="428";
	data[3][1]="admin";
	
	data[0][0]="156";
	data[0][1]="admin";
	
	
	
	return data;
	}
@Test (dataProvider="testActiTimeData")
public void loginToActiTime(String username, String password) throws InterruptedException
{
	Thread.sleep(3000);



}
  @AfterMethod
  public void afterMethod() {
  }

}
