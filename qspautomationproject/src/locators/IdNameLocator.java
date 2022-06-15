package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vaibh/OneDrive/Desktop/html/username.html");
        driver.findElement(By.id("i1")).sendKeys("admin");
        driver.findElement(By.id("i2")).sendKeys("manager");
		
	}

}

