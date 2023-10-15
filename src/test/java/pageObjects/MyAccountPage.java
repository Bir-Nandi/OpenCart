package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//h2[normalize-space()='My Account']") 
	WebElement msg_MyAccount;
	

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	WebElement link_Logout;
	
	public boolean is_MyAccount_Exists()
	{
		try {
			return(msg_MyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void Click_Logout()
	{
		link_Logout.click();
	}

}
