package Regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void validateTitles() {
		String expected_title="Yahoo.com";
		String actual_title="Gmail.com";
		SoftAssert soft=new SoftAssert();
		System.out.println("Validating Title");
		soft.assertEquals(actual_title, expected_title);
		System.out.println("Validating Image");
		soft.assertEquals(true, false,"Image not present");
		System.out.println("Validating textbox");
		soft.assertEquals(true, false,"textbox not present");
		soft.assertAll();
	}
}
