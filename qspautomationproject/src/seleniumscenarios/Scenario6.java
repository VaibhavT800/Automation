package seleniumscenarios;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[.='Diamond']")).click();
		WebElement Drp = driver.findElement(By.xpath("//span[.='Price']"));
		Drp.click();
		
		Select sel = new Select (Drp);
		List<WebElement> opts = sel.getOptions();
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		for(int i=0;i<opts.size();i++)
		{
		WebElement ops = opts.get(i);
		String text = ops.getText();
		//add the text to set so that duplicates won't be accepted
		//order of insertion is maintained
		s.add(text);
		}
		//read the set
		for(String selenium :s)
		{
		System.out.println(selenium);
		}
		

	}

	}
	
