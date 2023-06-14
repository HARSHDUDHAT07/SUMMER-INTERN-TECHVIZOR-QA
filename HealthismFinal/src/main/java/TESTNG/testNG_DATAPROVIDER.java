package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_DATAPROVIDER {
	@Test(dataProvider="getData")
	public void dataMatrix(String Username, String Password, int mobile, String Browser) {
  
	}

	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];

		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = "8954689";
		data[0][3] = "Browser";
		
		data[1][0] = "Krishna";
		data[1][1] = "Radhe";
		data[1][2] = "8647895";
		data[1][3] = "Mojila";
		
		data[2][0] = "Ram";
		data[2][1] = "Sita";
		data[2][2] = "5896548";
		data[2][3] = "Safari";
		return data;

	}
}