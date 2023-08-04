package Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Afreen");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(6000);
		driver.close();
	}

}
