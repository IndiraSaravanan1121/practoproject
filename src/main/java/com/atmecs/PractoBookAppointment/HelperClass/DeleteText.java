package com.atmecs.PractoBookAppointment.HelperClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;
import com.atmecs.PractoBookAppointment.Constants.Constants;

public class DeleteText extends BaseClass {

	public static void text() throws Exception {
		WebElement toClear = driver
				.findElement(By.xpath(ReadProperties.properties("loc_searchLocation_txt", Constants.location_path)));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
	}
}
