package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.CreateNewAccountPage;
import pomClasses.LoginOrSignupPage;

public class TestClass1 {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com/");
   
    LoginOrSignupPage loginOrSignupPage=new LoginOrSignupPage(driver);
    
    loginOrSignupPage.senduserName();
    loginOrSignupPage.sendPassword();
    loginOrSignupPage.clickONLoginbutton();
    
  
//    CreateNewAccountPage createNewAccountPage=new CreateNewAccountPage(driver);
//    createNewAccountPage.clickOnCreateNewAccount();
//    
    
		
	}

}
