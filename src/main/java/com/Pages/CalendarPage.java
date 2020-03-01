package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.commonMethods;
import com.base.base;

public class CalendarPage extends base {

	public CalendarPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="rbc-date-cell rbc-now rbc-current")
	WebElement todaydate;
	
	public void ClickTodayDate() {
		
	}
	
}
