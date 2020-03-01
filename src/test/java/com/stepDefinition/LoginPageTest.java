package com.stepDefinition;

import com.Pages.LoginPage;
import com.base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class LoginPageTest extends base {
	
	public LoginPage login;
	
	public LoginPageTest() {
		
		super();
		
	}
	
	@Before("@LoginPage")
	public void setUp() {
		
		startBrowser();
		
		login = new LoginPage();
		
	}
	
	@Given("^Valid EmailId and Valid Password$")
	public void Valid_EmailId_and_Valid_Password() throws Throwable {
	    
		login.login();
		
	}
	
	@After("@LoginPage")
	public void tearDown() {
		
		driver.quit();
		
	}

}
