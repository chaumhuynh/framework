package com.freecrm.stepdefinition;

import org.junit.Assert;

import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;
import com.freecrm.utilities.BaseProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


	//Step Definition (defining steps in testCaseOne.feature file)

public class HomePageSteps extends BaseProject{
		
		LoginPage loginTest;
		HomePage homePage;

	@Given("^I open a browser$")
	public void i_open_a_browser() {
		BaseProject.initialize();
	}

	@When("^I go to FreeCRM link$")
	public void i_go_to_FreeCRM_link() {
		driver.get(prop.getProperty("url"));

	}

	@When("^I see CRM logo$")
	public void i_see_CRM_logo() {
//		Assert.assertEquals(loginTest.validateCRMLogo(), true);

		loginTest = new LoginPage();
		loginTest.validateCRMLogo();
	}

	@When("^I see Forgot Password link$")
	public void i_see_Forgot_Password_link() {

		boolean fgtLink = loginTest.validateForgotPasswordLink();
	    Assert.assertTrue(fgtLink);
	}

	@When("^I see Features link$")
	public void i_see_Features_link() {
		boolean featureLink = loginTest.validateFeaturesLink();
		Assert.assertTrue(featureLink);

	}

	@When("^I see SignUp link$")
	public void i_see_SignUp_link() {
		
	}

	@When("^I see Pricing link$")
	public void i_see_Pricing_link() {
		
	}

	@When("^I see Customers link$")
	public void i_see_Customers_link() {
		
	}

	@When("^I see Contact link$")
	public void i_see_Contact_link() {
		
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws InterruptedException {
		loginTest.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		loginTest.clickLink();
	}

	@Then("^I should see logout link$")
	public void i_should_see_logout_link() {
		
	}
	
	//Step definition after logging in
	
	@Then("^I click on the contact in the menu$")
	public void i_click_on_the_contact_in_the_menu() {
		homePage= new HomePage();
	    homePage.clickOnNewContactLink();
	}

	@Then("^I wait three seconds$")
	public void i_wait_three_seconds() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Then("^I enter first name$")
	public void i_enter_first_name() {
		homePage.firstName();
	}

	@Then("^I enter last name$")
	public void i_enter_last_name() {
		homePage.lastName();
	}

	@Then("^I enter nickname$")
	public void i_enter_nickname() {
		homePage.nickName();
	}

	@Then("^I enter position$")
	public void i_enter_position() {
		homePage.Position();
	}

	@Then("^I enter department$")
	public void i_enter_department() {
		homePage.Department();
	}

	@Then("^I click on status and select active$")
	public void i_click_on_status_and_select_active() {
		homePage.Status();
	}
	
	@Then("^I add email$")
	public void i_add_email() {
		homePage.Emails();
	}
	
	@Then("^I add notes$")
	public void i_add_notes() {
		homePage.Notes();
	}
	
	@Then("^I click on combined form$")
	public void i_click_on_combined_form() {
		homePage.clickOnCombinedForm();
	}
	
	@Then("^I enter company information$")
	public void i_enter_company_information() {
		homePage.companyInformation();
	}
	
	@Then("^I enter contact information$")
	public void i_enter_contact_information() {
		homePage.contactInformation();
	}
	
	@Then("^I click on save button$")
	public void i_click_on_save_button() {
		homePage.clickSave();
	}


	
	
	}

