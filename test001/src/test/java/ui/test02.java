package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test02 {
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

		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//		driver.close();
	}

}
