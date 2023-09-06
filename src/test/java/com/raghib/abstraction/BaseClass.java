package com.raghib.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ChromeOptions chromeOptions;
	EdgeOptions edgeOptions;
	WebDriver driver;
	
	public WebDriver getDriver(String browserName, String url) {
		if(browserName.equalsIgnoreCase("chrome")) {
			//WAY-1 [THIS WILL WORKING FROM SELENIUM-JAVA VERSION 4.10.0]
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver-116\\chromedriver.exe");
//			driver = new ChromeDriver();
			
			//WAY-2 [THIS WILL WORKING FROM SELENIUM-JAVA VERSION 4.11.0]
			chromeOptions = new ChromeOptions();
			chromeOptions.setBrowserVersion("116");
			chromeOptions.addArguments("--disable-notifications");
			driver = new ChromeDriver(chromeOptions);
		}
		if(browserName.equalsIgnoreCase("edge")) {
			edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeOptions);
		}		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
		System.out.println("Session Ends!");		
	}
}
