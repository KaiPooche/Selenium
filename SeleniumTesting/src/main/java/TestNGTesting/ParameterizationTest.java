package TestNGTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest {

	@Test(dataProvider="getData")
	public void doLogin(String username,String password) {
		
		System.out.println(username+"-----"+password);
	}
	@DataProvider
	public Object[][] getData() {
		System.out.println("in getdata");
		Object[][] data= new Object[3][2];
		data[0][0]="trainer@way2.com";
		data[0][1]="sgdfh";
		
		data[1][0]="adcr@way2.com";
		data[1][1]="sgdfh";
		
		data[2][0]="xfhxdfj@way2.com";
		data[2][1]="sgdfh";
		return data;
	}
}
