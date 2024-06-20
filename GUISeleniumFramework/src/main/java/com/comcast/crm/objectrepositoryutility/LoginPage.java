package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(name="user_name")                        // Rule-2 Object Creation
	private WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	     
	
	                                             
	public WebElement getUsernameEdt() {            //Rule-4 : Object Encapsulation
		return usernameEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 */
	 public void loginToapp(String url , String username , String password) {
		 waitForPageToLoad(driver);
		
		 HMSPatientLoginPage patient= new HMSPatientLoginPage(driver);
		 patient.loginToapp1(url,username,password);

	 }
		/*
		 * public void loginToDoctorModule( String username , String password) {
		 * waitForPageToLoad(driver);
		 * 
		 * HMSDoctorLogin_Page patient= new HMSDoctorLogin_Page(driver); //
		 * patient.loginToapp1(username,password);
		 * 
		 * }
		 */
	
	
}
