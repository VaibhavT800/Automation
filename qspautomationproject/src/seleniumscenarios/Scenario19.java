package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
	   
		Thread.sleep(3000);
		
		 WebElement TargetToMouseHover = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(TargetToMouseHover).perform();
			driver.findElement(By.xpath("//a[@title='Gold Coins']")).click();
		  Thread.sleep(3000);
		  
		  WebElement TargetToMouseHover1 = driver.findElement(By.xpath("//div[@class='filter 5gms']"));
			 Actions act1=new Actions(driver);
			 act.moveToElement(TargetToMouseHover1).perform();
			 driver.findElement(By.xpath("https://kinclimg6.bluestone.com/f_webp,c_scale,w_515,b_rgb:ffffff/product/5gms995LM_YAA24XXXXXXXXXXXX_ABCD00-fr-1024-v5.jpg")).click();
			 driver.close();
	}	  
	}