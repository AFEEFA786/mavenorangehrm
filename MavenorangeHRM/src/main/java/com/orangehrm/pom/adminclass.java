package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminclass   {
	@FindBy(id="menu_admin_Organization")
	private WebElement organisationdropdown;
	
	@FindBy(id="menu_admin_viewOrganizationGeneralInformation")
	private WebElement generalinformationoption;
	
	@FindBy(id="btnSaveGenInfo")
	private WebElement editbtn;
	

	@FindBy(id="organization_name")
	private WebElement organisationname;
	
	@FindBy(id="organization_email")
	private WebElement emailtbx;
	
	@FindBy(id="btnSaveGenInfo")
	private WebElement savebtn;
	
	public adminclass(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}

	public WebElement getOrganisationdropdown() {
		return organisationdropdown;
	}

	public WebElement getGeneralinformationoption() {
		return generalinformationoption;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getOrganisationname() {
		return organisationname;
	}

	public WebElement getEmailtbx() {
		return emailtbx;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	
	
	

}
