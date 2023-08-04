package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	@FindBy(xpath="//a[text()='Selenium Training'][2]")
	private WebElement seleniumTraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	public WebElement getSeleniumtraining() {
		return seleniumTraining;
	}
	public WebElement getcarttab() {
		return carttab;
	}
     
}
