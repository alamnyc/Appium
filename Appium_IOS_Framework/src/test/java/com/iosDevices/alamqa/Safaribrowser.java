package com.iosDevices.alamqa;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/*public class IphonBaseClass {

	    public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus (11.3)");	
		capabilities.setCapability(MobileCapabilityType.UDID, "5ECD2F70-2A82-479F-99BC-3EB0CCE0851A");	
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/mohammedalam/Documents/UICatalog.app");
	    AppiumDriver<MobileElement>  appium = new IOSDriver<MobileElement> (new URL ("http://localhost:4723/wd/hub"),capabilities);*/

public class Safaribrowser extends FramworkServerOpen {
	@BeforeMethod
	public void openServer() {
	FramworkServerOpen .startAppium();
    }
	@AfterMethod
	public void closeServer() throws IOException {
	FramworkServerOpen .stopAppium();
	}	
	


         @Test

 	   //  public static AppiumDriver driver;
 	
 	     public void main() throws MalformedURLException, InterruptedException {
 		
 		 DesiredCapabilities capabilities = new DesiredCapabilities();
 	     capabilities.setCapability("deviceName", "iPhone X");
 	     capabilities.setCapability("platformName", "iOS");
 	     capabilities.setCapability("platformVersion", "11.3");
 	     capabilities.setCapability("browserName", "safari");
 	     IOSDriver <IOSElement>  driver = new IOSDriver <> (new URL("http://localhost:4723/wd/hub"), capabilities);	
 	     driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
 	       
 		driver.get("http://www.way2automation.com");
 	    Thread.sleep(3000);
 		driver.findElement(By.linkText("Courses")).click();
 		driver.findElement(By.linkText("Selenium Training")).click();
 		System.out.println("Title of the page is : "+driver.getTitle());
 		
 		System.out.println(driver.getPageSource());
 		


	}

}
