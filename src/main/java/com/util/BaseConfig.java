package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	// getConfig return "value"
	public static String getconfig(String testData) throws IOException {
		
		String filePath="./Environments/dev.properties";
		// file > fin class > stream
		FileInputStream fis =new FileInputStream(filePath);
		// read the value from the file
		Properties pro = new Properties();
		pro.load(fis);
		// read each value
		String applicationURL = pro.get(testData).toString();
		
		return applicationURL;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(BaseConfig.getconfig("URL"));
		System.out.println(BaseConfig.getconfig("Username"));
		System.out.println(BaseConfig.getconfig("Password"));
			
	}
	
}



