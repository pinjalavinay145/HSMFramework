package com.HMS.Patient;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.Vinay_BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.UserAppointmentHistory_Page;
import com.comcast.crm.objectrepositoryutility.UserBookAppointment_Page;
import com.comcast.crm.objectrepositoryutility.UserDashBoard_Page;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class ClickBookUpdate extends Vinay_BaseClass{
	@Test
	public void verifyMedicalHistoryVisible() throws Throwable {

		ExcelUtility ex= new ExcelUtility();
		String orthopedics = ex.getDataFromExcel("org", 5, 1);
		String doctorname = ex.getDataFromExcel("org", 5, 2);
		String date = jLib.getSystemDateYYYYDDMM();

		UserDashBoard_Page dashboard= new UserDashBoard_Page(driver);
		dashboard.clickbookAppointment();
		UserBookAppointment_Page appointmentpage=new UserBookAppointment_Page(driver);
		appointmentpage.bookAppointment(orthopedics,doctorname,date);



		dashboard.getAppointmenthistoryLink().click();

		UserAppointmentHistory_Page history= new UserAppointmentHistory_Page(driver);
		history.cancelAppointment();
		String header = history.getAppointemtnCanceledHHeadermsg().getText();
		assertEquals(header, "Your appointment canceled !!");
		Reporter.log("Your appointment canceled !!");

	}
}
