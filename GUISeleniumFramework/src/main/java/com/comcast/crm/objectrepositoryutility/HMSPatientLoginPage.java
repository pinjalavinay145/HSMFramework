package com.comcast.crm.objectrepositoryutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class HMSPatientLoginPage extends WebDriverUtility{
	 WebDriver driver;
		public Homepage1 hp;
	public HMSPatientLoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username")
	private WebElement userName;
	
	public WebElement getuserName() {
		return userName;
	}
	@FindBy(css = "[class=\"form-control password\"]")
	private WebElement passWord;
	
	public WebElement getpassWord() {
		return passWord;
	}
	@FindBy(name = "submit")
	private WebElement loginButton;
	
	public WebElement getloginButton() {
		return loginButton;
	}
	public void ClickLoginButton() {
		loginButton.click();
		
	}
	public void sendValueInUserName() {
		userName.sendKeys("vinay140596@gmail.com");
		
	}
	public void sendValueInPassWord() {
		passWord.sendKeys("vinay@145");
		
	}
	public void loginToapp( String username , String password) {
		 waitForPageToLoad(driver);
		// driver.get(url);	
		// driver.manage().window().maximize();
		 
	 }
	/*
	 * Author vinay
	 * Created 19-06-2024
	 * Description this method will make patient to login
	 */
	public void loginToapp1(String url,String username,String password) {
		 driver.manage().window().maximize();
		 waitForPageToLoad(driver);
		 driver.get(url);	
		 hp=new Homepage1(driver);
		 hp.getpatientLogin_ClickHere().click();
		
		 Set<String> allIds = driver.getWindowHandles();
		 
		 for(String id : allIds) {
			 driver.switchTo().window(id);
			 if(driver.getTitle().contains("User-Login")) {
				 break;
			 }
		 }
		 HMSPatientLoginPage lofinpage= new HMSPatientLoginPage(driver);
		lofinpage.getuserName().sendKeys(username);
		 lofinpage.getpassWord().sendKeys(password);
		 getloginButton().click();
	 }
	
	
	
	
}
