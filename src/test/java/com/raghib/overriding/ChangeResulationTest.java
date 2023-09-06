package com.raghib.overriding;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.raghib.abstraction.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeResulationTest extends BaseClass {
	WebDriver driver;
	String url = "https://www.google.com";
	String browserName = "edge";
	
	//HERE WE ACHIEVE METHOD OVERRIDING 
	public WebDriver getDriver(String browserName, String url) {
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();		
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.get(url);
		return driver;
	}
	
	public void launch() {
		driver = getDriver(browserName, url);
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDriver() {
		driver.quit();
		System.out.println("Session Ends!");		
	}
}
