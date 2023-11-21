package org.stepdefinition;

import org.pages.lab_pages;
import org.reusable.Reusable_apollo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lab_test_step extends Reusable_apollo  {
	public lab_pages labp;

	

	@When("The user click the lab test option")
	public void the_user_click_the_lab_test_option() throws InterruptedException {
		labp = new lab_pages(driver);
		Thread.sleep(5000);
		toclick(labp.getLab_test());
	}
	
	@When("The user click the full body checkup")
	public void the_user_click_the_full_body_checkup() throws InterruptedException {
		Thread.sleep(5000);
		toclick(labp.getFull_body_checkup());  
	}
	
	@Then("User validate the full body checkup page")
	public void user_validate_the_full_body_checkup_page() throws InterruptedException {
		Thread.sleep(5000);
	   
	}

	@When("The user click add button for basic checkup")
	public void the_user_click_add_button_for_basic_checkup() throws InterruptedException {
		toclick(labp.getAdd_lab_test());
		Thread.sleep(5000);	  
	}
	@When("The user click the lab test page in card icon")
	public void the_user_click_the_lab_test_page_in_card_icon() throws InterruptedException {
		toclick(labp.getCard_icon_lab_test());
		Thread.sleep(5000);	  	   
	}
	@When("The user click the procced to pay button")
	public void the_user_click_the_procced_to_pay_button() throws InterruptedException {
		toclick(labp.getLab_procced_to_card());
		Thread.sleep(5000);
		driver.close();

	    
	}






}
