package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResumePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Resume Maker']")
	private WebElement resumemaker;
	
	@FindBy(xpath="//a[text()='Create resume now!']")
	private WebElement createresume;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='Create account']")
	private WebElement createaccount;
//Constructor
	public ResumePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void resumeMaker() {
		resumemaker.click();
	}
	public void createResumeButton() {
		createresume.click();
	}
	public void sendEmailid(){
		emailid.sendKeys("velocity@gmail.com");
	}
	public void sendPassword() {
		pass.sendKeys("gs58kjd#ns");
	}
	public void createaccountButton() {
		createaccount.click();
	}
	public String verifyText()
	{
		String text = createaccount.getText();
		return text;
	}

}
