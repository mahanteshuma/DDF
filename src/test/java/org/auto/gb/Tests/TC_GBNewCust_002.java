package org.auto.gb.Tests;

import org.auto.gb.Base.DriverInstants;
import org.auto.gb.Datagenetor.DataGeneretor;
import org.auto.gb.Pages.AddNewCustomers;
import org.auto.gb.Pages.GbLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GBNewCust_002 extends DriverInstants {
	@Test(dataProvider = "LoginData",dataProviderClass=DataGeneretor.class)
	public void tc_gblogin_001(String uname, String pwd) {
		GbLoginPage login = new GbLoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pwd);
		login.clickButton();

		// Compare.validatePageUrl(driver, "https://demo.guru99.com/V1/index.php");
		// Compare.validatePageTitle(driver, "GTPL Bank Home Page");
		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
            login.Logout();
            driver.switchTo().alert().accept();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			driver.switchTo().alert().accept();
		}
	}
	
	    @Test(dataProvider = "NewCoust",dataProviderClass=DataGeneretor.class)	
		public void tc_GBNewCust_002(String Ncust,String Add, String city) {
		
		AddNewCustomers ANC=new AddNewCustomers(driver);
		ANC.enterCust(Ncust);
		ANC.enterAdder(Add);
		ANC.enterCity(city);
		
		}
	}
	
