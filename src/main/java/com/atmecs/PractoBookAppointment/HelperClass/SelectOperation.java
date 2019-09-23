package com.atmecs.PractoBookAppointment.HelperClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;
import com.atmecs.PractoBookAppointment.Constants.Constants;

public class SelectOperation extends BaseClass{
	
	public static void selectDropDown() throws IOException {
		WebElement selectExperience = driver.findElement(By.xpath(ReadProperties.properties("loc_experience_btn", Constants.location_path)));
		Select experience = new Select(selectExperience);
		experience.selectByValue("3");
	}

}
