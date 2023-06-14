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

public class Login_Excel_Handling {
	public static void main(String args[]) throws Exception {
//		Logger log = LogManager.getLogger("Login_Excel_Handling");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Thread.sleep(2000);

		driver.get("http://testadmin.healthismplus.com/admin/auth-login");
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
			long Username = (long) celldata.getCell(0).getNumericCellValue();
			long Password = (long) celldata.getCell(1).getNumericCellValue();
			
			String Mobile_no=String.valueOf(Username);  
			String Otp=String.valueOf(Password);  
			
			System.out.println(Username + " " + Password);

			Thread.sleep(2000);
			WebElement login_ui = driver.findElement(By.xpath("//input[@id='mobile-no']"));
			login_ui.sendKeys(Mobile_no);

			Thread.sleep(1000);
			WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
			login_btn.click();

			Thread.sleep(2000);
			WebElement login_pw = driver.findElement(By.xpath("//input[@id='otp']"));
			login_pw.sendKeys(Otp);

			WebElement login_btn1 = driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]"));
			login_btn1.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='dropdown-user']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='http://testadmin.healthismplus.com/logout']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='/admin?type=admin']")).click();
			Thread.sleep(1000);
		}
	}
}