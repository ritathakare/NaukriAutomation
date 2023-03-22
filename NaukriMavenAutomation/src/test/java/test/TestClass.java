package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.JobsRegisterPage;
import pomClasses.ResumePage;

public class TestClass {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.get("https://www.firstnaukri.com/");
	driver.manage().window().maximize();
	JobsRegisterPage jobsRegisterPage = new JobsRegisterPage(driver);
	
	jobsRegisterPage.jobSearch();
	driver.navigate().back();
	jobsRegisterPage.registerbutton();
	jobsRegisterPage.sendFullName();
	jobsRegisterPage.sendEmail();
	jobsRegisterPage.sendPassword();
	jobsRegisterPage.verifyCheckbox();
	jobsRegisterPage.registerNowButton();
	
    driver.navigate().back();
    
    ResumePage resumePage = new ResumePage(driver);

	
   
	
	
	}

}
