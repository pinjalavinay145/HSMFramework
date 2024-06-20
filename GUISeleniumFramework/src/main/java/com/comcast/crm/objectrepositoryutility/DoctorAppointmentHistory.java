package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorAppointmentHistory {
	WebDriver driver;
	public DoctorAppointmentHistory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//td[text()='vinaykumar']/.. //td[contains(text(),'Active')]")
	private WebElement patientName;
	
	public WebElement getpatientName() {
		return patientName;
	}
	

}
