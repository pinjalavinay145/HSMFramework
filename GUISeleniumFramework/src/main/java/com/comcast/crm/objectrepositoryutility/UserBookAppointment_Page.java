package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class UserBookAppointment_Page  extends WebDriverUtility{
	WebDriver driver;
	WebDriverUtility webdriverutility= new WebDriverUtility();
	public UserBookAppointment_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h1[text()='User | Book Appointment']")
	private WebElement bookappointmentHeader;
	@FindBy(name = "Doctorspecialization")
	private WebElement doctorSpeciializationDropdown;
	@FindBy(name = "doctor")
	private WebElement doctorsDropdown;
	@FindBy(name = "appdate")
	private WebElement appdate;
	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	public WebElement getBookappointmentHeader() {
		return bookappointmentHeader;
	}
	

	public WebElement getDoctorSpeciializationDropdown() {
		return doctorSpeciializationDropdown;
	}


	public WebElement getDoctorsDropdown() {
		return doctorsDropdown;
	}


	public WebElement getAppdate() {
		return appdate;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	@FindBy(xpath =  "//td[text()='Aditya']/..//td[contains(text(),'Active')]")
	private WebElement doctorName;
	
	public WebElement getdoctorName() {
		return doctorName;
	}


	/*
	 * Author vinay
	 * Created 19-06-2024
	 * Description this method will bookAn appointment
	 */
	public void bookAppointment(String doctorspecialization, String doctorname, String date) throws InterruptedException
	{
	  select(doctorSpeciializationDropdown, doctorspecialization);
	  select(doctorsDropdown, doctorname);
	  appdate.sendKeys(date);
	  submitBtn.click();
	  switchtoAlertAndAccept(driver);
	}
	}
