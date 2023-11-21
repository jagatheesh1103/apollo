package org.pages;

import org.baseclass.Baceclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class health_page extends Baceclass  {
	
	public health_page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Login Now']")
	WebElement login_button;
	
	@FindBy(xpath="(//li[@class='Header_list__dJe5O '])[4]")
	WebElement health_record;

	public WebElement getHealth_record() {
		return health_record;
	}

	public WebElement getLogin_button() {
		return login_button;
	}
	
	

}
