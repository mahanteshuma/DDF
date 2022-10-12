package org.auto.gb.Base;

import java.io.IOException;

import org.auto.gb.Utitlity.GbUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstants {

	public WebDriver driver;

	@BeforeMethod
	public void initiateDriverInstants() throws IOException {

		if (GbUtility.fetchproperty("browser").toString().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (GbUtility.fetchproperty("browser").toString().equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (GbUtility.fetchproperty("browser").toString().equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.get(GbUtility.fetchproperty("applicationURL").toString());
	}

	@AfterMethod
	public void closeDriverInstants() {
		driver.quit();
	}

}
