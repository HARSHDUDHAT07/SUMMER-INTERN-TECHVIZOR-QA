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

public class Lab_LabMaster_AddNewLab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger("Lab_Login1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);

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

		WebElement Lab_Master = driver
				.findElement(By.xpath("//body[1]/div[2]/div[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
		Lab_Master.click();
		Thread.sleep(1000);
		log.info("Lab Master open SucessFully");

		WebElement Add_New_Lab = driver.findElement(By.xpath("//a[contains(text(),'Add New Lab')]"));
		Add_New_Lab.click();
		Thread.sleep(1000);
		log.info("Click on Add New lab SucessFully");

		// Details
//		WebElement user = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
//	    user.sendKeys("User123");
//		log.info("");

		WebElement contact_person = driver.findElement(By.xpath("//input[@id='contact_person']"));
		contact_person.sendKeys("Mira Kumari");
		log.info("Contact Person Entered SucessFully");

		Thread.sleep(1500);
//		js.executeScript("window.scrollBy(0,600)");

		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Krishna" + Keys.TAB + "2610578964" + Keys.TAB + "8347107895" + Keys.TAB + "kvg@gmail.com"
				+ Keys.TAB + 30 + Keys.TAB + Keys.ENTER);
		log.info("Name, Mobileno, EmailId and Discount Added SucessFully");

		Thread.sleep(1500);
		WebElement status = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		status.click();
		status.sendKeys("Approved" + Keys.ENTER);
		log.info("Status Update SucessFully");

		Thread.sleep(1500);
		WebElement Virtual_Loc = driver.findElement(By.xpath("//input[@name='virtual_location']"));
		Virtual_Loc.click();
		log.info("Virtual Location Entered SucessFully");

		WebElement address1 = driver.findElement(By.xpath("//textarea[@name='address1']"));
		address1.sendKeys("4th Floor, Roongta group");
		log.info("AddressLine1 Added SucessFully");

		WebElement address2 = driver.findElement(By.xpath("//textarea[@name='address2']"));
		address2.sendKeys("Surat, Gujarat");
		log.info("AddressLine1 Added SucessFully");

		WebElement area_pin = driver.findElement(By.xpath("//input[@name='area']"));
		area_pin.sendKeys("VIP Road" + Keys.TAB + "395006" + Keys.TAB + Keys.ENTER);
		log.info("Area Eneteres AddressLine1 Added SucessFully");

		Thread.sleep(1500);
		WebElement state = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		state.click();
		state.sendKeys("Gujarat" + Keys.ENTER + Keys.TAB + Keys.ENTER);
		log.info("State Entered SucessFully");

		Thread.sleep(1500);
		WebElement city = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		city.click();
		city.sendKeys("Surat" + Keys.ENTER);
		log.info("City Entered SucessFully");

		WebElement Latitude_Longitude = driver.findElement(By.xpath("//input[@name='latitude']"));
		Latitude_Longitude.sendKeys("20.703133" + Keys.TAB + "73.144048");
		log.info("Latitude Entered SucessFully");

		WebElement Description = driver.findElement(By.xpath("//textarea[@name='description']"));
		Description.sendKeys("Welcome" + Keys.TAB + Keys.ENTER);
		log.info("Description Entered SucessFully");

		Thread.sleep(1500);
		// photo
		Runtime.getRuntime().exec("C:\\Eclipse_workspace\\fileupload.exe" + " "
				+ "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\images.jpeg");

		Thread.sleep(1500);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		log.info("Lab Details Updated SuccessFully");
//		js.executeScript("window.scrollBy(1000,0)");

		// LabDocuments Begin
		Thread.sleep(1500);
		WebElement LabDocuments = driver.findElement(By.xpath("//button[@aria-selected='false']"));
		LabDocuments.click();
		log.info("open LabDocuments");

		Thread.sleep(2500);
		WebElement LabGalleryImages1 = driver.findElement(By.xpath("//div[@id='id_dropzone']"));
		LabGalleryImages1.click();
		Runtime.getRuntime().exec("C:\\Eclipse_workspace\\fileupload.exe" + " "
				+ "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\BANK_STATEMENT.png");
		log.info("Picture1 Upload SucessFully");

		Thread.sleep(2500);
		LabGalleryImages1.click();
		Runtime.getRuntime().exec("C:\\Eclipse_workspace\\fileupload.exe" + " "
				+ "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\images.jpeg");
		log.info("Picture2 Upload SucessFully");

		Thread.sleep(2500);
		WebElement PancardNum = driver.findElement(By.xpath("//input[@name='pancard_number']"));
		PancardNum.click();
		PancardNum.sendKeys("ANZPW1483D");
		log.info("PanNumber Entered SuccessFully");

		WebElement GSTNum = driver.findElement(By.xpath("//input[@name='gst_number']"));
		GSTNum.click();
		GSTNum.sendKeys("1234567892" + Keys.TAB + Keys.ENTER);
		log.info("GSTNumber Entered SuccessFully");

		Thread.sleep(2500);
		// pancard
		Runtime.getRuntime().exec("C:\\Eclipse_workspace\\fileupload.exe" + " "
				+ "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\pancard.jpg");
		log.info("Pancard Uploaded SuccessFully");

		Thread.sleep(2500);
		// GST Certiphicate
		ac.sendKeys("" + Keys.TAB + Keys.ENTER).build().perform();
		Runtime.getRuntime().exec(
				"C:\\Eclipse_workspace\\fileupload.exe" + " " + "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\GST.jpeg");
		log.info("GST Certificate Uploaded SuccessFully");

		Thread.sleep(1500);
		WebElement BankAcNum = driver.findElement(By.xpath("//input[@name='bank_account_number']"));
		BankAcNum.click();
		BankAcNum.sendKeys("12584963248" + Keys.TAB + "RAMBHAI" + Keys.TAB + "State Bank of India" + Keys.TAB
				+ "SBIN0060466" + Keys.TAB + Keys.ENTER);
		log.info("BankAccountNumber, AccountHolderName, BankName and IFSCCode Filled SuccessFully");

		Thread.sleep(2500);
		// NABL Document
		Runtime.getRuntime().exec(
				"C:\\Eclipse_workspace\\fileupload.exe" + " " + "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\NABL.jpeg");
		log.info("NABL Certificate Added SuccessFully");

		Thread.sleep(2500);
		// MOU Certificate
		ac.sendKeys("" + Keys.TAB + Keys.ENTER).build().perform();
		Runtime.getRuntime().exec(
				"C:\\Eclipse_workspace\\fileupload.exe" + " " + "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\MOU.jpg");
		log.info("MOU Certificate Added SuccessFully");

		Thread.sleep(1500);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1500);
		log.info("Lab Documents Filled SuccessFully");

		// Lab Policy & Timing begin
		WebElement LabpolicyTiming = driver.findElement(By.xpath("//div[@data-target='#lab-details-info2']"));
		LabpolicyTiming.click();
		log.info("Lab Policy & Timing Open");

		Thread.sleep(1000);
		WebElement days = driver
				.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		Thread.sleep(2000);
		days.sendKeys("Friday" + Keys.ENTER + "Tuesday" + Keys.ENTER + Keys.TAB);
		Thread.sleep(1500);
		log.info("Days Filled SucessFully");

//		Select day= new Select(driver.findElement(By.id("start_time")));
		driver.findElement(By.xpath("//li[@aria-label='02:30 AM']")).click();
		Thread.sleep(1000);
		log.info("StartTime and EndTime Selected SucessFully");
//		ac.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("//li[@aria-label='03:00 AM']")).click();

		WebElement Add = driver.findElement(By.xpath("//a[@id='add-time']"));
		Add.click();
		log.info("Add Time SucessFully");

		// slot detail
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-key='Tuesday']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@data-key='Friday']")).click();
		log.info("Slot Detail Updated SuccessFully");

		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		// Cancellation Policy
		Thread.sleep(1500);
		driver.findElement(By.name("cash_booking_allowed")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("cancellation_allowed")).click();
		log.info("cash booking allowed and cancellation allowed are perform SuccessFully ");

		// Cancellation Policy Setting
		Thread.sleep(1500);
		WebElement hours = driver.findElement(By.xpath("//input[@name='cancel_policy_setting[0][hours]']"));
		hours.click();
		hours.sendKeys("3");
		log.info("Hours Entered SuccesFully");

		WebElement Charge = driver.findElement(By.xpath("//input[@name='cancel_policy_setting[0][charge]']"));
		Charge.click();
		Charge.sendKeys("3000");
		log.info("Charge Entered SuccessFully");

		log.info("Lab Policy & Timing Added SuccessFully");

		WebElement Savechanges = driver.findElement(By.xpath("//button[@type='submit']"));
		Savechanges.click();
		log.info("Lab Adding SuccessFully");

		WebElement BackButton = driver
				.findElement(By.xpath("//a[@href='http://testadmin.healthismplus.com/admin/lab']"));
		BackButton.click();
		Thread.sleep(20000);
		driver.quit();

	}

}
