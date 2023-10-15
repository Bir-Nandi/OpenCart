package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_Registration;
import pageObjects.LogInPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class tc_003_DataDriven_LoginTest2 extends BaseClass {
	
	@Test(groups={"Master","Functional"},dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_Login(String email, String pwd, String expresult)
	{
	try
	{
		logger.info("Starting tc_002_LoginTest....");
		
		HomePage_Registration hp=new HomePage_Registration(driver);
		hp.CLickMyAccount();
		hp.ClickLogin();
		
		LogInPage lp= new LogInPage(driver);
		lp.SetEmail(email);
		lp.SetPassword(pwd);
		lp.ClickbtnLogin();
		
		MyAccountPage acc_page=new MyAccountPage(driver);
		boolean target_page=acc_page.is_MyAccount_Exists();
		
		if(expresult.equalsIgnoreCase("valid"))
		{
			if(target_page==true)
			{
				acc_page.Click_Logout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(expresult.equalsIgnoreCase("Invalid"))
		{
			if(target_page==true)
			{
				acc_page.Click_Logout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
		
	catch(Exception e)
	{
		Assert.fail();
	}
	
		logger.info("Finishing tc_002_LoginTest....");
}
}
