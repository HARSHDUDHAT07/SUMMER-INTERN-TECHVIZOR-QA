package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test03 {
	public static String browser = "Edge";
	public static WebDriver driver;

//    public static ChromeDriver driver1;
//    public static EdgeDriver driver2;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\browserdrivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("google.com");
        WebElement p= driver.findElement(By.id("password"));
//       driver.elactiveLocator.with(By.tagName("input")).above(By.id("password")).sendKeys("Testing");
        
	}

}
