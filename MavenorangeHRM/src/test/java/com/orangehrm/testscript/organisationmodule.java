package com.orangehrm.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.generics.baseclass;
import com.orangehrm.generics.filelib;
import com.orangehrm.pom.adminclass;
import com.orangehrm.pom.homepage;

public class organisationmodule extends baseclass{
	
	@Test
	public void testeditorganisation() throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException {
		Reporter.log("editorganisation",true);
		filelib f=new filelib();
        String organisationname =f.getExcelValue("editorganisation", 1, 0);
        String organisationemail =f.getExcelValue("editorganisation", 1, 1);
        homepage h=new homepage(driver);
		adminclass ap=new adminclass(driver);
        w.mousehover(driver,h.admindropdown());
       
        w.mousehover(driver, ap.getOrganisationdropdown());
        ap.getGeneralinformationoption().click();
        ap.getEditbtn().click();
        ap.getOrganisationname().clear();
        ap.getOrganisationname().sendKeys(organisationname);
        ap.getEmailtbx().clear();
        ap.getEmailtbx().sendKeys(organisationemail);
        ap.getSavebtn();
	    
	    String Actualorganisation=ap.getOrganisationname().getAttribute("value");
	    Assert.assertEquals(Actualorganisation, organisationname);
		
	}
}
