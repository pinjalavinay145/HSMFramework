package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class UserAppointmentHistory_Page extends WebDriverUtility{
	WebDriver driver;
	public UserAppointmentHistory_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//td[text()='vinay']/..//a[@tooltip='Remove']")
	private WebElement cancelbutton;
	//p[contains(text(),'Your appointment canceled !!')]
	@FindBy(xpath = "//p[contains(text(),'Your appointment canceled !!')]")
	private WebElement appointemtnCanceledHHeadermsg;
	
	public WebElement getcancelbutton() {
		return cancelbutton;
	}
	
	public WebElement getAppointemtnCanceledHHeadermsg() {
		return appointemtnCanceledHHeadermsg;
	}

	public void cancelAppointment()
	{
		cancelbutton.click();
		switchtoAlertAndAccept(driver);
		
	}

}
