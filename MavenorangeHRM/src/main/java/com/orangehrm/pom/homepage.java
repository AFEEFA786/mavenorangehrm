package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage  {
	@FindBy(id="welcome")
	private WebElement usericon;
	
	@FindBy(xpath="//a[@href='/index.php/auth/logout\']")
	private WebElement logoutlink;
	
	@FindBy(xpath="//b[.='Admin']")
	private WebElement admindropdown;
	
	public homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setlogout() {
	usericon.click();
	logoutlink.click();
}
public WebElement admindropdown() {
	
	return admindropdown;
}
@FindBy(xpath="//b[.='Performance']")
private WebElement performancedropdown;

public WebElement getUsericon() {
	return usericon;
}
public WebElement getLogoutlink() {
	return logoutlink;
}
public WebElement getAdmindropdown() {
	return admindropdown;
}
public WebElement getPerformancedropdown() {
	return performancedropdown;
}

}