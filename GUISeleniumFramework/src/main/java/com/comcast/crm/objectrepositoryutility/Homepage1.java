package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	WebDriver driver;
	public Homepage1(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Logins']")
	private WebElement logins;
	
	public WebElement getlogins() {
		return logins;
	}
	


	@FindBy(xpath="//img[@src='assets/images/patient.jpg']/../..//button[text()='Click Here']")
	private WebElement patientLogin_ClickHere;
	
	public WebElement getpatientLogin_ClickHere() {
		return patientLogin_ClickHere;
	}
	public void clickPatientLoginButton() {
		patientLogin_ClickHere.click();
	}
	@FindBy(xpath = "//img[@src=\"assets/images/doctor.jpg\"]/../..//button[text()='Click Here']")
	private WebElement doctorLogin_ClickHere;
	
	public WebElement getdoctorLogin_ClickHere() {
		return doctorLogin_ClickHere;
	}
	public void clickDoctorLoginButton() {
		doctorLogin_ClickHere.click();
	}
	
	


}
