package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
	    TimeUnit thread;
		Thread.sleep(3000);
		
		 WebElement TargetToMouseHover = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(TargetToMouseHover).perform();
		driver.findElement(By.xpath("//a[@title='Gold Coins']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='filter 20gms']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
