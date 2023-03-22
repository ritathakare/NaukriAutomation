package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	
	public static WebDriver openChromeBrowser()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	    return driver; 
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rita\\Downloads\\geckodriver-v0.32.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
}
