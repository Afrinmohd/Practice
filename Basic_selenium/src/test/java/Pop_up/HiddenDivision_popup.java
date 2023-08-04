package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivision_popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.xpath("//div[@class='date input-box ']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='July']/../../../..//span[text()='26']")).click();
		Thread.sleep(4000);

	}

}
