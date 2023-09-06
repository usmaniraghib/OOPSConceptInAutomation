package com.raghib.inheritance;

import org.openqa.selenium.WebDriver;

import com.raghib.abstraction.BaseClass;
import com.raghib.encapsulation.AutomationDemoSearchPage;

public class HandleFrame extends BaseClass {
	
	WebDriver driver;
	
	private static final String browser = "chrome";
	private static final String url = "http://demo.automationtesting.in/Frames.html";
	
	AutomationDemoSearchPage automationDemoSearchPage;

	public HandleFrame() {
		driver = super.getDriver(browser, url);
		automationDemoSearchPage = new AutomationDemoSearchPage(driver);
	}
	
	public void testCaseHandleFrame() {
		automationDemoSearchPage.handleFrame(driver);
		closeDriver();
		
	}
}
