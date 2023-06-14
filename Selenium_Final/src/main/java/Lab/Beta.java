package Lab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Beta {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger("Lab_Login1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);
        
		driver.get("https://beta-nftmarketplace.netlify.app/");
		ac.scrollByAmount(0, 500);
		driver.findElement(By.xpath("//a[@href='https://discord.gg/bKUaZE64Na']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='#ATW']")).click();
		Thread.sleep(20000);
		driver.close();
        
	}

}
