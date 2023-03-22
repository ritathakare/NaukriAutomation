package testNgPack;
/*Rita thakare 20th august */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Browser;
import pomClasses.JobsRegisterPage;

public class Test1Class extends Browser {
	
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		//System.out.println("Before Suite");
		System.out.println("Before Suite for conflict");
	}
	
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			driver = openFirefoxBrowser();
		}
	}
	
	@BeforeClass
	public void openBrowser() 
	{
	driver.get("https://www.firstnaukri.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	  System.out.println("Before_Method");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		try {
	JobsRegisterPage jobsRegisterPage = new JobsRegisterPage(driver);
	jobsRegisterPage.jobSearch();
	String actualUrl = driver.getCurrentUrl();
	System.out.println(actualUrl);
//	String actualUrl = "https://www.firstnaukri.com/jobs-internship";
	String expectedUrl = "https://www.firstnaukri.com/jobs-internship";
	System.out.println(expectedUrl);

	Thread.sleep(3000);
//	String actualTitle=driver.getTitle();
//	System.out.println(actualTitle);
//	String expectedTitle= "";
	
//	if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle) )
//	{
//	System.out.println("Test1_Passed");
//	driver.navigate().back();
//	}
//	else 
//	{
//	 System.out.println("Test1_Failed");	
//	}
	
	//To compare the actual and expected result
   //To decide the test method result i.e.passed/failed
  //If actual result is equals to expected result then test case is passed
 //If actual result is not equals to expected result then test case is failed
	Assert.assertEquals(actualUrl, expectedUrl, "The URL is not matched");
   //  Assert.assertEquals(actualUrl, expectedUrl);

		}
		catch (Exception e)
		{
			System.out.println("Error is::" + e);
		}
	}
	
	@Test(enabled = true)
	public void test2() throws InterruptedException
	{
	 try 
	 {
		 
     JobsRegisterPage jobsRegisterPage = new JobsRegisterPage(driver);
     jobsRegisterPage.registerbutton();
     String actualUrl = driver.getCurrentUrl();
     System.out.println("actualrl: "+ actualUrl);
     Thread.sleep(3000);
     String actualTitle=driver.getTitle();
     System.out.println("actualitle: "+ actualTitle);
    
     String expectedUrl="https://www.firstnaukri.com/jobseeker/registration?othersrcp=homepage&utm_source=MHomePage&utm_medium=Link&utm_campaign=Mobile_Homepage";
     String expectedTitle="Register on Firstnaukri.com-Apply for Freshers Jobs";
     if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
     {
     System.out.println("Test2_Passed");
     }
     else
     {
      System.out.println("Test2_Failed"); 
     }
     Thread.sleep(5000);
    // jobsRegisterPage.verifyButtonText();
   //  Thread.sleep(1000);
     jobsRegisterPage.registerbutton();
     
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
    }
	@Test(enabled = true)
	public void test3() throws InterruptedException
	{
		 JobsRegisterPage jobsRegisterPage = new JobsRegisterPage(driver);
		 Thread.sleep(3000);
	     boolean actname = jobsRegisterPage.verifysendname();
	     if(actname ==true)
	     {
	    	 System.out.println("Full name field is enabled");
	     }
	     else 
	     {
	    	 System.out.println("Full name field is disabled");
	     }
	     jobsRegisterPage.sendFullName();
	     Thread.sleep(1000);
	     jobsRegisterPage.sendEmail();
	     Thread.sleep(1000);
	     jobsRegisterPage.sendPassword();
	     Thread.sleep(1000);
	     jobsRegisterPage.verifyCheckbox();
	     Thread.sleep(1000);
	     jobsRegisterPage.registerNowButton();
	     Thread.sleep(1000);
	     jobsRegisterPage.verifyText();
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
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		driver.quit();
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite for TestNg Class 1 ");
	}
	
}