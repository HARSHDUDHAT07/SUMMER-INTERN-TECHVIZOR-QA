
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

public class testNG_Annotations2 {
	@BeforeMethod
	public void RegiUser() {
		System.out.println("This is Register User");
	}

	@Test(priority=1)
	public void ValidLoginCredential() {
		System.out.println("This is valid login credential");
	}

	@Test(priority=2)
	public void HomePage() {
		System.out.println("This is home page");
	}

	@Test(priority=3)
	public void Addbaneficiery() {
		System.out.println("This is add banificitery");
	}

	@Test(priority=4)
	public void validatebanificiery() {
		System.out.println("This is validate baneficiery");
	}

	@AfterMethod
	public void logout() {
		System.out.println("This is logout");
	}

}
