package TESTNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.*;

public class loginTest {

	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;

	@BeforeMethod
	public void initialize() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("Extent_Report/spark.html");
		spark.config().setReportName("First report");
		spark.config().setDocumentTitle("Demo report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		extent.attachReporter(spark);
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
