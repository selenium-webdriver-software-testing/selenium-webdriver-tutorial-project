package webPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
	WebDriver driver;

	By userOrangeHRM = By.id("txtUsername");

	By passwordOrangeHRM = By.name("txtPassword");

	By login = By.id("btnLogin");

	public OrangeHRMLoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// Set user name in textbox

	public void setUserName(String strUserName) {

		driver.findElement(userOrangeHRM).sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		driver.findElement(passwordOrangeHRM).sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		driver.findElement(login).click();

	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void LoginOrangeHRM(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();

	}

}
