package com.Utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.base;

public class commonMethods extends base {

	static String val;

	/**
	 * Alert interface
	 */
	public static void acceptAlert() {
		try {
			Alert accept = driver.switchTo().alert();
			accept.accept();
		} catch (NoAlertPresentException nae) {
			System.out.println(nae.fillInStackTrace());
		}
	}

	public static void declineAlert() {
		try {
			Alert decline = driver.switchTo().alert();
			decline.dismiss();
		} catch (NoAlertPresentException nae) {
			System.out.println(nae.fillInStackTrace());
		}
	}

	public static void SenddataintoAlertTextbox(String data) {
		try {
			Alert enterData = driver.switchTo().alert();
			enterData.sendKeys(data);
		} catch (NoAlertPresentException nae) {
			System.out.println(nae.fillInStackTrace());
		}
	}

	public static void getTextAlert() {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}

	/**
	 * Select class
	 * 
	 * @param wle
	 * @param index
	 */

	public static void selectIndex(WebElement wle, int index) {

		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.selectByIndex(index);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void selectText(WebElement wle, String visibleText) {

		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.selectByVisibleText(visibleText);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void selectValue(WebElement wle, String value) {

		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.selectByValue(value);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void deselectIndex(WebElement wle, int index) {
		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.deselectByIndex(index);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void deselectText(WebElement wle, String visibleText) {

		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.deselectByVisibleText(visibleText);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void deselectValue(WebElement wle, String value) {

		try {
			if (wle != null) {
				Select dd = new Select(wle);
				dd.deselectByValue(value);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Window Handling
	 */

	public static void switchtoChildWindow() {
		try {
			for (String winHandlesAfter : driver.getWindowHandles()) {
				driver.switchTo().window(winHandlesAfter);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void switchtoParentWindow() {
		try {
			String winHandlesBefore = driver.getWindowHandle();
			for (String winHandlesAfter : driver.getWindowHandles()) {
				if (!winHandlesAfter.equalsIgnoreCase(winHandlesBefore)) {
					driver.switchTo().window(winHandlesAfter);
					driver.close();
				}
			}
			driver.switchTo().window(winHandlesBefore);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void defaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void activeElement() {
		try {
			driver.switchTo().activeElement();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	/**
	 * List of WebElement
	 * 
	 * @param ele
	 * @param arg0
	 * @param elem
	 */
	public static void listofWebElement(List<WebElement> ele, String arg0, WebElement elem) {

		
		  try { 
			  for(WebElement wb : ele) 
			  { 
				  String totalElements = wb.getText();
				  	if(totalElements.equalsIgnoreCase(arg0)) 
				  		{ 
				  		elem.click(); 
				  		Thread.sleep(5000);
				  		} 
				  	System.out.println(wb.getText()); } }
		  catch(Exception e) {
			  System.out.println(e.getMessage()); }
		
//		  ele = new ArrayList<WebElement>(); ele.stream().forEach(wb -> {
//		  if(wb.getText().equalsIgnoreCase(arg0)) { elem.click(); System.out.println(wb.getText()); try {
//		  Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
//		  } });
		 
	}

	/**
	 * Frame
	 * 
	 * @param count
	 * @param frame
	 */
	public static void movetoIFrame(WebElement frame) {
		try {
			if (frame != null)
				driver.switchTo().frame(frame);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Action Class
	 * 
	 * @param target
	 * @param source
	 */
	public static void mouseMoveOperation(WebElement target) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void dragAndDropOperation(WebElement target, WebElement source) {
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void doubleClickOperation(WebElement target) {
		try {
			Actions act = new Actions(driver);
			act.doubleClick(target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void rightClickOpertion(WebElement target) {
		try {
			Actions act = new Actions(driver);
			act.contextClick(target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Remove Spaces
	 * 
	 * @param trim
	 */
	public static void removeSpacesBeforeandAfter(String trim) {

		System.out.println(trim.trim());

	}

	/**
	 * isDispalyed(), isEnabled(), isSelected()
	 * 
	 * @param wle
	 */
	public static void IsDisplayed(WebElement wle) {
		try {
			if (wle != null) {
				boolean status = wle.isDisplayed();
				System.out.println(status);
			}
		} catch (Exception e) {
			throw new ElementNotVisibleException("Element not Dispalyed");
		}
	}

	public static void IsSelected(WebElement wle) {
		try {
			if (wle != null) {
				boolean status = wle.isSelected();
				System.out.println(status);
			}
		} catch (Exception e) {
			throw new ElementNotSelectableException("Element not selected");
		}
	}

	public static void IsEnabled(WebElement wle) {
		try {
			if (wle != null) {
				boolean status = wle.isEnabled();
				System.out.println(status);
			}
		} catch (Exception e) {
			throw new ElementNotInteractableException("Element not Enabled");
		}
	}

	/**
	 * Scroll down
	 * 
	 * @param start
	 * @param end
	 */
	public static void scrollDown() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(10,500)");

	}

	/**
	 * Split Function
	 * 
	 * @param split
	 * @return
	 */
	public static void splitFunction(String split) {
		try {
			for (int i = 0; i < 2; i++) {
				String val = split.split(",")[i];
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Explicit wait
	 * 
	 * @param element
	 * @param timeout
	 */
	public static void waitDriver(WebElement element, int timeout) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			throw new ElementNotInteractableException("Element not clicked");
		}
	}

	/**
	 * Highlight WebElement
	 * 
	 * @param color
	 * @param element
	 * @param driver
	 */
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	/**
	 * Argument split
	 * 
	 * @param filter
	 * @param element
	 */
	public static void splitFunctionBDD(String filter, By element) {
		for (int i = 0; i < filter.split(",").length; i++) {
			WebElement wle = driver.findElement(element);
			wle.click();
		}

	}

}