package com.HMS.Patient;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.Vinay_BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.UserBookAppointment_Page;
import com.comcast.crm.objectrepositoryutility.UserDashBoard_Page;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class CLickAppointmentHistory extends Vinay_BaseClass{
	@Test
	public void verifyAppointmentHistory() throws Throwable {
		ExcelUtility ex= new ExcelUtility();
		 String orthopedics = ex.getDataFromExcel("org", 4, 1);
		 String doctorname = ex.getDataFromExcel("org", 4, 2);
		 String date = jLib.getSystemDateYYYYDDMM();
		 
		 
		UserDashBoard_Page dashboard= new UserDashBoard_Page(driver);
		dashboard.clickbookAppointment();
		UserBookAppointment_Page appointmentpage=new UserBookAppointment_Page(driver);
		appointmentpage.bookAppointment(orthopedics,doctorname,date);
		
		dashboard.getAppointmenthistoryLink().click();
		boolean returnValue=driver.findElement(By.xpath("//td[text()='Aditya']/..//td[contains(text(),'Active')]")).isDisplayed();
		Assert.assertTrue(returnValue);
		Reporter.log("message displayed sucessfully");
		UtilityClassObject.getTest().log(Status.PASS,"message displayed sucessfully");
	}

}//done
