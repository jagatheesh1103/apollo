package org.pages;

import org.baseclass.Baceclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lab_pages extends Baceclass {
	 
	
	public lab_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Proceed To Cart']")
	WebElement lab_procced_to_card;
	
	public WebElement getLab_procced_to_card() {
		return lab_procced_to_card;
	}

	@FindBy(xpath="//img[@alt='cart-icon']")
	WebElement card_icon_lab_test;
	
	public WebElement getCard_icon_lab_test() {
		return card_icon_lab_test;
	}

	@FindBy(xpath="(//li[@class='Header_list__dJe5O '])[2]")
	WebElement lab_test;


	public WebElement getLab_test() {
		return lab_test;
	}
	
	@FindBy(xpath="(//div[@class='VD'])[1]")
	WebElement full_body_checkup;


	public WebElement getFull_body_checkup() {
		return full_body_checkup;
	}

	public WebElement getAdd_lab_test() {
		return add_lab_test;
	}


	@FindBy(xpath="(//button[@aria-label='Button'])[5]")
	WebElement add_lab_test;
	
}
