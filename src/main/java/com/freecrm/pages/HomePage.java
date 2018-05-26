package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utilities.BaseProject;

import cucumber.api.java.hu.De;

public class HomePage extends BaseProject{
	
	//define objects (after logging in)
	@FindBy(xpath = "//a[contains(text(),'Deals')]") WebElement dealsLink;
	@FindBy(xpath = "//a[contains(.,'Contacts')]") WebElement contactsLink;
	@FindBy(xpath = "//a[@title='New Contact']") WebElement newContactLink;
	@FindBy(xpath = "//input[@id='first_name']") WebElement firstName;
	@FindBy(xpath = "//input[@id='surname']") WebElement lastName;
	@FindBy(xpath = "//input[@name='nickname']") WebElement nickName;
	@FindBy(xpath = "//input[@id='department']") WebElement Department;
	@FindBy(xpath = "//input[@id='company_position']") WebElement Position;
	@FindBy(xpath = "//input[@value='Save']") WebElement saveButton;

	
	//initialize Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewContactLink() {
		//Actions: handle mouse and keyboard events
		Actions action = new Actions (driver);
		driver.switchTo().frame("mainpanel"); //view page source
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}
	
	public void firstName() {
		firstName.sendKeys("Chau");
	}
	
	public void lastName() {
		lastName.sendKeys("Huynh");
	}
	
	public void nickName() {
		nickName.sendKeys("Chau");
	}
	
	public void Position() {
		Position.sendKeys("QA");
	}
	
	public void Department() {
		Department.sendKeys("IT");
	}
	
	public void clickSave() {
		saveButton.click();
	}
}
