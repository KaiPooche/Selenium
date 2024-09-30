package TestNGTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
@Test(priority=1,groups="Functional")
public void doLogin() 
{
	
System.out.println("Exexcuting Login Test");

}
@Test(groups="smoke")
public void doUserReg() 
{
	
System.out.println("Exexcuting User Reg Test");

}
@Test(priority=2,groups="Functional")
public void doChecking() 
{
	
System.out.println("Exexcuting Checking Test");

}
@Test(groups="smoke")
public void LaunchBrowser() 
{
	
System.out.println("Launching Browser");
}
}
