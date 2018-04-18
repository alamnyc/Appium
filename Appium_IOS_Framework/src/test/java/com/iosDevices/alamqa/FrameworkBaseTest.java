package com.iosDevices.alamqa;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
     
public class FrameworkBaseTest {
	
	    
	    public static IOSDriver<IOSElement> baseCapabilitiy () throws MalformedURLException {
		IOSDriver <IOSElement> driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X ");
		capabilities.setCapability(MobileCapabilityType.UDID, "EC542492-599A-4A35-A2CC-C897EC178B7A");	
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Documents/UICatalog.app");
	    driver = new IOSDriver <> (new URL("http://localhost:4723/wd/hub"), capabilities);	
	    
	    return driver;
	    }}
