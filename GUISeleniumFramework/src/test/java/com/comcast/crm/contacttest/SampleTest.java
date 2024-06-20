package com.comcast.crm.contacttest;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.Vinay_BaseClass;
/**
 * 
 * @author Deepak
 *
 */
public class SampleTest extends Vinay_BaseClass {

	@Test(groups = {"smokeTest"})
	public void createConTactTest() throws Throwable {		
		/* read testScritp data from Excel file*/
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();

	
	}

}
