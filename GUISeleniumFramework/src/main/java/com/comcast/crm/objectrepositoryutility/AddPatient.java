package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatient {
	WebDriver driver;
	public AddPatient(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h1[text()='Patient | Add Patient']")
	private WebElement addpatientHeader;
	
	@FindBy(name = "patname")
	private WebElement patientnameEdt;
	@FindBy(name = "patcontact")
	private WebElement patientcontactEdt;
	@FindBy(name = "patemail")
	private WebElement patientemailEdt;
	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement gender;
	
	@FindBy(name = "pataddress")
	private WebElement patientadsressEdt;
	
	@FindBy(name = "patage")
	private WebElement patientageEdt;
	
	@FindBy(name = "medhis")
	private WebElement patientmedhistoryEdt;
	
	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	public WebElement getAddpatientHeader() {
		return addpatientHeader;
	}

	public void setAddpatientHeader(WebElement addpatientHeader) {
		this.addpatientHeader = addpatientHeader;
	}
/*
 * Author vinay
 * Created 19-06-2024
 * Description this method will add Doctor patient with details
 */
	public void doctorAddPatient(String name,String contact,String email,String add, String age,String his)
	{
		patientnameEdt.sendKeys(name);
		patientcontactEdt.sendKeys(contact);
		patientemailEdt.sendKeys(email);
		patientadsressEdt.sendKeys(add);
		patientageEdt.sendKeys(age);
		patientmedhistoryEdt.sendKeys(his);
		submitBtn.click();
	}}
