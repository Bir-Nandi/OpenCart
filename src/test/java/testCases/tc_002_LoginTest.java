package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_Registration;
import pageObjects.LogInPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class tc_002_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void test_Login()
	{
	try
	{
		logger.info("Starting tc_002_LoginTest....");
		
		HomePage_Registration hp=new HomePage_Registration(driver);
		hp.CLickMyAccount();
		hp.ClickLogin();
		
		LogInPage lp= new LogInPage(driver);
		lp.SetEmail(rb.getString("email"));
		lp.SetPassword(rb.getString("pwd"));
		lp.ClickbtnLogin();
		
		MyAccountPage acc_page=new MyAccountPage(driver);
		boolean target_page=acc_page.is_MyAccount_Exists();
		Assert.assertEquals(target_page, true);
	}
		
	
	catch(Exception e)
	{
		Assert.fail();
	}
	
		logger.info("Finishing tc_002_LoginTest....");
}
}
