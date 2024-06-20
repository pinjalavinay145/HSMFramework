package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class UserDashBoard_Page {
	WebDriver driver;
	public UserDashBoard_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath  ="//a[@class=\"dropdown-toggle\"]")
	private WebElement userprofile;
	
	public WebElement getuserprofile() {
		return userprofile;
	}
	
		
	@FindBy(xpath = "//a[@href=\"logout.php\"]" )
	private WebElement logoutButton;
	
	public WebElement getlogoutButton() {
		return logoutButton;
	}
	
	@FindBy(xpath = "(//a[@href='edit-profile.php'])[2]")
	private WebElement updateProfileLink;
	
	public WebElement getupdateProfileLink() {
		return updateProfileLink;
	}
	@FindBy(xpath = "//span[text()=' Appointment History ']")
	private WebElement appointmenthistoryLink;
	
	public WebElement getAppointmenthistoryLink() {
		return appointmenthistoryLink;
	}
	
	
	
	@FindBy(css = "[href=\"book-appointment.php\"]")
	private WebElement bookAppointment;
	
	public WebElement getbookAppointment() {
		return bookAppointment;
	}
	public void clickbookAppointment() {
		bookAppointment.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Medical History')]")
	private WebElement medicalHistoryButton;
	
	public WebElement getmedicalHistoryButton() {
		return medicalHistoryButton;
	}
	public void clickmedicalHistoryButton() {
		medicalHistoryButton.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),' Dashboard ')]")
	private WebElement dashBoardButton;
	
	public WebElement getdashBoardButton() {
		return dashBoardButton;
	}
	public void clickdashBoardButton() {
		dashBoardButton.click();
	}
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	private WebElement userProfilename;
	
	public WebElement getuserProfilename() {
		return userProfilename;
	}
	
	public void userLogout()
	{
		userprofile.click();
		logoutButton.click();
	}
}
