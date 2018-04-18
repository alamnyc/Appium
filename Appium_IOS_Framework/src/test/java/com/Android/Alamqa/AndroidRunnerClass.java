package com.Android.Alamqa;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidRunnerClass extends FramworkServerOpen{
	
	
		
/*	@BeforeMethod
	public void openServer() {
	startAppium();
	}
	@AfterMethod
	public void closeServer() throws IOException {
	stopAppium();
	}*/
	
        @Test	( priority = 1)
		public  void Test1 () throws MalformedURLException  {
		File f = new File("apps");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
		
		@Test	(priority = 2 )
		public  void Test2() throws MalformedURLException  {
		File f = new File("apps");
		File fs = new File(f, "ContactManager.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


}
		@Test(priority = 3 )	
		public  void Test3 () throws MalformedURLException  {
		File f = new File("apps");
		File fs = new File(f, "selendroid-test-app-0.17.0.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5558");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		}}
