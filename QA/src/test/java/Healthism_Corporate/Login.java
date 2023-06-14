package Healthism_Corporate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Login {
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	Logger log = LogManager.getLogger("Admin_Add_New_Lab");

	public static WebDriver driver = new ChromeDriver();

	Actions ac = new Actions(driver);

	public void main() {
		driver.get("http://testadmin.healthismplus.com/corporate/auth-login");
		driver.manage().window().maximize();
	}
}
