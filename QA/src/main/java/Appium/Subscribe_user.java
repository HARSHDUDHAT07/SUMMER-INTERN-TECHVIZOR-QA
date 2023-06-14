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

public class Subscribe_user {
	public static void main(String args[]) throws Exception {
		for (int i = 5; i <= 25; i++) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium"); // automation name
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); // Platform name
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0"); // platfrom os version
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\TechVizor\\150.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
//			int rowcount = sheet.getLastRowNum();
//			int colcount = sheet.getRow(1).getLastCellNum();

//			System.out.println(" rowcount :" + rowcount + " colcount :" + colcount);

			XSSFRow celldata = sheet.getRow(i);
			String id_username = celldata.getCell(5).getStringCellValue();
			String Email = celldata.getCell(4).getStringCellValue();
			String name = celldata.getCell(1).getStringCellValue();

			dc.setCapability("appPackage", "com.healthismplus.customer.dev");
			dc.setCapability("appActivity", "com.healthismplus.customer.MainActivity");

			// url to connect with appium server.
			URL url = new URL("http://localhost:4723/wd/hub");

			// creating Android Driver for interacting with Android
			AndroidDriver driver = new AndroidDriver(url, dc);
			Actions ac = new Actions(driver);
			TouchAction acb = new TouchAction(driver);
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

			// click on profile buutton
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();

			Thread.sleep(2000);
			// click on subscribe Healthisum Plus
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Subscribe HealthismPlus Plan\"]"))
					.click();

			Thread.sleep(2000);
			acb.press(PointOption.point(2319, 824)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(251, 824)).release().perform();
			Thread.sleep(2000);

			// buy plan
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Buy Plan\"])[1]")).click();

			// total pay 2 rs
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Total Pay ₹2399.00\"]")).click();

			// suscreption plan menu_mobile_no
			Thread.sleep(12000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"))
					.sendKeys(id_username);

			// email
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText"))
					.sendKeys(Email);

			// proceed Button
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"))
					.click();

			// upi/QR button
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]"))
					.click();

			// QR button
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View/android.view.View/android.widget.TextView"))
					.click();

			Thread.sleep(4000);
			System.out.println(name + " Purchase a Max plan Successfully");
		}
	}
}
