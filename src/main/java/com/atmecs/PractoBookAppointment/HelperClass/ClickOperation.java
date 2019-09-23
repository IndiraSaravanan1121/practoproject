package com.atmecs.PractoBookAppointment.HelperClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.PractoBookAppointment.BaseClass.BaseClass;

public class ClickOperation extends BaseClass {
	static Actions action = new Actions(driver);

	public static void click() {
		click();
	}

	public static void pressEnter() {
		action.sendKeys(Keys.ENTER);
	}

	public static void pressTab() {
		action.sendKeys(Keys.TAB);
	}

	public static <LocatorType> boolean clickElement(LocatorType locator,String locatorValue) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		boolean isClicked = true;

		try {
			switch ("locator") {
			case "ClassName":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.className(locatorValue)).click();
				break;
			case "CssSelector":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.cssSelector(locatorValue)).click();
				break;
			case "Id":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.id(locatorValue)).click();
				break;
			case "LinkText":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.linkText(locatorValue)).click();
				break;
			case "Name":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.name(locatorValue)).click();
				break;
			case "PARTIALLINKTEXT":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.partialLinkText(locatorValue)).click();
				break;
			case "TAGNAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.tagName(locatorValue)).click();
				break;
			case "XPath":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.xpath(locatorValue)).click();
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			isClicked = false;

		} catch (NullPointerException nullPointerException) {
			isClicked = false;

		} catch (Exception e) {
			isClicked = false;
		}

		return isClicked;

	}
}