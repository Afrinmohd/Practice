package Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbar_1 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
        Point point = career.getLocation();
        int x = point.getX();
        int y = point.getY();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+" , "+y+")");
        Thread.sleep(4000);
        career.click();
        Thread.sleep(4000);
        driver.close();
	}
}
