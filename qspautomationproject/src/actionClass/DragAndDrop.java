package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		    
		      WebElement src = driver.findElement(By.xpath("//li[@id='credit3']"));
		      WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart1']"));
		      
		     Actions act = new Actions(driver);
		     act.dragAndDrop(src, target).perform();

	}

}