package org.stepdefinition;

import org.pages.health_page;
import org.reusable.Reusable_apollo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class health_step extends Reusable_apollo {
	public health_page healthp;
	
	@When("The user click the health recprds option")
	public void the_user_click_the_health_recprds_option() throws InterruptedException {
		healthp =  new health_page(driver);
		Thread.sleep(5000);
		toclick(healthp.getHealth_record());

	}
	@Then("The user validate the health recprds page")
	public void the_user_validate_the_health_recprds_page() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("The user click the login now button")
	public void the_user_click_the_login_now_button() throws InterruptedException {
	   toclick(healthp.getLogin_button());
	   Thread.sleep(10000);
	   driver.close();
	}



}
