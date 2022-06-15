package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	 WebElement Target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
	 Actions act=new Actions(driver);
		act.moveToElement(Target).perform();
		
		driver.findElement(By.xpath("//a[.='Diamond']")).click();
		
		 WebElement Target1 = driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"));
		 Actions act1=new Actions(driver);
			act.moveToElement(Target1).perform();
			
			//driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
			
			WebElement target2 = driver.findElement(By.xpath("//span[.='Price']"));
			act.moveToElement(target2).perform();
			Thread.sleep(2000);
			WebElement drp = driver.findElement(By.xpath("//span[.=' Popular ']"));
			drp.click();
			driver.findElement(By.xpath("\"//a[.='Price Low to High ']\"")).click();
					
}
}