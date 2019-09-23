package com.atmecs.PractoBookAppointment.HelperClass;

import java.util.List;

import org.testng.Assert;

public class WebSiteValidation {
	public static void pageValidation(List<String> oldData, List<String> sortedData) {
		try {
			Assert.assertEquals(oldData, sortedData);
			System.out.println(" Passed: " + " Expected: " + sortedData + " Actual: " + oldData);
		} catch (AssertionError assertionError) {
			System.out.println(" Failed: " + " Expected: " + sortedData + " Actual: " + oldData);
		}

	}
}
