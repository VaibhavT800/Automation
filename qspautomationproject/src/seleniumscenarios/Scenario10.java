package seleniumscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario10 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//body[@class='page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker']")).click();
	driver.findElement(By.xpath("//div[@id='widget-global-4vsephwmhgk']"));
	driver.findElement(By.xpath("widet-global-4vsephwmhgk")).sendKeys("Vaibhav");
	driver.findElement(By.id("//input[@id='email']")).sendKeys("vaibhavyadav4884");
	driver.findElement(By.xpath("//input[@id='c53kwpaa0v4_146917605549304831']")).sendKeys("8888365635");
	driver.findElement(By.xpath("//span[.='Start the chat']")).click();
	
	System.out.println("replay");
}
}
