package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Registration extends BasePage {
	
	WebDriver driver;
	
	public HomePage_Registration(WebDriver driver)
	{
		super(driver);
	}
	
	// Elements Registration
	


	@FindBy(xpath="//a[@title='My Account']") 
	WebElement link_MyAccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']") 
	WebElement link_Register;
	

	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
	WebElement link_Login;
	
	// Action Methods
	
	public void CLickMyAccount() 
	
	{
		
		link_MyAccount.click();
	}
		
	
	public void ClickRegister() throws InterruptedException 
	{
		Thread.sleep(3000);
		link_Register.click();
	}
	
	public void ClickLogin()
	{
		link_Login.click();
	}
	
	
	
}
		
	



