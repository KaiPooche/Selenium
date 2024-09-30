package TestNGTesting;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider (name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] data=null;
		if(m.getName().equals("testLogin")) {
			
		
		 data=new Object[2][2];
		data[0][0]="Deepti";
		data[0][1]="dhdfj";
		
		data[1][0]="Ankit";
		data[1][1]="kgmfm";
		}else if (m.getName().equals("testUserReg")) {
			data=new Object[2][3];
			data[0][0]="Deepti";
			data[0][1]="Dia";
			data[0][2]="abc@email";
			
			data[1][0]="Ankit";
			data[1][1]="Mahatma";
			data[1][2]="xyz@email";
			
		}
		
		return data;
		
	}
	/*	
		@DataProvider (name="dp2")
		public static Object[][] getData2(){
			Object[][] data=new Object[2][3];
			data[0][0]="Deepti";
			data[0][1]="Dia";
			data[0][2]="abc@email";
			
			data[1][0]="Ankit";
			data[1][1]="Mahatma";
			data[1][2]="xyz@email";
			return data;
	*/
	}
	
	

