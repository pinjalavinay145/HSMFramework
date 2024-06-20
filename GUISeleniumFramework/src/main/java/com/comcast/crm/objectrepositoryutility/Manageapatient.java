package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manageapatient {
	WebDriver driver;
	public Manageapatient(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	//a[@href="edit-patient.php?editid=72"]
	@FindBy(xpath = "//a[@href=\"edit-patient.php?editid=72\"]")
	private WebElement editButton;
	
	public WebElement geteditButton() {
		return editButton;
	}
	@FindBy(css = "[class=\"dropdown-toggle\"]")
	private WebElement profilrButton;
	
	public WebElement getprofilrButton() {
		return profilrButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement logoutButton;
	
	public WebElement getlogoutButton() {
		return logoutButton;
	}
	@FindBy(xpath = "//td[contains(text(),'Ripunadityasamantaray85@gmail.com')]")
	private WebElement patientAddedName;
	
	public WebElement getpatientAddedName() {
		return patientAddedName;
	}
}
