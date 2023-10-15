package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage_Registration;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
		
	@Test(groups= {"Regression","Master"})	
	public void AccountRegistrationTest() throws InterruptedException

	{
		logger.info("******Starting tc_001_AccountRegistrationTest*******");
		HomePage_Registration HPR=new HomePage_Registration(driver);
		Thread.sleep(3000);
		logger.info("Clicking on My Account link......");
		HPR.CLickMyAccount();
		logger.info("Clicking on My Register link......");
		HPR.ClickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		Thread.sleep(3000);
		
		logger.info("Enter Customer details......");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@notamment.com");		
		regpage.setTelephone(randomNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		regpage.clickPrivacyPolicy();
		Thread.sleep(3000);
		regpage.ClickContinuebtn();
		
		String confmsg=regpage.ConfirmationMessage();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Registration Successful......");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Registration failed......");
			Assert.fail();
			
		}
		
		logger.info("******Ending tc_001_AccountRegistrationTest*******");
		
		
	}
	
	
	
}