package ExcelHandling;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class filehandling {
	public static void main(String args[]) throws Exception {
		
		InputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\m.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
	    System.out.println(rowcount);
		int colcount = sheet.getRow(1).getLastCellNum();
		XSSFRow celldata = sheet.getRow(1);
		String First_Name = celldata.getCell(0).getStringCellValue();
		String Last_Name = celldata.getCell(1).getStringCellValue();
//		String Contact = celldata.getCell(2).getStringCellValue();
//		String Email = celldata.getCell(3).getStringCellValue();
//		System.out.print(First_Name + Last_Name );

	}
}