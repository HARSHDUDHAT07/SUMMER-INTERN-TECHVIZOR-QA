package extentreportbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;

	public static ExtentReports getReports()
	{
		if(extent==null)
		{
			extent = new ExtentReports();
			spark = new ExtentSparkReporter("Extent_Report/spark.html");
			spark.config().setReportName("First report");
			spark.config().setDocumentTitle("Demo report");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			extent.attachReporter(spark);
		}
		return extent;
	}
}
