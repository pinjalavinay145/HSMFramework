package com.HMS.Patient;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.Vinay_BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.DoctorAppointmentHistory;
import com.comcast.crm.objectrepositoryutility.DoctorDashboard_Page;
import com.comcast.crm.objectrepositoryutility.HMSDoctorLogin_Page;
//import com.comcast.crm.objectrepositoryutility.HMSPatientLoginPage;
import com.comcast.crm.objectrepositoryutility.UserBookAppointment_Page;
import com.comcast.crm.objectrepositoryutility.UserDashBoard_Page;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class ClickBookAppointmentModule extends Vinay_BaseClass{
	@Test
	public void verifyBookAppointmentmodule() throws Throwable {
		
		
		Thread.sleep(5000);

		
		ExcelUtility ex= new ExcelUtility();
		 String orthopedics = ex.getDataFromExcel("org", 4, 1);
		 String doctorname = ex.getDataFromExcel("org", 4, 2);
		 String date = jLib.getSystemDateYYYYDDMM();
		 
		 String doctorloginusername = ex.getDataFromExcel("org", 13, 0);
		 String doctorloginpassword = ex.getDataFromExcel("org", 13, 1);

		UserDashBoard_Page dashboard= new UserDashBoard_Page(driver);
		dashboard.clickbookAppointment();
		UserBookAppointment_Page appointmentpage=new UserBookAppointment_Page(driver);
		appointmentpage.bookAppointment(orthopedics,doctorname,date);
		configAM();
		HMSDoctorLogin_Page doclogin= new HMSDoctorLogin_Page(driver);
		doclogin.docLogin(doctorloginusername, doctorloginpassword);
		
		DoctorDashboard_Page docdash= new DoctorDashboard_Page(driver);
		docdash.getAppointmenthistoryLink().click();
		DoctorAppointmentHistory app=new DoctorAppointmentHistory(driver);
		boolean savedusername = app.getpatientName().isDisplayed();
		Assert.assertTrue(savedusername);
		Reporter.log("profile updated message displayed sucessfully");
		UtilityClassObject.getTest().log(Status.PASS," profile updated message displayed sucessfully");
	}

}//done
