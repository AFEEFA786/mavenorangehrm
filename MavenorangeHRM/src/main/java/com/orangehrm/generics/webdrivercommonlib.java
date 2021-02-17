package com.orangehrm.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Generic class for Webdriver Methods
 * @author Anwar thaithita
 *
 */
public class webdrivercommonlib {
	
	/**
	 * 
	 * @param driver
	 */
	public void waitforelementingui(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	public void customwait(WebElement element) {
		int i=0;
		while(i<1000) {
			try {
				element.isDisplayed();
				break;
				}
			catch(Exception e) {
				i++;
				
			}
		}
	}
	
public void waitElementVisibility(WebDriver driver,WebElement Element) {
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(Element));
	
	
	
}
public void mousehover( WebDriver driver,WebElement Element) {
	Actions a=new Actions(driver);
	a.moveToElement(Element).perform();;
	
}
public void rightclick(WebDriver driver ,WebElement Element) {
	Actions a=new Actions(driver);
	a.contextClick(Element).perform();
}
}
