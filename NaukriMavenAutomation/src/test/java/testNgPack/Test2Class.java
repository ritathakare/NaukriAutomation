package testNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.ResumePage;

public class Test2Class {
	
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Rita\\Downloads\\geckodriver-v0.32.1-win32\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
	}
	
	@BeforeClass
	public void openBrowser() 
	{
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver=new ChromeDriver();*/
	driver.get("https://www.firstnaukri.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	 System.out.println("befor_method");	
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		ResumePage resumePage = new ResumePage(driver);
		resumePage.resumeMaker();
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL = "https://www.firstnaukri.com/resume-maker";
		
		if(actualURL.equals(expectedURL))
		{
		 System.out.println("Test_Passed");
		}
		else
		{
		System.out.println("Test_Failed");
		}
		Thread.sleep(2000);
		resumePage.createResumeButton();
		
		Thread.sleep(2000);
		resumePage.sendEmailid();
		
		Thread.sleep(2000);
		resumePage.sendPassword();
		
		Thread.sleep(2000);
		resumePage.createaccountButton();
		
		Thread.sleep(2000);
		resumePage.verifyText();
	}

	@AfterMethod
	public void aftermethod()
	{
	 System.out.println("After_Method");	
	 
	}
	@AfterClass
	public void afterclass()
	{
	 System.out.println("After_Class");	
	}
	@AfterTest()
	public void afterTest()
	{
		System.out.println("After Test");
		driver.quit();
	}
	
}
