package com.orangehrm.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pom.homepage;
import com.orangehrm.pom.loginpage;

public class baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");                                                                                                                         
	}

   public static WebDriver driver;
   public webdrivercommonlib w=new webdrivercommonlib();
	
	@BeforeClass
	public void openBrowser() {
		driver =new ChromeDriver();
		Dimension dim=new Dimension(100,500);
		driver.manage().window().setSize(dim);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		w.waitforelementingui(driver);
	}
	
	@BeforeMethod
	public void login()throws IOException {
		filelib f=new  filelib();
		String url=f.getPropertyValue("url");
		String un=f.getPropertyValue("username");
		String pw=f.getPropertyValue("password");
		driver.get(url);
		loginpage l=new loginpage(driver);
		l.setlogin(un, pw);
	}
	
	@AfterMethod
	public void logout() {
		homepage hp=new homepage(driver);
		hp.setlogout();
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}


}
