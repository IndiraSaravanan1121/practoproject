package com.atmecs.PractoBookAppointment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;
import com.atmecs.PractoBookAppointment.Constants.Constants;
import com.atmecs.PractoBookAppointment.HelperClass.ReadProperties;

public class HomePage extends BaseClass{
	
	public static WebElement searchLocation() throws Exception {
		WebElement element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_searchLocation_txt", Constants.location_path)));
		return element;
			}

	public static WebElement searchDoctors() throws Exception {
		WebElement element = driver
				.findElement(By.xpath(ReadProperties.properties("loc_searchDoctors_txt", Constants.location_path)));
		return element;
	}

}