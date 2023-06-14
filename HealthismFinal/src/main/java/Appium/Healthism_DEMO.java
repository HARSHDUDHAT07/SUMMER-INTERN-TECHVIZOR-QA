package Appium;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Healthism_DEMO {

	public static void main(String[] args) throws Exception {

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
		Actions ac=new Actions(driver);
		Thread.sleep(1000);

		WebElement user_id = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		user_id.click();
		user_id.sendKeys("9923338577");
		driver.navigate().back();          //For Back
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
		Thread.sleep(5000);
//		
//		
		WebElement loc = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		loc.click();
		Thread.sleep(2000);
		
		WebElement loccon = driver.findElement(By.xpath("	\r\n"
				+ "//android.widget.Button[@content-desc=\"Confirm Location\"]"));
		loccon.click();
		Thread.sleep(2000);
		
		WebElement Middle_menu=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"));
		Middle_menu.click();
		Thread.sleep(2000);
		
		WebElement SPA_ICON = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Spa\"]"));
		SPA_ICON.click();
		Thread.sleep(2000);
		
//		ac.press(PointOption.point(500, 1400)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(570, 700)).release().perform();
//		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		driver.close();
	}
}
