package com.Ios.Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityReader {
	
public CapabilityReader()	{
}
	
public DesiredCapabilities getDesiredCapabilities () {
	
	DesiredCapabilities capability = new DesiredCapabilities();
	
	BufferedReader reader;
	try {
	reader = new BufferedReader(new FileReader(System.getProperty("user.dir") +"/capab/ios.txt"));
	String line = reader.readLine();
	while (line != null) {
	System.out.println(line);
	String [] cap = line.split("=");
	capability .setCapability(cap[0], cap[1]);
			// read next line
	line = reader.readLine();
	}
	reader.close();
	} catch (IOException e) {
	e.printStackTrace();
	}
	return capability;
	}
    public static void main(String[]args) {
	
	CapabilityReader cap = new CapabilityReader();
	cap.getDesiredCapabilities();
	
}
}
