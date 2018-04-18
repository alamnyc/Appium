package com.iosDevices.alamqa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
    
    public class BaseTest {
    	
    AppiumDriver<MobileElement> appium = null;
    @Test
	public BaseTest() throws MalformedURLException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus (11.3)");	
	capabilities.setCapability(MobileCapabilityType.UDID, "5ECD2F70-2A82-479F-99BC-3EB0CCE0851A");	
	capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Documents/UICatalog.app");
	
    appium = new IOSDriver<MobileElement> (new URL ("http://localhost:4723/wd/hub"),capabilities);
    appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }}
