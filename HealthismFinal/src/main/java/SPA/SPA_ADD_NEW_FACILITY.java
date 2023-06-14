package SPA;

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

public class SPA_ADD_NEW_FACILITY {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger("SPA_ADD_NEW_FACILITY");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);

		driver.get("http://testadmin.healthismplus.com/mbs?type=mbs");
		driver.manage().window().maximize();
		log.info("Screen Maximize Done ");
		Thread.sleep(1500);

		WebElement login_ui = driver.findElement(By.xpath("//input[@id='mobile-no']"));
		login_ui.sendKeys("7777777777");
		log.info("MobileNo Entered SucessFully ");

		WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login_btn.click();

		Thread.sleep(1500);

		WebElement login_pw = driver.findElement(By.xpath("//input[@id='otp']"));
		login_pw.sendKeys("7600905998");
		log.info("OTP Validate SuccessFully");

		WebElement login_btn1 = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login_btn1.click();
		Thread.sleep(1000);
		log.info("Spa Login SucessFully ");

		WebElement Master_menu = driver.findElement(By.xpath("//ul[@id='main-menu-navigation']"));
		Master_menu.click();
		Thread.sleep(1000);
		log.info("click on Master Menu SucessFully ");

		WebElement Manage_facility = driver.findElement(By.xpath("//span[contains(text(),'Manage Facility')]"));
		Manage_facility.click();
		Thread.sleep(1000);
		log.info("Manage Facility Perform SucessFully ");

		WebElement Add_new_Facility = driver.findElement(By.xpath("//a[contains(text(),'Add New Facility')]"));
		Add_new_Facility.click();
		Thread.sleep(1000);
		log.info("click on add new Facility perform SucessFully ");

		// Facility Details Begin
		Thread.sleep(1500);

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("RADHE" + Keys.TAB + Keys.ENTER);
		log.info("Name Filled Si=uccessfully");

		WebElement Gender = driver.findElement(By.xpath("//input[@aria-controls='select2-gender-results']"));
		Gender.click();
		Gender.sendKeys("Male" + Keys.ENTER + Keys.TAB + Keys.ENTER);
		log.info("Gender Update SucessFully");

		Thread.sleep(1500);
		WebElement status = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		status.click();
		status.sendKeys("Active" + Keys.ENTER);
		log.info("Status Update SucessFully");

		Thread.sleep(1000);
		WebElement Description = driver.findElement(By.xpath("//textarea[@name='description']"));
		Description.sendKeys("Welcome" + Keys.TAB + Keys.ENTER);
		log.info("Description Entered SucessFully");

		Thread.sleep(1000);
		WebElement price = driver.findElement(By.xpath("//input[@id='price']"));
		price.sendKeys("5000");
		log.info("Price Entered SucessFully");

		ac.sendKeys(Keys.PAGE_DOWN);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1500);
		WebElement is_package = driver.findElement(By.xpath("//input[@id='is_package']"));
		is_package.click();
		log.info("Is packaged on/off SucessFully");

		Thread.sleep(1500);
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(1000);
		WebElement package_category = driver
				.findElement(By.xpath("//input[@aria-controls='select2-package_category-results']"));
		package_category.sendKeys("Gold" + Keys.ENTER + Keys.TAB + "2 hour");
		log.info("Package category and time Updated SucessFully");

		Thread.sleep(1000);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		log.info("Facility Details Updated Successfully");

		// Facility Additional Details Begain
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Facility Additional Details')]")).click();
		log.info("Going in to Facility_Additional_Details");

		Thread.sleep(1000);
		WebElement Total_facility_Count = driver.findElement(By.xpath("//input[@name='facility_count']"));
		Total_facility_Count.sendKeys("2" + Keys.TAB + "Face Wash");
		log.info("Going in tTotal Facility count and Facility Title are entered Successfully");

		log.info("Facility Additional Details are Filled Successfully");

		Thread.sleep(1000);
		WebElement save_changes = driver.findElement(By.xpath("//button[@type='submit']"));
		save_changes.click();
		log.info("save Changes Perform Successfully");

		Thread.sleep(1500);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		WebElement BackButton = driver.findElement(
				By.xpath("//a[@href='http://testadmin.healthismplus.com/mbs/facility?menu_based_service_id=1']"));
		BackButton.click();
		log.info("back Perform Successfully");

		Thread.sleep(20000);
		driver.quit();
		driver.close();

	}
}