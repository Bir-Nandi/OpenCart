package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	// Register Account Elements
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txt_Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txt_Lastname;
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txt_Email; 
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txt_Telephone;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txt_ConfirmPwd;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chk_PrivacyPolicy;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btn_Continue;
	

	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
	WebElement msg_Confirmation;
	
	
	/*
	@FindBy(xpath="//input[@id='gender-male']") 	
	WebElement chk_gender;
	
	@FindBy(xpath="//input[@id='FirstName']")		
	WebElement txt_Fname;
	
	@FindBy(xpath="//input[@id='LastName']") 		
	WebElement txt_Lname;
	
	@FindBy(xpath="//input[@id='Email']")			
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='Password']") 		
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']") 	
	WebElement txt_Cpassword;
	
	@FindBy(xpath="//button[@id='register-button']") 	
	WebElement bt_Register;
	

	@FindBy(xpath="//div[@class='result']") 		
	WebElement txt_Confirmationmsg;
	*/
	
	// Action Methods
	
	public void setFirstName(String FName)
	
	{
		txt_Firstname.sendKeys(FName);
	}
	
	
	public void setLastName(String LName)
	{
		txt_Lastname.sendKeys(LName);
	}
	
	public void setEmail(String Email)
	{
		txt_Email.sendKeys(Email);
	}
	
	public void setTelephone(String Tel)
	{
		txt_Telephone.sendKeys(Tel);
	}
	
	public void setPassword(String pwd)
	{
		txt_Password.sendKeys(pwd);
	}
	
	
	public void setConfirmPassword(String Cpwd)
	{
		txt_ConfirmPwd.sendKeys(Cpwd);
	}
	
	public void clickPrivacyPolicy()
	{
		chk_PrivacyPolicy.click();
	}
	
	
	public void ClickContinuebtn()
	{
		btn_Continue.click();
	}
	
	public String ConfirmationMessage()
	{
		try
		{
			return(msg_Confirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}

}








