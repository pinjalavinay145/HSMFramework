package com.HMS.Patient;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.Vinay_BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.EditProfilePage;
import com.comcast.crm.objectrepositoryutility.UserEditProfile_Page;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class ClickUpdateProfileButton extends Vinay_BaseClass{
	@Test
	public void verifyUpdateProfile() throws Throwable {
		ExcelUtility ex= new ExcelUtility();
		 String updatename = ex.getDataFromExcel("org", 5, 2)+jLib.getRandomNumber();
		 
		EditProfilePage ep= new EditProfilePage(driver);
		ep.updateProfile(updatename);
		
		UserEditProfile_Page edit= new UserEditProfile_Page(driver);
		String messagedata = edit.getprofileUpdatedMessage().getText();
		assertEquals(messagedata, "Your Profile updated Successfully");
        Reporter.log("profile updated message displayed");
    	UtilityClassObject.getTest().log(Status.PASS," profile updated message displayed");
	}

}//done
