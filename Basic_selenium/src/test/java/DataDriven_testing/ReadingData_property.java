package DataDriven_testing;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_property {
	public static void main(String[]args) throws Throwable {
		Properties p=new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(file);
		String u = p.getProperty("url");
		String user = p.getProperty("username");
		 String pasword = p.getProperty("password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(u);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pasword);
	}

}
