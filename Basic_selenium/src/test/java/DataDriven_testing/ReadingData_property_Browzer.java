package DataDriven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_property_Browzer {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(file);
		String url = p.getProperty("url1");
		String s = p.getProperty("search");
		String browze = p.getProperty("browzer");
		WebDriver driver;
		if(browze.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get(url);

	}

}
