package org.auto.gb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GbLoginPage {
	
	 public WebDriver driver;
	public GbLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement logoutBotton;
	
	
	
	public void enterUsername(String uname) {
		userid.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickButton() {
		loginbutton.click();
	}
	
	public void Logout() {
		logoutBotton.click();
	}

}
