package seleniumscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		
		// Drag and Drop
		WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		// Action class
		Actions act = new Actions(driver);
		act.dragAndDrop(src,dest).perform();
		
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8888365635");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		
	
}
}