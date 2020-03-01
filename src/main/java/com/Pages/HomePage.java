package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.commonMethods;
import com.base.base;

public class HomePage extends base {
	
	public HomePage() {
		
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement Calendar;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement Companies;
	
	@FindBy(xpath="(//div[@id='main-nav'])//following-sibling::a")
	List<WebElement> ele;
	
	
	public CalendarPage CalendarBoxClick() {
		
		commonMethods.listofWebElement(ele, "Calendar", Calendar);
		
		return new CalendarPage();
	}
	
	public ContactsPage ContactsBoxClick() {
		
		commonMethods.listofWebElement(ele, "Contacts", Contacts);
		
		return new ContactsPage();
	}
	
	public CompaniesPage CompaniesBoxClick() {
		
		commonMethods.listofWebElement(ele, "Companies", Companies);
		
		return new CompaniesPage();
	}

}
