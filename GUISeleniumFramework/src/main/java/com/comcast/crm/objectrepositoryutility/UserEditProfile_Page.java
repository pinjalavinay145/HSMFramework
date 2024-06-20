package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditProfile_Page {
	WebDriver driver;
	public UserEditProfile_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[name=\"fname\"]")
	private WebElement userNameTextField;
	
	public WebElement getuserNameTextField() {
		return userNameTextField;
	}
	public void sendUserNameTextField(String key) {
		userNameTextField.sendKeys(key);
	}
	@FindBy(css = "[name=\"address\"]")
	private WebElement addressTextField;
	
	public WebElement getaddressTextField() {
		return addressTextField;
	}
	public void sendAddressTextField(String key) {
		addressTextField.sendKeys(key);
	}
	
	@FindBy(css = "[name=\"city\"]")
	private WebElement cityTextField;
	
	public WebElement getcityTextField() {
		return cityTextField;
	}
	public void sendCityTextField(String key) {
		cityTextField.sendKeys(key);
	}
	@FindBy(css = "[name=\"uemail\"]")
	private WebElement userEmailTextField;
	
	public WebElement getuserEmailTextField() {
		return userEmailTextField;
	}
	public void sendEmailTextField(String key) {
		userEmailTextField.sendKeys(key);
	}
	
	@FindBy(xpath =  "//button[@type=\"submit\"]")
	private WebElement updateButton;
	
	public WebElement getupdateButton() {
		return updateButton;
	}
	public void clickUpdateButton() {
		updateButton.click();
	}
	
	@FindBy(xpath ="//h5[contains(text(),'Your Profile updated Successfully')]")
	private WebElement profileUpdatedMessage;
	
	public WebElement getprofileUpdatedMessage() {
		return profileUpdatedMessage;
	}
}
