package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base;

public class LoginPage extends base {
	
	public LoginPage() {
		super();
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(css="div[class='ui fluid large blue submit button']")
	private WebElement Login;
	
	
	public HomePage login() throws InterruptedException {
		
		Email.sendKeys("varadharajan1792@gmail.com");
		Password.sendKeys("Anishabi@17");
		Login.click();
		Thread.sleep(5000);
		return new HomePage();
		
	}
	

}
