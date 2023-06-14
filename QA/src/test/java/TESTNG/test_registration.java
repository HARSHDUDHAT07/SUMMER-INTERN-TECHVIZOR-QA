package TESTNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportbase.ExtentReportManager;

public class test_registration {
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;

	@BeforeMethod
	public void initialize_test_regi() {
		extent=ExtentReportManager.getReports();
		test = extent.createTest("Login make test");
	}

	@Test
	public void login_test_Regi() {
		test.log(Status.INFO, "Registration successfull");
		test.log(Status.INFO, "Login successfull");
		test.log(Status.FAIL, "ADD_LAB successfull");
		Assert.fail();
		test.log(Status.INFO, "PAYMENT successfull");
		test.log(Status.INFO, "LOGOUT successfull");
		test.log(Status.INFO, "RAM successfull");
	}
	
	@AfterMethod
	public void finish_test_regi() {
		extent.flush();
	}
}
