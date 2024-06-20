package com.HMS.Patient;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.Vinay_BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AddPatient;
import com.comcast.crm.objectrepositoryutility.DoctorDashboard_Page;
import com.comcast.crm.objectrepositoryutility.HMSDoctorLogin_Page;
import com.comcast.crm.objectrepositoryutility.HMSPatientLoginPage;
import com.comcast.crm.objectrepositoryutility.Homepage1;
import com.comcast.crm.objectrepositoryutility.Manageapatient;
import com.comcast.crm.objectrepositoryutility.UserDashBoard_Page;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class ClickMedicalHistoryModule extends Vinay_BaseClass{
	@Test
	public void checkMedicalHistory() throws Throwable {
		
		//System.out.println("hi");
		
		ExcelUtility excel= new ExcelUtility();
		String doctorusermailid = excel.getDataFromExcel("org", 13, 0);
		String poctorpassword = excel.getDataFromExcel("org", 13, 1);
		
		String patientname = excel.getDataFromExcel("org", 14, 0);
		String patientContact = excel.getDataFromExcel("org", 14, 1);
		String patientEmail = excel.getDataFromExcel("org", 14, 2);
		String patientaddress = excel.getDataFromExcel("org", 14, 3);
		String patientedit = excel.getDataFromExcel("org", 14, 4);
		String patientHistory = excel.getDataFromExcel("org",14,5);
		
		configAM();
		HMSDoctorLogin_Page doc = new HMSDoctorLogin_Page(driver);
		doc.docLogin(doctorusermailid, poctorpassword);
		
		DoctorDashboard_Page doc1= new DoctorDashboard_Page(driver);
		doc1.getpatientButton().click();
		doc1.getmanagePatient().click();
		Manageapatient mp= new Manageapatient(driver);
		mp.geteditButton().click();
		AddPatient ap= new AddPatient(driver);
		ap.doctorAddPatient(patientname, patientContact, patientEmail, patientaddress, patientedit, patientHistory);
		mp.getprofilrButton().click();
		mp.getlogoutButton().click();
		doc.docLogin(doctorusermailid, poctorpassword);
		doc1.getpatientButton().click();
		doc1.getmanagePatient().click();
		boolean diaplayname = mp.getpatientAddedName().isDisplayed();
		Assert.assertTrue(diaplayname);
		 Reporter.log("message displayed sucessfully");
			UtilityClassObject.getTest().log(Status.PASS," message displayed sucessfully");
	}
}//done
