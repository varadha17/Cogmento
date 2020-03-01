package com.stepDefinition;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class HomePageTest extends base {

	public LoginPage login;
	public HomePage home;
	
	public HomePageTest() {
		
		super();
		
	}
	
	@Before("@HomePage")
	public void setUp() throws InterruptedException {
		
		startBrowser();
		
		login = new LoginPage();
		
		home = login.login();
		
	}
	

	@Given("^Click on Calendar icon$")
	public void Click_on_Calendar_icon() throws Throwable {
	 
		home.CalendarBoxClick();
		
	}
	
	@Given("^Click on Contacts icon$")
	public void Click_on_Contacts_icon() throws Throwable {
	   
		home.ContactsBoxClick();
		
	}

	@Given("^Click on Companies icon$")
	public void Click_on_Companies_icon() throws Throwable {
	    
		home.CompaniesBoxClick();
		
	}
	
	@After("@HomePage")
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
