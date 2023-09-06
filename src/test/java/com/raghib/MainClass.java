package com.raghib;

import com.raghib.inheritance.HandleFrame;
import com.raghib.overloading.GoogleSearchTest;
import com.raghib.overriding.ChangeResulationTest;

public class MainClass {

	public static void main(String[] args) {
		HandleFrame hf = new HandleFrame();
		hf.testCaseHandleFrame();
	
		ChangeResulationTest crt = new ChangeResulationTest();
		crt.launch();
		crt.closeDriver();
		
		GoogleSearchTest gst = new GoogleSearchTest();
		gst.launch();
		gst.closeDriver();		
	}
}
