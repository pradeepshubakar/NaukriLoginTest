package com.naukriLoginTest1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.naukriLoginTest1.FileLib;
import com.naukriLoginTest1.HomePage;
import com.naukriLoginTest1.LoginPage;

public class NaukriLogin extends BaseClass {

@Test
public void testNaukriLogin() throws IOException, InterruptedException {
	Reporter.log("Hi darling Jo...");
	/*System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.close();*/
	LoginPage l = new LoginPage(driver);
	HomePage h = new HomePage(driver);
	FileLib f = new FileLib();
	driver.get(f.getPropertyFileData("naukriUrl"));
	l.clickOnLoginLink();
	l.enterEmailIdOrUserName(f.getPropertyFileData("naukriUn"));
	l.enterPassword(f.getPropertyFileData("naukriPw"));
	l.clickOnLoginButton();
	Thread.sleep(5000);
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"))).perform();
	//h.moveTOMyNaukri();
	
	//Thread.sleep(5000);
	h.clickOnLogOut();
}
}
