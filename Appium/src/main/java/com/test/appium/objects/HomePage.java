package com.test.appium.objects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.appium.testbase.TestBase;

public class HomePage {
	WebDriver driver;
	public static Logger log=Logger.getLogger(HomePage.class.getName());
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement loginEmailAddress;
	
	@FindBy(id = "passwd")
	WebElement loginPassword;
	
	@FindBy(id = "signin")
	WebElement signIn;
	
	@FindBy(xpath = "//android.widget.Button[@text='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'possession']")
	WebElement securityquestion;
	
	public void LoginToApplication(String emailAddress, String password) throws InterruptedException {
		signIn.click();
		log.info("**********clicking "+signIn.toString()+" object*****");
		Thread.sleep(1000);
		loginEmailAddress.sendKeys(emailAddress);
		Thread.sleep(1000);
		loginPassword.sendKeys(password);
		Thread.sleep(1000);
		submitButton.click();
		
	}
	
	
	
}
