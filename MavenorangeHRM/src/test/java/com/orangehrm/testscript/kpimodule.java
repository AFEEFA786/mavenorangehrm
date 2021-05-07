package com.orangehrm.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.generics.baseclass;
import com.orangehrm.generics.filelib;

import com.orangehrm.pom.homepage;
import com.orangehrm.pom.performancepage;

public class kpimodule extends baseclass {
	@Test

	public void testeditorganisation() throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException {
		Reporter.log("kpiforjobtitle",true);
		filelib f=new filelib();
        String jobtitle =f.getExcelValue("performance", 1, 0);
        String kpiforjobtitle =f.getExcelValue("performance", 1,1);
        String minrating =f.getExcelValue("performance", 1, 2);
        
        String maxrating=f.getExcelValue("performance", 1, 3);
        homepage h=new homepage(driver);
		
		performancepage p=new performancepage(driver);
        w.mousehover(driver,h.getPerformancedropdown());
        Thread.sleep(1000);
        w.mousehover(driver,p.getConfiguredropdown());
        Thread.sleep(1000);
        p.getKpi().click();
        Thread.sleep(1000);
        p.getAddbtn().click();
        Thread.sleep(1000);
        p.getJobtitletextbox().sendKeys(jobtitle);
        Thread.sleep(1000);
        p.getKpitxtbx().sendKeys(kpiforjobtitle);
        Thread.sleep(1000);
        p.getMinrating().clear();
       p.getMinrating().sendKeys(minrating);
       Thread.sleep(1000);
       p.getMaxrating().clear();
       p.getMaxrating().sendKeys(maxrating);
       Thread.sleep(1000);
       p.getSavebtn1().click();
       String actualrating=p.getMinrating().getAttribute("value");
       Assert.assertEquals(actualrating, minrating);
	}

}
