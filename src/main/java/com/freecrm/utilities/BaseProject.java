package com.freecrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseProject {
	public static Properties prop; //global = accessible to other classes
	public static WebDriver driver;
	
	/* Constructor:  a block of code similar to a method
	 * called when an instance of an object is created
	 * has the same name as the class
	 * doesn't have a return type
	 */
	public BaseProject() {
		//use try-catch or throw exceptions 
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Chau\\eclipse-workspace\\com.freecrm\\src\\main\\java\\com\\freecrm\\config\\file.properties");
		prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
			}
	}
	
	public static void initialize() {
		//fetch value of 'browser', which is 'chrome', then store in variable
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chau\\Downloads\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chau\\Downloads\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
}
