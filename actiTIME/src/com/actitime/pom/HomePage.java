package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//div[@id='container_tasks']")
private WebElement tasksTab;
@FindBy(xpath="//a[.='Logout']")
private WebElement logoutTab;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnTaskTab() {
	tasksTab.click();
}
public void clickOnLogout() {
	logoutTab.click();
}
}
