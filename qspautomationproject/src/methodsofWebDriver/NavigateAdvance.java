package methodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAdvance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.navigate().to("https://www.google.com/");
   driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
   driver.navigate().back();
   Thread.sleep(3000);
   driver.navigate().forward();
   Thread.sleep(3000);
   driver.navigate().refresh();
   
   
	}

}
