package methodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.navigate().to("https://www.google.com");
driver.switchTo().activeElement().sendKeys("java",Keys.ENTER); 
Navigation nav = driver.navigate();
nav.back();
Thread.sleep(3000);
nav.forward();
Thread.sleep(3000);
nav.refresh();


  
   
   
   
	}

}