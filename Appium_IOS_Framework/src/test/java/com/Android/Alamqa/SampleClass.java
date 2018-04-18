package com.Android.Alamqa;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SampleClass {
	
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
public  void main () throws MalformedURLException  {
File f = new File("apps");
File fs = new File(f, "com.expedia.bookings.apk");

DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
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
//Runtime.getRuntime().exec("killall node");
System.out.println("Appium Server is now shut down");
}}




