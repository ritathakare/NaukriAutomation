package testNgPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println("Test");
		
		String actualURL = "https://www.firstnaukri.com/jobs-internship";
		String expectedURL = "https://www.firstnaukri.com/jobs-internship";
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	

}
