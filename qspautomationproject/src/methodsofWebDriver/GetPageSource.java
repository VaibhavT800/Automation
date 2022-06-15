package methodsofWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vaibh/OneDrive/Desktop/html/creationoftable.html");
		String SourceCodeOfTheWebPage = driver.getPageSource();
		System.out.println(SourceCodeOfTheWebPage);

	}

}
          