package qsp;


import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserfirefox {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
		 public static void main(String[] args) {
	new FirefoxDriver();

}
}


