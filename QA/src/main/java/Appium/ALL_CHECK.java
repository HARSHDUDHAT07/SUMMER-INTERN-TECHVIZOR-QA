package Appium;

import java.net.URL;
import java.time.Duration;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ALL_CHECK {
	public static void main(String args[]) throws Exception {
//		for (int i = 5; i <= 25; i++) {
		int i = 1;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium"); // automation name
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); // Platform name
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0"); // platfrom os version
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

		dc.setCapability("appPackage", "com.healthismplus.customer.dev");
		dc.setCapability("appActivity", "com.healthismplus.customer.MainActivity");

		// url to connect with appium server.
		URL url = new URL("http://localhost:4723/wd/hub");

		// creating Android Driver for interacting with Android
		AndroidDriver driver = new AndroidDriver(url, dc);
		Actions ac = new Actions(driver);
		TouchAction acb = new TouchAction(driver);

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\TechVizor\\150.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowcount = sheet.getLastRowNum();
//		int colcount = sheet.getRow(1).getLastCellNum();
//
//		System.out.println(" rowcount :" + rowcount + " colcount :" + colcount);

		XSSFRow celldata = sheet.getRow(i);
		String id_username = celldata.getCell(5).getStringCellValue();
		String Email = celldata.getCell(4).getStringCellValue();
		String name = celldata.getCell(1).getStringCellValue();

		Thread.sleep(2000);

		WebElement user_id = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		user_id.click();
		user_id.sendKeys(id_username);
		driver.navigate().back(); // For Back
		Thread.sleep(3000);

		WebElement clickcon = driver.findElement(By.xpath("//android.widget.Button[@index='4']"));
		clickcon.click();
		Thread.sleep(2000);

		WebElement OTP = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		OTP.click();
		OTP.sendKeys("1597");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
		login.click();
		Thread.sleep(4000);

		WebElement loc = driver
				.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		loc.click();
		Thread.sleep(2000);

		WebElement loccon = driver
				.findElement(By.xpath("	\r\n" + "//android.widget.Button[@content-desc=\"Confirm Location\"]"));
		loccon.click();
		Thread.sleep(2000);

		// H+ button home
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"))
				.click();
		Thread.sleep(2000);

		// pathology lab
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Pathology Lab\"]")).click();
		Thread.sleep(2000);
		
		// search test & Pathology lab
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]"))
				.click();
		Thread.sleep(2000);
		
		// pathology labs tab0
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pathology Labs Tab 2 of 2\"]")).click();
		Thread.sleep(2000);
		
		// Type value in search
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"))
				.sendKeys("digi");
		Thread.sleep(2000);
		
		// click on digi valanja
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pathology Labs Tab 2 of 2\"]")).click();
		Thread.sleep(2000);
		
		// add test
		driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Add Test\"])[1]")).click();
		Thread.sleep(2000);
		
		// go to cart
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Go to Cart\"]")).click();
		Thread.sleep(2000);
		
		// select Schedule
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Schedule\"]")).click();
		Thread.sleep(2000);
		
		// report at lab
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Report at lab\"]")).click();
		Thread.sleep(2000);
		
		// select Schedule
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Schedule\"]")).click();
		Thread.sleep(2000);
		
		// select date and slot
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"WED 28\"]")).click();
		Thread.sleep(2000);
		
		// Evening
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"04:00 PM - 04:30 PM + ₹ 50.00 Extra\"]")).click();
		Thread.sleep(2000);
		
		// confirm
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]")).click();
		Thread.sleep(2000);
		
		// Select Patient
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SELECT\"]")).click();

		// Scroll Down
		Thread.sleep(2000);
		acb.press(PointOption.point(1260, 1180)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(1260, 256)).release().perform();
		Thread.sleep(2000);

		// pay offline
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Pay Offline\"]")).click();
		Thread.sleep(2000);
		
		// pay confirm
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Pay ₹ 1580.00 & Confirm\"]")).click();
		Thread.sleep(2000);
		
		// Scroll Down
		Thread.sleep(2000);
		acb.press(PointOption.point(1260, 1180)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(1260, 256)).release().perform();
		Thread.sleep(2000);
                                                                         
		//Go to Dashboard
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Go To Dashboard\"]")).click();
		Thread.sleep(2000);
		
		//the second scenario
		driver.findElement(By.xpath(""));
		
		
		
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();

		driver.close();
//		}
	}
}
