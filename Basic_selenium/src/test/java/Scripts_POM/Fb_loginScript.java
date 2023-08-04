package Scripts_POM;

import org.openqa.selenium.WebDriver;
import POM.Fb_login;
import org.openqa.selenium.chrome.ChromeDriver;
import Scripts_POM.Property_File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_loginScript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Fb_login fb=new Fb_login(driver);
		fb.emailTextField("afreen");
		fb.passwordTextField("asddd");
		fb.loginTextField();
	}

}
