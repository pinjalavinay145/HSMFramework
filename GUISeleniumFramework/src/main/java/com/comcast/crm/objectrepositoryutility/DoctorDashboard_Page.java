package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboard_Page {
	
	WebDriver driver;
	public DoctorDashboard_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class=\"panel-body\"]/.././/a[@href='appointment-history.php']")
	private WebElement userName;
	
	public WebElement getuserName() {
		return userName;
	}
	//span[text()=' Patients ']
	@FindBy(xpath = "//span[text()=' Patients ']")
	private WebElement patientButton;
	
	public WebElement getpatientButton() {
		return patientButton;
	}
	//span[contains(text(),'Manage Patient')]
	@FindBy(xpath = "//span[contains(text(),'Manage Patient')]")
	private WebElement managePatient;
	
	public WebElement getmanagePatient() {
		return managePatient;
	}
	
	@FindBy(xpath = "//span[text()=' Appointment History ']")
	private WebElement appointmenthistoryLink;
	
	public WebElement getAppointmenthistoryLink() {
		return appointmenthistoryLink;
	}

	public void setAppointmenthistoryLink(WebElement appointmenthistoryLink) {
		this.appointmenthistoryLink = appointmenthistoryLink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPatientButton() {
		return patientButton;
	}

	public WebElement getManagePatient() {
		return managePatient;
	}
	
}
