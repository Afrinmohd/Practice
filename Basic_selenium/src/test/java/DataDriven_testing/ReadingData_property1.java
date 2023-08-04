package DataDriven_testing;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_property1 {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(file);
		String url = p.getProperty("url1");
		String s = p.getProperty("search");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='Search for Courses']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@value='go']")).click();
		

	}

}
