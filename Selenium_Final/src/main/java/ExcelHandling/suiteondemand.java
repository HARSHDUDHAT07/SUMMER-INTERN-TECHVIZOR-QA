package ExcelHandling;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class suiteondemand {

	public static void main(String[] args) throws Exception {

//		Logger log = LogManager.getLogger("suiteondemand");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Thread.sleep(2000);

		driver.get(
				"https://demo.suiteondemand.com/index.php?action=Login&module=Users&login_module=Home&login_action=Demo");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\m.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();

		System.out.println(" rowcount :" + rowcount + " colcount :" + colcount);

		for (int i = 1; i <= rowcount; i++) {
			XSSFRow celldata = sheet.getRow(i);
//			long Username = (long) celldata.getCell(0).getNumericCellValue();
//			long Password = (long) celldata.getCell(1).getNumericCellValue();

			String Username = celldata.getCell(0).getStringCellValue();// username collumn 0
			String Password = celldata.getCell(1).getStringCellValue();// password collumn 1

			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(Username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys(Password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index&parentTab=Sales']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Create Account')]")).click(); // error on openninng
			String name = celldata.getCell(2).getStringCellValue();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);

			int officephone = (int) celldata.getCell(3).getNumericCellValue();
			int fax = (int) celldata.getCell(4).getNumericCellValue();

			String office_phone = String.valueOf(officephone);
			String f_ax = String.valueOf(fax);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(office_phone);
			Thread.sleep(1000);
			String Website = celldata.getCell(5).getStringCellValue();// password collumn 1
			driver.findElement(By.xpath("//input[@id='website']")).sendKeys(Website);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='phone_fax']")).sendKeys(f_ax);
			Thread.sleep(1000);

			String Email1 = celldata.getCell(6).getStringCellValue();// password collumn 1
			driver.findElement(By.xpath("//input[@id='Accounts0emailAddress0']")).sendKeys(Email1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='Accounts0emailAddressOptOutFlag0']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='Accounts0emailAddressInvalidFlag0']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='Accounts0_email_widget_add']")).click(); // + email
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='Accounts0removeButton1']")).click();
			Thread.sleep(1000);
			ac.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);

			// Billing Address
			String Street = celldata.getCell(8).getStringCellValue();
			String city = celldata.getCell(9).getStringCellValue();
			String state = celldata.getCell(10).getStringCellValue();
			int Postal_code = (int) celldata.getCell(11).getNumericCellValue();
			String p_c = String.valueOf(Postal_code);
			String Country = celldata.getCell(12).getStringCellValue();
			String Descreption = celldata.getCell(13).getStringCellValue();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='billing_address_street']"))
					.sendKeys(Street + Keys.TAB + city + Keys.TAB + state + Keys.TAB + p_c + Keys.TAB + Country);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='shipping_checkbox']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(Descreption);
			Thread.sleep(1000);

			// more information
			Thread.sleep(1000);
			ac.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			long Annual_revenue = (long) celldata.getCell(14).getNumericCellValue();
			long Employee = (long) celldata.getCell(15).getNumericCellValue();

			String A_R = String.valueOf(Annual_revenue);
			String Emp = String.valueOf(Employee);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='annual_revenue']")).sendKeys(A_R + Keys.TAB + Emp);
			Thread.sleep(1000);

			driver.findElement(By.xpath(
					"//body/div[@id='bootstrap-container']/div[@id='content']/div[@id='pagecontent']/form[@id='EditView']/div[3]/input[1]"))
					.click(); //save button code
			Thread.sleep(1000);
			
			By noThanksButtonLocator = By.id("no Thanks Button");
	        WebElement noThanksButton = driver.findElement(noThanksButtonLocator);
	        noThanksButton.click();

		
		
		
		
		

			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='with-label']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='logout_link']")).click();
			Thread.sleep(1000);

		}
		driver.close();
	}

}
