package com.iosDevices.alamqa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevicesBaseTest {
    	
    AppiumDriver<MobileElement> appium = null;
    
	public RealDevicesBaseTest() throws MalformedURLException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7 Plus (11.3)");	
    capabilities.setCapability(MobileCapabilityType.UDID, "E32A0CC4F64680570FE30C3FAB7911858EC82BA4");	
	capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Documents/UICatalog.app");
    appium = new IOSDriver<MobileElement> (new URL ("http://localhost:4723/wd/hub"),capabilities);
    appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }}


