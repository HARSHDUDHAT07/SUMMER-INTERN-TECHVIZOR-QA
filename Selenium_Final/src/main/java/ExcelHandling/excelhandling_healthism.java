package ExcelHandling;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelhandling_healthism {

//	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		Logger log = LogManager.getLogger("excelhandling_healthism");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Thread.sleep(2000);

		driver.get("http://testadmin.healthismplus.com/admin/auth-login");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement login_ui = driver.findElement(By.xpath("//input[@id='mobile-no']"));
		login_ui.sendKeys("9904870054");
		Thread.sleep(2000);

		WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
		login_btn.click();
		Thread.sleep(2000);

		WebElement login_pw = driver.findElement(By.xpath("//input[@id='otp']"));
		login_pw.sendKeys("7600905998");
		Thread.sleep(2000);

		WebElement login_btn1 = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
		login_btn1.click();
		Thread.sleep(2000);

		WebElement AddNewUser = driver.findElement(By.xpath("//a[contains(text(),'Add New User')]"));
		AddNewUser.click();
		Thread.sleep(2000);

		File src=new File("C:\\Users\\HP\\Desktop\\m.xlsx");
		FileInputStream fis = new FileInputStream(src);
//		@SuppressWarnings("resource")
		XSSFWorkbook book = new XSSFWorkbook(fis);
		//for .xls file
//		HSSFWorkbook book = new HSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		//getSheetAt(0)
		int rowcount = sheet.getLastRowNum();
//		int colcount = sheet.getRow(1).getLastCellNum();

		System.out.println(" rowcount :" + rowcount );

//		for (int i = 1; i <= rowcount; i++) {

			XSSFRow celldata = sheet.getRow(1);
			String First_Name = celldata.getCell(0).getStringCellValue();
			String Last_Name = celldata.getCell(1).getStringCellValue();
			String Contact = celldata.getCell(2).getStringCellValue();
			String Email = celldata.getCell(3).getStringCellValue();
			System.out.print(First_Name+Last_Name+Contact+Email);
//			String First_Name = celldata.getCell(2).getStringCellValue();
//			String Last_Name = celldata.getCell(3).getStringCellValue();
//			String Contact = celldata.getCell(4).getStringCellValue();
//			String Email = celldata.getCell(5).getStringCellValue();

			driver.findElement(By.xpath("//input[@name='first_name']"))
					.sendKeys(First_Name);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='last_name']"))
					.sendKeys(Last_Name);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='email']"))
					.sendKeys(Contact);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='mobile']"))
					.sendKeys(Email);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[contains(text(),'Save changes')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[contains(text(),'Add New User')]")).click();

			System.out.println(" . " + First_Name + " || " + Last_Name + " | | " + Contact + " || " + Email);

//		}
	}
}
