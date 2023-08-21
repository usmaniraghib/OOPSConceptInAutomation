package com.raghib.polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameSwitchClass {
	
	public void switchFrame(WebDriver driver, int id) {
		driver.switchTo().frame(id);
	}
	
	public void switchFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	
	public void switchFrame(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}
}
