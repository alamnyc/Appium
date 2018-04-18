package com.iosDevices.alamqa;

   

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.ElementOption;

    public class FirstTestClass extends FrameworkBaseTest {
    	public static IOSDriver driver;
    	@BeforeMethod
    	public void openServer() {
    	FramworkServerOpen .startAppium();
        }
		@AfterMethod
    	public void closeServer() throws IOException {
		FramworkServerOpen .stopAppium();
    	}	
    	
    	
        @Test
	    public void simpleIOSTest() throws MalformedURLException {
    	
    	IOSDriver<IOSElement>driver=baseCapabilitiy();
    	
  	         driver.get("http://gmail.com");

    	     driver.findElementByName("Email").sendKeys("rahul");

    	     driver.findElementByName("Passwd").sendKeys("rahul");

    	     driver.findElementByName("signIn").click();
    	
    
    	
    	
    	
    	driver.findElementByAccessibilityId("Alert Views").click();
    	driver.findElementByXPath("//*[@value='Text Entry']").click();
    	driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
    	driver.findElementByName("OK").click();
    	driver.navigate().back();
     
        }
    

    
    }
/*       
   	Dimension size = driver.manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
         driver).swipe(x, starty, x, endy, 2000); 
    	public void verticalSwipe_Up(MobileElement ele) {
        Dimension size = ele.getSize();
        ElementOption press = element(ele, size.width / 2, (int) (size.height * .80));
        ElementOption move = element(ele, size.width / 2, 25);
        TouchAction swipe = new TouchAction (getDriver()).press(press).waitAction(waitOptions(Duration.ofMillis(1000))).moveTo(move).release();
        // ofSeconds(2)
        swipe.perform();
    
   
        driver.findElementByAccessibilityId("Steppers").click();
        driver.findElementByAccessibilityId("Increment").click();
        driver.findElementByAccessibilityId("Increment").click();
        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
        
        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
        driver.findElementByAccessibilityId("Decrement").click();
        
        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
        driver.navigate().back();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByName("Green color component value").sendKeys("220");
        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");
        driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130"); 
       
		
	   }

       }*/
