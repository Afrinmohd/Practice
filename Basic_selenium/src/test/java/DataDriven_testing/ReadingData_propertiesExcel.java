package DataDriven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileOutputStream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_propertiesExcel {
	public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(file);
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.get(url);
	//driver.get(username);
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	String title = driver.getTitle();
	wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
	FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\TestData.xlsx");
	wb.write(fos);
	}

}
