package TestNGTesting;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(priority=2,dependsOnMethods="doUserReg")
	public void doLogin() 
	{
		
	System.out.println("Exexcuting Login Test");

	}
	@Test(priority=1)
	public void doUserReg() 
	{
		
	System.out.println("Exexcuting User Reg Test");
	Assert.fail("User not registered Sucessfully");

	}
	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true)
	public void doChecking() 
	{
		
	System.out.println("Exexcuting Checking Test");

	}
	@Test(priority=4,dependsOnMethods="doUserReg")
	public void LaunchBrowser() 
	{
		
	System.out.println("Launching Browser");
	}
}
