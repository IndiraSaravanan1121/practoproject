package com.atmecs.PractoBookAppointment.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.atmecs.PractoBookAppointment.Constants.Constants;

public class BaseClass {
	
	protected static WebDriver driver;
	public static Properties property;
	public FileInputStream fis;

	@BeforeTest
	public void setup() throws IOException {

		fis = new FileInputStream(Constants.configProperties_path);
		property = new Properties();
		property.load(fis);

		switch (property.getProperty("browsername")) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.chrome_path);
			driver = new ChromeDriver(); // create new instance for chrome driver
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.firefox_path);
			driver = new FirefoxDriver(); // create new instance for firefox driver
			break;

		case "IEDriver":
			System.setProperty("webdriver.gecko.driver", Constants.iedriver_path);
			driver = new InternetExplorerDriver(); // create new instance for ie driver
			break;
		}

		// pass application URL
		driver.get(property.getProperty("url"));

		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
