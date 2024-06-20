package com.comcast.crm.objectrepositoryutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class HMSDoctorLogin_Page extends WebDriverUtility {
	WebDriver driver;
	public HMSDoctorLogin_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement userName;
	
	public WebElement getuserName() {
		return userName;
	}
	@FindBy(css="[name='password']")
	private WebElement password;
	
	public WebElement getpassword() {
		return password;
	}
	
	@FindBy(name="submit")
	private WebElement loginButton;
	
	public WebElement getloginButton() {
		return loginButton;
	}
	public void loginButtonClick() {
		loginButton.click();
		
	}
	/*
	 * Author vinay
	 * Created 19-06-2024
	 * Description this method will make doctor to login
	 */
	public void docLogin(String username, String pass)
	{
		Homepage1 hp= new Homepage1(driver);
		hp.getdoctorLogin_ClickHere().click();
		switchToTabOnTitle(driver, "doctor");
       userName.sendKeys(username);
		password.sendKeys(pass);
		loginButton.click();
		
	}
}
