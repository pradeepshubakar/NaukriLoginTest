package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.FileLib;

public class LoginPage {
	//declaration
	@FindBy(id="username")
	private WebElement UnTbx;
	@FindBy(name="pwd")
	private WebElement PwTbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Clkbx;
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	}
	
	//utilization
	
	public void setLogin(String un,String pw) {
		UnTbx.sendKeys(un);
		PwTbx.sendKeys(pw);
		Clkbx.click();
	}



}
