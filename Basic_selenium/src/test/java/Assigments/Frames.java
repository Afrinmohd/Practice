package Assigments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Throwable {

           WebDriverManager.chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
           driver.switchTo().frame("packageListFrame");
           driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
           Thread.sleep(3000);
           driver.switchTo().defaultContent();
           driver.switchTo().frame("packageFrame");
           driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
           driver.switchTo().defaultContent();
           Thread.sleep(4000);
           driver.switchTo().frame("classFrame");
           driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
           Thread.sleep(4000);
           driver.close();
           

	}

}
