package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

public class BaseTest {

	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flibs fb = new Flibs();
		String url = fb.readPropertyFile("./data/config.properties","url");
		String browserValue = fb.readPropertyFile("./data/config.properties","browser");
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
		}
		else if(browserValue.equalsIgnoreCase("firefox"))    
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
		}
		else 
		{
			System.out.println("enter the correct choice");
		}
		
}
	
	public void tearDown()
	{
		driver.quit();
	}

}
	
