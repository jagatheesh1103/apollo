package org.pages;

import org.baseclass.Baceclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class find_doctors_pages extends Baceclass {
	
	public find_doctors_pages(WebDriver Driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Book Video Consult']")
	WebElement book_video_consult;
	
	public WebElement getBook_video_consult() {
		return book_video_consult;
	}

	@FindBy(xpath="(//li[@class='Header_list__dJe5O '])[1]")
	WebElement find_doctors;

	public WebElement getFind_doctors() {
		return find_doctors;
	}
	
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiInput-input'])[1]")
	WebElement find_search_place;

	public WebElement getFind_search_place() {
		return find_search_place;
	}
	
	@FindBy(xpath="//h2[text()='Dr. Vijay Kumar Chennamchetty']")
	WebElement find_doctor_name;

	public WebElement getFind_doctor_name() {
		return find_doctor_name;
	}

}
