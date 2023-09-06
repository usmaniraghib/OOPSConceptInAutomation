package com.raghib.overloading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.raghib.abstraction.BaseClass;
import com.raghib.polymorphism.WaitClass;

public class GoogleSearchTest extends WaitClass {
	WebDriver driver;
	String url = "https://www.google.com";
	public static String googleSearchBox = "//*[@id='APjFqb']";
	public static String linkPath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3";
	String browserName = "chrome";
	WebElement element;
	BaseClass bc = new BaseClass();

	// HERE WE ACHIEVE METHOD OVERLOADING
	public void search() {
		Duration duration = Duration.ofSeconds(30);
		
		implicitWait(driver, duration);
		
		element = driver.findElement(By.xpath(googleSearchBox));
		
		element = explicitWaitClick(driver, duration, googleSearchBox);		
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);		
		element = explicitWaitClick(driver, duration, linkPath);
		element.click();
	}

	public void launch() {
		driver = bc.getDriver(browserName, url);
		search();
		try {			
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDriver() {
		driver.quit();
		System.out.println("Session Ends!");		
	}
}
