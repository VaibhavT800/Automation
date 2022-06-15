package keyWordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	private static final String CHROME_KEY = null;
	private static final String CHROME_VALUE = null;
	private static final String GECKO_KEY = null;
	private static final String GECKO_VALUE = null;
	static WebDriver driver;
	//method to open the browsers
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		//read the data from property file (browser)12334
		String browserValue = flib.readPropertyFile("./data/config.properties","browser");
		//read the data from property file (url)
		String url = flib.readPropertyFile("./data/config.properties", "url");
		//use the value of browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		}

		else
		{
			System.out.println("enter the correct choice");
		}


	}

	//method to close the browsers
	public void closeBrowser()
	{
		driver.quit();
	}

}



