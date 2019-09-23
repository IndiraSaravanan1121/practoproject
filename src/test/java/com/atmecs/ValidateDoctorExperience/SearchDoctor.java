package com.atmecs.ValidateDoctorExperience;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;
import com.atmecs.PractoBookAppointment.Constants.Constants;
import com.atmecs.PractoBookAppointment.HelperClass.ClickOperation;
import com.atmecs.PractoBookAppointment.HelperClass.DeleteText;
import com.atmecs.PractoBookAppointment.HelperClass.ReadProperties;
import com.atmecs.PractoBookAppointment.Pages.HomePage;

public class SearchDoctor extends BaseClass{
	
	WebDriver driver;
	@Parameters({ "Location","Doctors" })
	@BeforeMethod
	public void searchDoctors(@Optional("chennai") String Location,@Optional("Dermatologist") String Doctors) throws Exception {
	
		DeleteText.text();
		
		HomePage.searchLocation().sendKeys(Location);
		ClickOperation.pressEnter();
		HomePage.searchDoctors().sendKeys(Doctors);
		ClickOperation.pressEnter();
		driver.findElement(By.xpath(ReadProperties.properties("loc_clickDoctors_txt",Constants.location_path))).click();
	}

}
