package genericLibraray;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult ;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;  

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Propertyfile pdata=new Propertyfile();
	public WebDriverUtilites utilities= new WebDriverUtilites();
	@BeforeMethod
	public void openApp() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			Photo p=new Photo();
			p.getPhoto(driver, name);
			
		}
		driver.close();
	}

}
