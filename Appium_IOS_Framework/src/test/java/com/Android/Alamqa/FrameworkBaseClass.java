package com.Android.Alamqa;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class FrameworkBaseClass extends FramworkServerOpen{
	
	@BeforeMethod
	public void openServer() {
	startAppium();
	}
	@AfterMethod
	public void closeServer() throws IOException {
	stopAppium();
	}
	
	
	@Test
	      public AppiumDriver<MobileElement> testCalculator() throws MalformedURLException, InterruptedException {
	      AppiumDriver <MobileElement> driver;
	     
		  File appDir = new File(System.getProperty("user.dir") + "/apps");
		  File app = new File(appDir, "com.expedia.bookings.apk");
		  
	      DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"50a72b995331");
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		  capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		  capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		  
		  driver =  new AndroidDriver<MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  Thread.sleep(5000);
		  return driver;
		  }}
