package org.stepdefinition;

import org.pages.apollo_pages;
import org.reusable.Reusable_apollo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class apollo_search_step extends Reusable_apollo {
	public apollo_pages bypage;





	@Given("the user launche the url for apollo aplication")
	public void the_user_launche_the_url_for_apollo_aplication() throws Exception {
		luncher();
		bypage =  new apollo_pages(driver);

	}

	@When("the user search the medicines")
	public void the_user_search_the_medicines() throws Exception {
		toclick(bypage.getSearchbox_text_by_medicines());
		Thread.sleep(3000);
		tosendkey(bypage.getSearchbox_text_by_medicines(), "para 650");
		Thread.sleep(3000);

	}

	@When("user click the add button")
	public void user_click_the_add_button() throws InterruptedException {
		Thread.sleep(5000);
		toclick(bypage.getAdd_button());
		Thread.sleep(5000);
	}

	@When("the user click the card icon")
	public void the_user_click_the_card_icon() throws InterruptedException {
		implicitywait();
		toclick(bypage.getBy_cart_icon());
		switichframe();
		Thread.sleep(10000);
		//javascriptclick(bypage.getBy_cencle());
		toclick(bypage.getBy_cencle());

	}


	@Then("the user validate the adder page")
	public void the_user_validate_the_adder_page() throws InterruptedException {
		Thread.sleep(5000);

		
	}

	@When("the use click the add address button")
	public void the_use_click_the_add_address_button() throws InterruptedException {
		toclick(bypage.getBy_add_address());
		Thread.sleep(5000);
		driver.close();

		
	}



}
