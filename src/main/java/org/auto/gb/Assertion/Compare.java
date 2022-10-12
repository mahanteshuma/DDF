package org.auto.gb.Assertion;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public static boolean validatePageUrl(WebDriver driver,String expURL) {
		boolean flog = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
			flog=true;
		}
		return flog;
	}

	public static boolean validatePageTitle(WebDriver driver,String expTitle) {
		boolean flog = false;
		if(driver.getTitle().equalsIgnoreCase(expTitle)) {
			flog=true;
		}
		return flog;
	}
}
