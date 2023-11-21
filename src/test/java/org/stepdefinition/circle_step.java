package org.stepdefinition;

import org.pages.circle_page;
import org.reusable.Reusable_apollo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class circle_step extends Reusable_apollo {
	public circle_page cirp;

	@When("The user click the circle membership option")
	public void the_user_click_the_circle_membership_option() throws InterruptedException {
		cirp = new circle_page(driver);
		Thread.sleep(9000);
		toclick(cirp.getCircle_membership_button());

	}

	@Then("The user validate the circle membership option")
	public void the_user_validate_the_circle_membership_option() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("The user click the upgrade option")
	public void the_user_click_the_upgrade_option() throws InterruptedException {
		toclick(cirp.getCircle_upgrade());
		Thread.sleep(7000);
		driver.close();

	}



}
