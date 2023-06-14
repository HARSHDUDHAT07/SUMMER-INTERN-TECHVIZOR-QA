package ui;

import java.util.*;
//import java.util.logging.LogManager;
//import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
////import io.opentelemetry.api.logs.Logger;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LivePro {

	public static void main(String arge[]) throws Exception {

		{
			System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
			 Logger log = LogManager.getLogger("Lab_Login1");
//			 ChromeOptions co = new ChromeOptions();
//		     co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver();
			driver.get("http://testadmin.healthismplus.com/admin/lab");
			 log.info("URL launch successfully.");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// log.info("Window Maximized.");

			WebElement login_ui = driver.findElement(By.xpath("//input[@id='mobile-no']"));
			login_ui.sendKeys("9904870054");
			// log.info("Login ID entered successfully.");

			WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
			login_btn.click();
			// log.info("");

			WebElement login_pw = driver.findElement(By.xpath("//input[@id='otp']"));
			login_pw.sendKeys("7600905998");
			// log.info("OTP entered successfully.");

			WebElement login_btn1 = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
			login_btn1.click();
			// log.info("Admin Logged-in successfully. ");

			// driver.quit();
		}

	}
}