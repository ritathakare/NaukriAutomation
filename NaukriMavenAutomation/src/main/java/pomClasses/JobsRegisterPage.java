package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsRegisterPage{ 
	
	WebDriver driver;//Global variable
	private Actions act;
	
	@FindBy(xpath="//a[@title='Firstnaukri | Search Jobs']")
	private WebElement jobs;
	
	@FindBy(xpath="//div[@class='left-container']//a")
	private WebElement register;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@placeholder='Enter your email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//img[@id='tncFlag']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Register now']")
	private WebElement registernowbutton;
	
	//Constructor--public--webelement Initialization
   // Findelement
	
	public JobsRegisterPage(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	   this.driver=driver; // Initialization of 
	   act = new Actions(driver);//Local webdriver variable
	}
	
	//Methods--public--Webelement actions
	public void jobSearch()
	{
		// Actions act=new Actions(driver);
		 act.moveToElement(jobs).click().build().perform();
    }
	public void registerbutton()
	{
		register.click();
	}
	public String verifyButtonText()
	{
	 String text = register.getText();
	 return text;
    }
	public boolean verifysendname()
	{
		boolean result = fullname.isEnabled();
		return result; 
	}
	public void sendFullName()
	{
		fullname.sendKeys("Rita Thakare");
    }
	public void sendEmail()
	{
		email.sendKeys("abcd@gmail.com");
	}
	public void sendPassword()
	{
		password.sendKeys("35hfgj7k@h");
	}
	public boolean verifyCheckbox()
	{
	  boolean result = checkbox.isSelected();
	  return result;
    }
	public void registerNowButton()
	{
		registernowbutton.click();
	}
	public String verifyText() 
	{
	 String text = registernowbutton.getText();
	 return text;
	}
	

}
