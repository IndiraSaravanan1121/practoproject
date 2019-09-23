package com.atmecs.PractoBookAppointment.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;
import com.atmecs.PractoBookAppointment.Constants.Constants;
import com.atmecs.PractoBookAppointment.HelperClass.ReadProperties;
import com.atmecs.PractoBookAppointment.HelperClass.WebSiteValidation;

public class ValidationPage extends BaseClass{

	public void validateExperience(WebDriver driver) throws Exception {
	List<WebElement> data = driver.findElements(By.xpath(ReadProperties.properties("loc_experienceList_txt",Constants.location_path)));
	List<String> oldData = new ArrayList<String>();
	for (WebElement e : data) {
		oldData.add(e.getText());
	}
	List<String> sortedData = new ArrayList<String>(oldData);
	Collections.sort(sortedData);
	System.out.println(sortedData.equals(oldData));
	Assert.assertEquals(oldData, sortedData);
	WebSiteValidation.pageValidation(oldData, sortedData);
	
	
}
	

}
