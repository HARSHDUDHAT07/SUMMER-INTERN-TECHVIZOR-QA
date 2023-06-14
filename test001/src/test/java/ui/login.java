package ui;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static String browser = "Edge";
	public static WebDriver driver;

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

		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//		driver.get("https://www.saucedemo.com/cart.html");
//		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
//		driver.findElement(By.className("bm-burger-button")).click();
//		driver.findElement(By.linkText("Logout")).click();
		driver.manage().window().maximize();

//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("The Current Url is : " + currentUrl);
//
//		String Title = driver.getTitle();
//		System.out.println("The Title is : " + Title);
//
//		String pages = driver.getPageSource();
//		System.out.println("The Title is : " + pages);
//
		List<WebElement> webElements = driver.findElements(By.className("inventory_item"));
		System.out.println(webElements);

		driver.navigate().to("https://www.lenskart.com/");
		String s1 = driver.getWindowHandle();
		System.out.println(s1);

		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> s2 = driver.getWindowHandles();
        System.out.println(s2);
        

        driver.quit();
	}
}
