package com.iosDevices.alamqa;


import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.io.IOException;
        
        public class FramworkServerOpen {
	    private static AppiumServiceBuilder service;
    
    	public static void startAppium() {
    	System.out.println("Trying to start Appium Server");	
    	service = new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
        .withAppiumJS(new File ("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
    	service.build().start();
    	System.out.println("Appium Server is at your service");
    	}
    	
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     //   stopAppium();
    	//startAppium();
    //	stopAppium();