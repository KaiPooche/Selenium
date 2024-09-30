package Regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
@Test(priority=1)
public void doLogin() 
{
	
System.out.println("Exexcuting Login Test");

}
@AfterMethod
public void doUserReg() 
{
	
System.out.println("Exexcuting User Reg Test");

}
@Test(priority=2)
public void doChecking() 
{
	
System.out.println("Exexcuting Checking Test");

}
@BeforeMethod
public void LaunchBrowser() 
{
	
System.out.println("Launching Browser");
}
}
