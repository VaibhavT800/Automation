package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath="//a[text()='logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement CreateNewTasks;
	@FindBy(linkText="settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	public WebElement getCreateNewTasks() {
		return CreateNewTasks;
	}
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getSaveLeaveTimeBtn1() {
		return saveLeaveTimeBtn;
	
	}

	//operational method

	
	public void clickLogout() {
		logoutLink.click();
		
	}
	
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}


	
		
	}


	
	



	

