package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freecrm.utilities.BaseProject;

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
	@FindBy(xpath = "//select[contains(@name,'status')]") WebElement statusDropdown;
	@FindBy(xpath = "//input[@id='email']") WebElement Email;
	@FindBy(xpath = "//textarea[@id='description']") WebElement Notes;
	@FindBy(xpath = ".//*[@id='navmenu']/ul/li[4]/ul/li[2]/a") WebElement combinedForm;
	
	//company information (combined form)
	@FindBy(xpath = ".//*[@id='company_name']") WebElement companyName;
	@FindBy(xpath = ".//*[@id='industry']") WebElement Industry;
	@FindBy(xpath = "//input[@id='num_of_employees']") WebElement Employees;
	@FindBy(xpath = "//select[@name='category']") WebElement companyCategory;
	@FindBy(xpath = "//select[@name='company_status']") WebElement companyStatus;
	@FindBy(xpath = "//select[@name='priority']") WebElement companyPriority;
	@FindBy(xpath = "//input[@id='company_phone']") WebElement companyPhone;
	@FindBy(xpath = "//input[@id='company_email']") WebElement companyEmail;
	
	@FindBy(xpath = "//input[@name='address_title']") WebElement companyAddressTitle;
	@FindBy(xpath = "//textarea[@name='address']") WebElement companyAddress;
	@FindBy(xpath = "//input[@name='city']") WebElement companyCity;
	@FindBy(xpath = "//input[@name='state']") WebElement companyState;
	@FindBy(xpath = "//input[@name='postcode']") WebElement Zip;
	
	//contact information (combined form)
	@FindBy(xpath = "//select[@name='title']") WebElement contactTitle;
	@FindBy(xpath = "//input[@id='contact_phone']") WebElement contactPhone;
	
	
	//initialize Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewContactLink() {
		//Actions: handle mouse and keyboard events
		Actions action = new Actions (driver);
		driver.switchTo().frame("mainpanel"); //view page source
		action.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=contact']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}
	
	public void clickOnCombinedForm() {
		Actions action = new Actions (driver);
	//	driver.switchTo().frame("mainpanel");
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a"))).build().perform();
		combinedForm.click();
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
	
	public void Status() {
		Select status = new Select (statusDropdown);
		status.selectByVisibleText("Active");
	}
	
	public void Emails() {
		Email.sendKeys("chau.huynh123@yahoo.com");
	}
	
	public void Notes() {
		Notes.sendKeys("practice framework in classs - 05/26/2018");
	}
	
	public void clickSave() {
		saveButton.click();
	}
	
	public void companyInformation() {
		companyName.sendKeys("Association of Vietnamese Americans");
		Industry.sendKeys("non-profit");
		Employees.sendKeys("5");
		
		Select category = new Select(companyCategory);
		category.selectByVisibleText("Client");
		
		Select status = new Select (companyStatus);
		status.selectByVisibleText("Active");
		
		Select priority = new Select (companyPriority);
		priority.selectByValue("Low");
		
		companyPhone.sendKeys("301-588-1234");
		companyEmail.sendKeys("info@mdvietmutual.org");
		
		companyAddressTitle.sendKeys("Main office");
		companyAddress.sendKeys("8121 Georgia Ave, Ste 123");
		companyCity.sendKeys("Silver Spring");
		companyState.sendKeys("MD");
		Zip.sendKeys("20910");
	
	}
	
	public void contactInformation() {
		Select title = new Select (contactTitle);
		title.selectByVisibleText("Mr.");
		
		firstName.sendKeys("Thomas");
		lastName.sendKeys("Tran");
		Position.sendKeys("Executive Director");
		contactPhone.sendKeys("301-588-1234");
	}
	
}
