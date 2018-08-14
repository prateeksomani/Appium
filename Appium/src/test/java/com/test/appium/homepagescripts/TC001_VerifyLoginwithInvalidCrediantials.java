package com.test.appium.homepagescripts;



import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.appium.testbase.TestBase;
import com.test.appium.objects.HomePage;

public class TC001_VerifyLoginwithInvalidCrediantials extends TestBase {
	//WebDriver driver; not required because inheriting from parent class
		HomePage homepage;
		public static Logger log=Logger.getLogger(TC001_VerifyLoginwithInvalidCrediantials.class.getName());
		@BeforeTest
		void setup() throws MalformedURLException {
			init();
			log.info("***************initialization done************");
		}
		
		@Test
		void verifyLoginwithInvalidCrediantials() throws InterruptedException {
			log.info("*****************starting verifyLoginwithInvalidCrediantials TC001 method******");
			homepage = new HomePage(driver);//initializing driver through pagefactory
			homepage.LoginToApplication("prateek.skit26@gmail.com", "password2");	
			log.info("*****************ending verifyLoginwithInvalidCrediantials method******");
		}
		
		@AfterTest
		void endTest() {
			log.info("*******closing browser******");
			//driver.close();
		}
}
