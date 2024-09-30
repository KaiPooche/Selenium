package TestNGTesting;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {

	@Test (invocationCount=5)
	public void execute() {
		driver=getDriver("chrome");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
