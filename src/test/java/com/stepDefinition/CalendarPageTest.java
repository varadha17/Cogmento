package com.stepDefinition;

import com.Pages.CalendarPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CalendarPageTest extends base {
	
	public LoginPage login;
	public HomePage home;
	public CalendarPage cal;
	
	public CalendarPageTest() {
		
		super();
		
	}
	
	@Before("@CalendarPage")
	public void setUp() throws InterruptedException {
		
		startBrowser();
		
		login = new LoginPage();
		
		home = login.login();
		
		cal = home.CalendarBoxClick();
		
	}
	
	@Given("^Click on today date$")
	public void Click_on_today_date() throws Throwable {
	    
		cal.ClickTodayDate();
		
	}
	
	@After("@CalendarPage")
	public void tearDown() {
		
		driver.close();
		
	}

}
