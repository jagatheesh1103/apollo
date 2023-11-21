package org.pages;

import org.baseclass.Baceclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class apollo_pages extends Baceclass{
	
	public apollo_pages(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	
	}
	
	
	
	public WebElement getSearchbox_text_by_medicines() {
		return searchbox_text_by_medicines;
	}
	
	@FindBy(xpath="//button[text()='Add Address']")
	WebElement by_add_address;
	
	public WebElement getBy_add_address() {
		return by_add_address;
	}
	
	@FindAll({	
	@FindBy(xpath="//span[text()='× ']"),
	@FindBy(xpath = "//span[@class='close']")
	})
	WebElement by_cencle;
	
	

	public WebElement getBy_cencle() {
		return by_cencle;
	}

	@FindBy(xpath="//a[@aria-label='Cart Icon']")
	WebElement by_cart_icon;



	public WebElement getBy_cart_icon() {
		return by_cart_icon;
	}


	@FindBy(xpath = "//input[@id='searchProduct']")
	WebElement searchbox_text_by_medicines;
	
	@FindBy(xpath="(//button[@aria-label='Button'])[2]")
	WebElement add_button;

	public WebElement getAdd_button() {
		return add_button;
	}
	
	

}
