package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1Refractor {
	@Test(description = "This method performs login operation")
	public void login()
	{
		Reporter.log("Login is performed",true);

	}
}