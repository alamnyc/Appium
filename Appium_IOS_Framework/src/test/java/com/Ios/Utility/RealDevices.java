package com.Ios.Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevices {
	
  
	
	    public static void main(String[] args) throws MalformedURLException, InterruptedException {
		

	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7 Plus");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Desktop/UICatalog.app");
	    capabilities.setCapability("udid","E32A0CC4F64680570FE30C3FAB7911858EC82BA4");
	    
        AppiumDriver <MobileElement>  driver = new IOSDriver <> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	}}
