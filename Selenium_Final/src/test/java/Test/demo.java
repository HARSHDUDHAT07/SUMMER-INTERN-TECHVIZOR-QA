package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportbase.ExtentReportManager;

import com.*;

public class demo {

	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;

	@BeforeMethod
	public void initialize() {
		extent=ExtentReportManager.getReports();
		test = extent.createTest("Login test");

	}

	@Test
	public void login() {
		test.log(Status.INFO, "Registration successfull");
		test.log(Status.INFO, "Login successfull");
//		test.log(Status.FAIL, "ADD_LAB successfull");
//		Assert.fail();
		test.log(Status.INFO, "PAYMENT successfull");
		test.log(Status.INFO, "LOGOUT successfull");
		test.log(Status.INFO, "LOG successfull");
	}

	@Test
	
	@AfterMethod
	public void finish() {
		extent.flush();
	}

}
