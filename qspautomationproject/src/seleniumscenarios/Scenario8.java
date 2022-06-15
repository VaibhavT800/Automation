package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario8 {
public static void main(String[] args) throws InterruptedException {
	 
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Not now']")).click();
	WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
	Actions act = new Actions(driver);
	act.moveToElement(target);
	driver.findElement(By.xpath("//span[.='Kadas']")).click();
	driver.findElement(By.xpath(""));
	act.doubleClick();
	}
	}
