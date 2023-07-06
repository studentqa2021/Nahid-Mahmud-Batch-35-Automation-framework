package com.generic;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.LoginPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;

	@Given("Open the Browser")
	public void open_the_browser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("Go to Application")
	public void go_to_application() throws IOException {
		driver.navigate().to(BaseConfig.getconfig("URL"));

	}

	@When("valid user name")
	public void valid_user_name() throws IOException {
		driver.findElement(LoginPage.getUser()).click();
		driver.findElement(LoginPage.getUser()).sendKeys(BaseConfig.getconfig("Username"));
		

	}

	@When("valid password")
	public void valid_password() throws IOException {
		driver.findElement(LoginPage.getPassword()).click();
		driver.findElement(LoginPage.getPassword()).sendKeys(BaseConfig.getconfig("Password"));

	}

	@When("sign in")
	public void sign_in() {
		driver.findElement(LoginPage.getLogin()).click();

	}

	@Then("Check signout button there or not")
	public void check_signout_button_there_or_not() {
		//Soft Assert
	    SoftAssert sf = new SoftAssert();
	    sf.assertTrue(driver.findElement(LoginPage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hello");
	    sf.assertAll();

	}

	@When("put invalid user name")
	public void put_invalid_user_name() throws IOException {
		driver.findElement(LoginPage.getUser()).click();
		driver.findElement(LoginPage.getUser()).sendKeys(BaseConfig.getconfig("Invalid_Username"));
		

	}

	@When("put invalid password")
	public void put_invalid_password() throws IOException {
		driver.findElement(LoginPage.getPassword()).click();
		driver.findElement(LoginPage.getPassword()).sendKeys(BaseConfig.getconfig("Invalid_Password"));

	}
	
	@When("Click sign in")
	public void click_sign_in() {
		driver.findElement(LoginPage.getLogin()).click();
	    
	}
	
	
	@When("Accept Alert")
	public void accept_alert() {
	    
	}
	
	@Then("Signout button should not visible")
	public void signout_button_should_not_visible() {
	   
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		//Soft Assert
	    SoftAssert sf = new SoftAssert();
	    sf.assertTrue(!driver.findElement(LoginPage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hello");
	    sf.assertAll();
			
		
	}
		

}

