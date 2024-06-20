package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {
	WebDriver driver;
	public EditProfilePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="[name=\"fname\"]")
	private WebElement userName;
	
	public WebElement getuserName() {
		return userName;
	}

	@FindBy(name ="submit")
	private WebElement submitButton;
	
	public WebElement getsubmitButton() {
		return submitButton;
	}
	public void updateProfile(String name)
	{
		UserDashBoard_Page udp= new UserDashBoard_Page(driver);
		udp.getupdateProfileLink().click();
		userName.clear();
		userName.sendKeys(name);
		submitButton.click();
	}

}
