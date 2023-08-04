package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void Login() {
		
		driver.findElement(By.id("email")).sendKeys("Afreen");
		driver.findElement(By.id("pass")).sendKeys("Affu");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		//Assert.assertEquals(title, "asdfg");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "asdf");
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
