package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNew {

	private static final CharSequence Laptop = null;

	public static void main(String[] args) throws InterruptedException {

	

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("laptop");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Brand']")).click();
        
		
		

	}

}
