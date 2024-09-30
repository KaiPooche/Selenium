package TestNGTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public WebDriver mydriver;
	
	public WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			//WebDriverManager.chromedriver.setup();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			//WebDriverManager.firefoxdriver.setup();
			driver=new FirefoxDriver();
	}
		return driver;
}
}
