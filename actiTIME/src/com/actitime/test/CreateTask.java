package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generics.ListenersCls.class)
public class CreateTask extends BaseClass{
@Test
public void teatCreateTask() throws IOException {
	FileLib f=new FileLib();
	TaskList t=new TaskList(driver);
	HomePage h=new HomePage(driver);
	h.clickOnTaskTab();
	t.clickOnAddNew();
	t.getNewTasks().click();
	t.getSelectCustomer();
	/*t.getNewCustomer().click();
	t.getTaskEnterCustNameTbx().sendKeys(f.getExcelData("./data/testScriptdata.xlsx", "createcustomer", 4, 2));
	t.getTaskEnterProjNameTbx().sendKeys(f.getExcelData("./data/testScriptdata.xlsx", "createcustomer", 1, 3));
	t.getTaskEnterTaskNameTbx().sendKeys(f.getExcelData("./data/testScriptdata.xlsx", "createcustomer", 1, 4));
	t.getTaskDeadLine().click();
	t.selectMonYearBx("Apr", 2020);*/
}
}
