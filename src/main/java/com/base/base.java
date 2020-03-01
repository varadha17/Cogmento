package com.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public base() {
		
		prop = new Properties();
		
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\cogmentoProject\\src\\main\\java\\com\\Properties\\config.properties");
		prop.load(fis);
		} catch(Exception e) {
			System.out.println(e.getMessage());	
		}	
	}
	
	public static void startBrowser() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\cogmentoProject\\Drivers\\Chrome-V80\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\cogmentoProject\\Drivers\\Firefox\\geckodriver.exe");
			
		} else {
			
			System.out.println("NO browser");
			
		}
		
		driver.get(prop.getProperty("baseURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
