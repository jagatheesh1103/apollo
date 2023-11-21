package org.reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.baseclass.Baceclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Reusable_apollo extends Baceclass {
	
	
	

public JavascriptExecutor js;
	
	
	
	
	public  void toclick(WebElement Element ) {

		Element.click();
	}



	

	public  void windowhandaling() {
		String windowHandle = driver.getWindowHandle();

		Set<String> ch = driver.getWindowHandles();

		for (String neww : ch) {

			driver.switchTo().window(neww);

		}	

	}

	public void screenshot() throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("src\\test\\resources\\screenshot\\new.png");
		FileUtils.copyFile(source, target);

	}

	public void enterkey() throws Exception {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void downkey() throws AWTException {
		Robot rob1 = new Robot();

		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);

	}
	
	
	public void tosendkey(WebElement element, String text) {
		element.sendKeys(text);
		

	}
	public  void backtonavigate(WebElement element) {
		driver.navigate().back();

	}
	
	public void scrolldown(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

	}
	
	public void scrollup(WebElement element) {
		JavascriptExecutor jsclick = (JavascriptExecutor)driver;
		jsclick.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}
	public  void doubleclick(WebElement e) {
		Actions  actions = new Actions(driver);
		actions.doubleClick(e);

	}
	
	public void mouseclick(WebElement e) {
		Actions  mousea = new Actions(driver);
		mousea.click(e);


	}
	
	public void implicitywait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void javascriptclick(WebElement e) {
		js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].click;", e);

	}
	
	public void switichframe() {
		WebElement framee = driver.findElement(By.id("wiz-iframe-intent"));
		driver.switchTo().frame(framee);

	}



	

}
