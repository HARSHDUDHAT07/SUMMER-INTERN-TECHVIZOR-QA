package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Annotations");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("This is Before Test Annotations");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("This is Before Class Annotations");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is Before Method Annotations");
	}

	@Test
	public void logintest() {
		System.out.println("This is Test case");
	}

	@Test
	public void regitest() {
		System.out.println("This is registration test");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("This is After Method Annotations");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("This is After Class Annotations");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("This is After Test Annotations");
	}

	@AfterSuite
	public void aftereSuite() {
		System.out.println("This is After Suite Annotations");
	}

}
