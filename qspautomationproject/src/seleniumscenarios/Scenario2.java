package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

		public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("vaibhavyadav4884@gmail.com");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
}
}
