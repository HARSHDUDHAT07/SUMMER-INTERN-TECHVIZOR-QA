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

public class SPA_ADD_BRANCH {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger("SPA_ADD_BRANCH");
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

		WebElement Manage_branch = driver.findElement(By.xpath("//span[contains(text(),'Manage Branch')]"));
		Manage_branch.click();
		Thread.sleep(1000);
		log.info("Manage Branch Perform SucessFully ");

		WebElement Add_new_branch = driver.findElement(By.xpath("//a[contains(text(),'Add New Branch')]"));
		Add_new_branch.click();
		Thread.sleep(1000);
		log.info("click on add new branch perform SucessFully ");

		// Menu Based Service Details Begin
		WebElement contact_person = driver.findElement(By.xpath("//input[@id='contact_person']"));
		contact_person.sendKeys("Gopal Sharma");
		log.info("Contact Person Entered SucessFully");

		Thread.sleep(1500);

		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Radha" + Keys.TAB + "2610578589" + Keys.TAB + "8342507899" + Keys.TAB + "kvg356@gmail.com"
				+ Keys.TAB + Keys.ENTER);
		log.info("Name, Mobileno, EmailId and Discount Added SucessFully");

		Thread.sleep(2000);
		WebElement status = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		status.click();
		status.sendKeys("Active" + Keys.ENTER + Keys.TAB + Keys.ENTER);
		log.info("Status Update SucessFully");

		Thread.sleep(1500);
		WebElement Gender = driver.findElement(By.xpath("//input[@aria-controls='select2-gender-results']"));
		Gender.click();
		Gender.sendKeys("Male" + Keys.ENTER);
		log.info("Gender Update SucessFully");

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

		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1500);
		// photo
		Runtime.getRuntime().exec("C:\\Eclipse_workspace\\fileupload.exe" + " "
				+ "C:\\Users\\HP\\Desktop\\TechVizor\\photos\\images.jpeg");
		Thread.sleep(1500);

		Thread.sleep(1500);
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		log.info("Menu Based Service Details Updated SuccessFully");

		// Menu Based Service Documents begin
		Thread.sleep(1500);
		WebElement MBS = driver.findElement(By.xpath("//button[@aria-selected='false']"));
		MBS.click();
		log.info("open Menu based service Documents");

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
		log.info("Menu Based Service Documents Uploded SuccessFully");
		Thread.sleep(2500);

		// Menu based policy service Policy & Timing begin
		WebElement mbspolicyTiming = driver
				.findElement(By.xpath("//span[contains(text(),'Menu Based Service Policy & Timing')]"));
		mbspolicyTiming.click();
		log.info("Menu Based Service Policy & Timing Open");

		Thread.sleep(1000);
		WebElement days = driver
				.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		Thread.sleep(2000);
		days.sendKeys("Wednesday" + Keys.ENTER + "Tuesday" + Keys.ENTER + Keys.TAB);
		Thread.sleep(1500);
		log.info("Days Filled SucessFully");

		driver.findElement(By.xpath("//li[@aria-label='02:30 AM']")).click();
		Thread.sleep(1000);
		log.info("StartTime and EndTime Selected SucessFully");

		WebElement Add = driver.findElement(By.xpath("//a[@id='add-time']"));
		Add.click();
		log.info("Add Time SucessFully");

		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		// slot detail
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-key='Tuesday']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@data-key='Wednesday']")).click();
		log.info("Slot Detail Updated SuccessFully");

		// save changes
		Thread.sleep(2000);
		WebElement Savechanges = driver.findElement(By.xpath("//button[@type='submit']"));
		Savechanges.click();
		log.info("Menu Based Service Policy & Timing Adding SuccessFully");

		Thread.sleep(2000);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		WebElement BackButton = driver.findElement(
				By.xpath("//a[@href='http://testadmin.healthismplus.com/mbs/branch?menu_based_service_id=1']"));
		BackButton.click();

		Thread.sleep(20000);
		driver.quit();
		driver.close();

	}
}