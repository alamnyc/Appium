package com.iosDevices.alamqa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MokeshSafari {

	
		 
		@Test
		public void startBrowser() throws MalformedURLException {
	                
	                // Create Object of DesiredCapability class 
			DesiredCapabilities capabilities = new DesiredCapabilities();
	 
	                // Set the device Name- You can change based on your requirement
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
			capabilities.setCapability("deviceName", "iPhone X ");
			capabilities.setCapability(MobileCapabilityType.UDID, "EC542492-599A-4A35-A2CC-C897EC178B7A");	
	                // Set the platform name- This will ramain same 
			capabilities.setCapability("platformName", "iOS");
	                 
	                // This the version- it is important so change it if required 
			capabilities.setCapability("platformVersion", "11.3");
	 
	                // set the browser in Emulator
		//	capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
	 
	                // pass the capability object and start the session
			IOSDriver driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	                // Open any web application which you want to Test
			driver.get("http://learn-automation.com");
	 
	                // Perform any operation- In my case I just used title of Page.
			System.out.println("Page title is " + driver.getTitle());
	 
		}
	 
	}