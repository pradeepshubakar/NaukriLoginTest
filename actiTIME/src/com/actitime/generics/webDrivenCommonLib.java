package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDrivenCommonLib extends BaseClass{
	/**
	 * implicit wait for element present in gui
	 */
	public void WaitForPageToLoad() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	public void WaitForElement(WebElement element) {
	/**
	 * explicit wait for element present in gui
	 */
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
}
	/**
	 * Custom wait for element present in GUI
	 * @param element
	 * @throws InterruptedException
	 */
	public void WaitForElementInGui(WebElement element) throws InterruptedException {
		int count=0;
		while(count<=20) {
			try {
				element.isEnabled();
			}
			catch(Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
}
	/**
	 * Select the value from the drop down using text or index
	 * @param element
	 * @param text
	 * @param index
	 */
	public void SelectDropDown(WebElement element,String text,int index) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		sel.selectByIndex(index);
	}
}
