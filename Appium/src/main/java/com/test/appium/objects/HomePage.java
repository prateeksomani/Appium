package com.test.appium.objects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.appium.testbase.TestBase;

public class HomePage {
	WebDriver driver;
	public static Logger log=Logger.getLogger(HomePage.class.getName());
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userid")
	WebElement userid;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//android.widget.Button[@text='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'possession']")
	WebElement securityquestion;
	
	
	
}
