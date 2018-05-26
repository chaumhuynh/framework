package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utilities.BaseProject;

public class LoginPage extends BaseProject {
	//define objects (instead of driver.findElement, this is similar to a repository for elements)

//	@FindBy(xpath = "//img[contains(@class=,'img-responsive')]") WebElement crmLogo;
	@FindBy(xpath = "//img[@alt='free crm logo']") WebElement crmLogo;

	@FindBy(xpath = "//small[contains(.,'Forgot Password?')]") WebElement forgotPasswordLink;
	@FindBy(xpath = "//a[contains(.,'Features')]") WebElement featuresLink;
	@FindBy(xpath = "//a[contains(.,'Sign Up')]") WebElement signUpLink;
	@FindBy(xpath = "//a[contains(.,'Pricing')]") WebElement pricingLink;	
	@FindBy(xpath = "//a[contains(.,'Customers')]") WebElement customersLink;
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Contact')]") WebElement contactLink;
	
	@FindBy(name = "username") WebElement usernameField;
	@FindBy(name = "password") WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginLink;
	

	//initialize Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	public boolean validateForgotPasswordLink() {
		return forgotPasswordLink.isDisplayed();
	}			

	public boolean validateFeaturesLink() {
		return featuresLink.isDisplayed();
	}

	public boolean validateSignUpLink() {
		return signUpLink.isDisplayed();
	}

	public boolean validatePricingLink() {
		return pricingLink.isDisplayed();
	}
	
	public boolean validateCustomersLink() {
		return customersLink.isDisplayed();
	}
	
	public boolean validateContactLink() {
		return contactLink.isDisplayed();
	}
	
	public HomePage login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		return new HomePage();
	}
	
	public void clickLink() {
		loginLink.click();
	}
}
