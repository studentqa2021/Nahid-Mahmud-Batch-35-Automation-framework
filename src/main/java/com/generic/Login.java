package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.LoginPage;
import com.util.BaseConfig;

public class Login {
	
	@Test
	public void getLogin() throws IOException {
		//Open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize
		driver.manage().window().maximize();
		// go to the URL
		driver.navigate().to(BaseConfig.getconfig("URL"));
		// put User
		driver.findElement(LoginPage.getUser()).click();
		driver.findElement(LoginPage.getUser()).sendKeys(BaseConfig.getconfig("Username"));
		
		// Put Password
		driver.findElement(LoginPage.getPassword()).click();
		driver.findElement(LoginPage.getPassword()).sendKeys(BaseConfig.getconfig("Password"));
		
		//Click login 
	    driver.findElement(LoginPage.getLogin()).click();
	    //Assertion
	    //Hard Assert
	    //Assert.assertTrue(driver.findElement(LoginPage.logoutBtn).isDisplayed());
	    //System.out.println("Hi");
	    //Soft Assert
	    SoftAssert sf = new SoftAssert();
	    sf.assertTrue(driver.findElement(LoginPage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hello");
	    sf.assertAll();
	    
		//Close Browser
	   // driver.quit();
	}

}

















