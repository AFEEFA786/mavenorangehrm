package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class performancepage {
	@FindBy(id="menu_performance_Configure")
	private WebElement configuredropdown;
	
	@FindBy(id="menu_performance_searchKpi")
	private WebElement kpi;
	
	public performancepage(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	
	}
	
	
	
	public WebElement getConfiguredropdown() {
		return configuredropdown;
	}

	
	

	public WebElement getKpi() {
		return kpi;
	}
	
	
	

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getJobtitletextbox() {
		return jobtitletextbox;
	}

	

	public WebElement getKpitxtbx() {
		return kpitxtbx;
	}

	

	public WebElement getSavebtn1() {
		return savebtn1;
	}

	
	@FindBy(id="btnAdd")
	private WebElement addbtn;
	
	@FindBy(id="defineKpi360_jobTitleCode")
	private WebElement jobtitletextbox ;
	
	@FindBy(id="defineKpi360_keyPerformanceIndicators")
	private WebElement kpitxtbx ;
	
	@FindBy(id="saveBtn")
	private WebElement savebtn1 ;
	
	@FindBy(id="defineKpi360_minRating")
	private WebElement minrating;

	@FindBy(id="defineKpi360_maxRating")
	private WebElement maxrating;

	public WebElement getMinrating() {
		return minrating;
	}




	public WebElement getMaxrating() {
		return maxrating;
	}

	
}
