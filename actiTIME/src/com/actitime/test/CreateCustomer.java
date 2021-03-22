package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generics.ListenersCls.class)
public class CreateCustomer extends BaseClass{
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	HomePage h=new HomePage(driver);
	h.clickOnTaskTab();
	FileLib f=new FileLib();
	String ETitle = f.getExcelData("./data/testScriptdata.xlsx", "createcustomer", 1, 2);
	TaskList t=new TaskList(driver);
	t.clickOnAddNew();
	t.getNewCustomer().click();
	t.getCustNameTbx().sendKeys(ETitle);
	t.getSelectCustDropDown().click();
	t.getOurCompanyOption().click();
	t.getCreateCustomer().click();
	String ATitle = t.getActTitle().getText();
	Assert.assertEquals(ETitle, ATitle);



}

}
