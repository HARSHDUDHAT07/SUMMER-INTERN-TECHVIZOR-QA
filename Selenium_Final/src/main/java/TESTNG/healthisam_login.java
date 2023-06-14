package TESTNG;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class healthisam_login {
	Logger log = LogManager.getLogger("Lab_BookTest_digilab");
//	WebDriverManager.chromedriver().setup();
	public static WebDriver driver = new ChromeDriver();
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions ac = new Actions(driver);
	public static void main()
	{
		
	}
	
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	@Test(priority = 1, enabled = true)
	public void login() throws Exception {
	
		driver.get("http://testadmin.healthismplus.com/admin/lab");
		driver.manage().window().maximize();
		log.info("Screen Maximize Done ");
		Thread.sleep(1500);

		WebElement login_ui = driver.findElement(By.xpath("//input[@id='mobile-no']"));
		login_ui.sendKeys("9904870054");
		log.info("MobileNo Entered SucessFully ");

		WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
		login_btn.click();

		Thread.sleep(1500);
	}

	@Test(priority = 2, enabled = true)
	public void add_lab() throws Exception {
		WebElement login_pw = driver.findElement(By.xpath("//input[@id='otp']"));
		login_pw.sendKeys("7600905998");
		log.info("OTP Validate SuccessFully");

		WebElement login_btn1 = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
		login_btn1.click();
		Thread.sleep(1000);
		log.info("Admin Login SucessFully ");

		WebElement leb_menu = driver.findElement(By.xpath("//body/div[2]/div[3]/ul[1]/li[2]/a[1]"));
		leb_menu.click();
		log.info("Leb menu open SucessFully");
		Thread.sleep(1000);

		WebElement Book_test = driver.findElement(By.xpath("//span[@data-i18n='Booked Test']"));
		Book_test.click();
		Thread.sleep(1000);
		log.info("Book Test open SucessFully");

		WebElement Direct_call = driver
				.findElement(By.xpath("//a[@href='http://testadmin.healthismplus.com/admin/lab/booked/direct-call']"));
		Direct_call.click();
		Thread.sleep(1000);
		log.info("Direct_call open SucessFully");

		WebElement card_no = driver.findElement(By.xpath("//input[@name='card_no']"));
		card_no.sendKeys("7306288119151186");
		Thread.sleep(1000);
		log.info("Card_no Entered SucessFully");

		WebElement Search_Button = driver.findElement(By.xpath("//button[@type='submit']"));
		Search_Button.click();
		Thread.sleep(1000);
		log.info("Search_Button Click SucessFully");

		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		WebElement Continue_Button = driver.findElement(By.xpath("//button[@id='select-user']"));
		Continue_Button.click();
		Thread.sleep(1000);
		log.info("Continue_Button Click SucessFully");

		// Lab Details
		WebElement lab_name = driver.findElement(By.xpath("//input[@placeholder='Lab Name']"));
		lab_name.sendKeys("digi" + Keys.TAB + Keys.TAB + Keys.ENTER);
		Thread.sleep(1000);
		log.info("lab_name Write SucessFully");

		Thread.sleep(1000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(1000);
		WebElement select_Lab = driver.findElement(By.xpath("//a[@data-parent-id='0']"));
		select_Lab.click();
		Thread.sleep(1000);
		log.info("Select_lab Perform SuccessFully");
		log.info("Lab Details are Enetered SuccessFully");

		// Select Test Begin
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);

		WebElement Add_test = driver.findElement(By.xpath("//a[@data-test-id='5']"));
		Add_test.click();
		log.info("Add_Test perform Successfully");
		Thread.sleep(3000);

		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
//		WebElement Next_step_1 = driver.findElement(By.xpath("//button[@data-stepper-action='next']"));
//		Next_step_1.click();
		Thread.sleep(1000);

		// select collection and detail
		Thread.sleep(2000);
		WebElement Select_type = driver
				.findElement(By.xpath("//span[@aria-labelledby='select2-collection-container']"));
		Select_type.click();
		log.info("Type selection perform Successfully");

		driver.findElement(By.xpath("//input[@aria-controls='select2-collection-results']"))
				.sendKeys("At Lab" + Keys.ENTER);
		log.info("Collection Select SuccessFully");
		log.info("Collection and Details are Filled Successfully");
		Thread.sleep(1000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();

		// slect patienbegin
		Thread.sleep(2000);
		WebElement slot = driver.findElement(By.xpath("//a[@data-slot-id='196']"));
		slot.click();
		Thread.sleep(1000);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		log.info("Slot Selected Successfully");

		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		WebElement select_patient = driver.findElement(By.xpath("//a[@data-patient-id='152']"));
		select_patient.click();
		Thread.sleep(2000);
		log.info("Select Patient Perform Successfully");

		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		// select Address
		WebElement select_Address = driver.findElement(By.xpath("//a[@data-address-id='25']"));
		select_Address.click();
		log.info("Select Address perform Successfully");
		Thread.sleep(2000);

		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();

		// order Detail Begin
		Thread.sleep(2000);
		ac.sendKeys(Keys.TAB).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement offline = driver.findElement(By.xpath("//a[@data-payment-id='1']"));
		offline.click();
		log.info("offline Payment Perform SuccessFully");
		Thread.sleep(2000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1500);
		log.info("Order Details Verify");
		log.info("Order Status Verify");

		// go to home
		Thread.sleep(2000);
		WebElement gotohome = driver.findElement(By.xpath("//a[contains(text(),'Go To Home')]"));
		gotohome.click();
		log.info("Go to Home Successfully Executed");
	}
}
