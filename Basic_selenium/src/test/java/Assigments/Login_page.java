package Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://twitter.com/i/flow/login?redirect_after_login=%2Flogin%3Flang%3Den");
		//driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
        driver.findElement(By.xpath("//label[@class='css-1dbjc4n r-1ets6dv r-z2wwpe r-rs99b7 r-18u37iz']")).sendKeys("Afreen");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
        Thread.sleep(4000);
        driver.close();
	}

}
