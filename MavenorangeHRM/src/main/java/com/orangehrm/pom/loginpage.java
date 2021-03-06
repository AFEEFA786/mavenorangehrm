package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(id="txtUsername")
	private WebElement untbx;
	
	@FindBy(id="txtPassword")
	private WebElement pwtbx;
	
	@FindBy( id="btnLogin") 
	private  WebElement lgbtn;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
