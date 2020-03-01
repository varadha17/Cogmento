package com.stepDefinition;

import com.Pages.ContactsPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class ContactsPageTest extends base {
	
	public LoginPage login;
	public HomePage home;
	public ContactsPage contact;
	
	public ContactsPageTest() {
		super();
	}
	
	@Before("@ContactsPage")
	public void setUp() throws InterruptedException {
		
		startBrowser();
		
		login = new LoginPage();
		
		home = login.login();
		
		contact = home.ContactsBoxClick();
	}
	
	@Given("^Send firstName \"([^\"]*)\" lastName \"([^\"]*)\" and Email \"([^\"]*)\"$")
	public void Send_firstName_lastName_and_Email(String arg1, String arg2, String arg3) throws Throwable {
	    
		contact.putValues(arg1, arg2, arg3);
	}
	
	@After("@ContactsPage")
	public void tearDown() {
		
		driver.quit();
	}

}
