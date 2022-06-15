package seleniumscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
		   driver.navigate().to("https://www.gmail.com");
		   driver.findElement(By.id("identifierId")).sendKeys("vaibhavyadav4884@gmail.com");
		   driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		   
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8888365635");
		   driver.findElement(By.xpath("//span[.='Next']")).click();
		   
		   
	}

}
