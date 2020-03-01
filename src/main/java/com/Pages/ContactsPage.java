package com.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.commonMethods;
import com.base.base;

public class ContactsPage extends base {
	
	public ContactsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='ui linkedin button'])[3]")
	WebElement newButton;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email;
	
	@FindBy(xpath="(//button[@class='ui linkedin button'])")
	WebElement Save;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	public void putValues(String arg1, String arg2, String arg3) throws InterruptedException, EncryptedDocumentException, IOException {
		newButton.click();
		firstName.sendKeys(arg1);
		lastName.sendKeys(arg2);
		email.sendKeys(arg3);
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(2000);
		Contacts.click();	
		
	}
}
