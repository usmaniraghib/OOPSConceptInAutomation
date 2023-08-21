package com.raghib.encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raghib.polymorphism.FrameSwitchClass;

public class AutomationDemoSearchPage {
	
	WebDriver driver;
	FrameSwitchClass frameSwitchClass;
	
	@FindBy(xpath="//title[text()='SingleFrame']/parent::head/following-sibling::body//input")
	WebElement textBox;

	public AutomationDemoSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		frameSwitchClass = new FrameSwitchClass();
	}
	
	public void handleFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
			frameSwitchClass.switchFrame(driver, "SingleFrame");
			textBox.sendKeys("Hi Raghib");
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}

}
