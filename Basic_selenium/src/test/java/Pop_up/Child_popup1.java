package Pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup1 {

	private static Object courses;

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.skillrary.com/");
       String parent = driver.getWindowHandle();
       driver.findElement(By.xpath("//a[text()=' SERVICES ']")).click();
       driver.findElement(By.xpath("//a[text()=' SkillRary Assessments']")).click();
       Set<String> child = driver.getWindowHandles();
		for(String d:child) {
			driver.switchTo().window(d);
		}
		driver.findElement(By.xpath("//a[text()='SIGNIN']")).click();
		driver.findElement(By.id("email")).sendKeys("dfhjjjj");
		driver.findElement(By.id("pwd")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='loginBtn']")).click();
		driver.findElement(By.xpath("//a[text()='HOME']")).click();
		
		driver.switchTo().window(parent);
      driver.findElement(By.xpath("//input[@placeholder='Search for Courses']")).sendKeys("selenium server");
      driver.findElement(By.xpath("//input[@value='go']")).click();
       
              

	}

}
