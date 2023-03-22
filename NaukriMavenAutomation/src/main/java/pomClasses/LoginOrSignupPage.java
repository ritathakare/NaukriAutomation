package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignupPage  {
	
	WebDriver driver;
	
	//Variable = webelement = private
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNeAccount;
	
	//constructor = webelement Initialization =public
	public LoginOrSignupPage(WebDriver driver)
	{
	 PageFactory.initElements(driver,this);	
	 this.driver = driver;
	}
	
   //Methods = webelement Action = public
	
	public void senduserName()
	{
		userName.sendKeys("Velocity");
	}
	public void sendPassword()
	{
		password.sendKeys("3646hgh");
	}
	public void clickONLoginbutton()
	{
		loginbutton.click();
	}
//	public void clickOnCreateNewAccount()
//	{
//		createNeAccount.click();
//	}

}
