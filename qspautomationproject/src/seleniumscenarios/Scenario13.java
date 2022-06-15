package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']")).click();
		
		 WebElement TargetToMouseHover = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/span[.='Offers']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(TargetToMouseHover).perform();
		 
		 driver.findElement(By.xpath("//span[@data-p='jewellery@filter@50+percent+making+charge+off!!']")).click();
		 driver.close();

	}

}
