package com.iosDevices.alamqa;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;

    public class AppiumServerYoutube {
    	
	private static AppiumServiceBuilder service;
	//public static void main(String[] args) {
	//stopAppium();
	//startAppium();
	//stopAppium();
	//}
	@BeforeTest
    public static void startAppium() {
	System.out.println("Trying to start Appium Server");	
	service = new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
    .withAppiumJS(new File ("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
	service.build().start();
	System.out.println("Appium Server is at your service");
	}
	@Test
    public void simpleTest() throws MalformedURLException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus (11.3)");
	capabilities.setCapability(MobileCapabilityType.UDID, "5ECD2F70-2A82-479F-99BC-3EB0CCE0851A");	
	capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Documents/UICatalog.app");


	IOSDriver <MobileElement> driver = new IOSDriver <>(new URL("http://localhost:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
    }
	
	@AfterTest
	public static void stopAppium() throws IOException {
	
	System.out.println("Trying to stop Appium Server");
	try {
	service.build().stop();
	} catch (Exception e) {
	System.out.println("Appium Server is already Stopped");	
	}
	Runtime.getRuntime().exec("killall node");
    System.out.println("Appium Server is now shut down");
    }}
    
    //killall node
