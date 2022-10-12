package org.auto.gb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class AddNewCustomers {
	public WebDriver driver;
	
	public AddNewCustomers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	WebElement Customername;
	
//	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]")
//	WebElement Gender;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	public void enterCust(String NCust) {
		Customername.sendKeys(NCust);
	}
	
	public void enterAdder(String add) {
		Address.sendKeys(add);
	}
	
	public void enterCity(String city) {
		City.sendKeys(city);
	}

}
