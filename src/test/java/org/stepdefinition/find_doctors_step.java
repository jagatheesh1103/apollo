package org.stepdefinition;

import org.pages.find_doctors_pages;
import org.reusable.Reusable_apollo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class find_doctors_step extends Reusable_apollo {
	
	public find_doctors_pages findpage;
	
	
	@When("the user click the find doctors option")
	public void the_user_click_the_find_doctors_option() throws InterruptedException {
		findpage = new find_doctors_pages(driver);
		Thread.sleep(5000);
		toclick(findpage.getFind_doctors());
			
	}

	@When("the user send the city name")
	public void the_user_send_the_city_name() throws InterruptedException {
		Thread.sleep(3000);
		toclick(findpage.getFind_search_place());
		Thread.sleep(2000);
		tosendkey(findpage.getFind_search_place(), "chennai");
	}
	
	@When("the user find the doctor")
	public void the_user_find_the_doctor() throws InterruptedException {
		Thread.sleep(5000);
		toclick(findpage.getFind_doctor_name());
		
	}
	
	@Then("the user validate the doctor details")
	public void the_user_validate_the_doctor_details() throws InterruptedException {
		Thread.sleep(5000);

	}

	@When("the user book video consult")
	public void the_user_book_video_consult() throws InterruptedException {
		toclick(findpage.getBook_video_consult());
		Thread.sleep(5000);
		driver.close();


	}

	


	

}
