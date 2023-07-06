package com.pageobjectmodel;

import org.openqa.selenium.By;

public class LoginPage {
	//By Method > Page object Model
	
	
	private static By user=By.xpath("//*[@name='username']");
	private static By password=By.xpath("//*[@id='password']");
	private static By login=By.xpath("//*[@value='Login']");
	private static By logoutBtn=By.xpath("//*[@id='logoutButton']");

	public static By getUser() {
		return user;
	}

	public static By getPassword() {
		return password;
	}

	public static By getLogin() {
		return login;
	}

	public static By getLogoutBtn() {
		return logoutBtn;
	}

	
}
