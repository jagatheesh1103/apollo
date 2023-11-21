package org.pages;

import org.baseclass.Baceclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class circle_page extends Baceclass {
	
	public circle_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Upgrade']")
	WebElement circle_upgrade;
	
	public WebElement getCircle_upgrade() {
		return circle_upgrade;
	}

	@FindBy(xpath="(//li[@class='Header_list__dJe5O '])[3]")
	WebElement circle_membership_button;

	public WebElement getCircle_membership_button() {
		return circle_membership_button;
	}
	

}
