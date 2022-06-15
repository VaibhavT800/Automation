package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://pages.ebay.in/photocenter/");
	Thread.sleep(4000);
	driver.findElement(By.name("_nkw")).sendKeys("Apple Watches");
	WebElement dropdown = driver.findElement(By.id("gh-cat"));
	Select Sel = new Select(dropdown);
	Sel.selectByValue("14324");
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}
	}