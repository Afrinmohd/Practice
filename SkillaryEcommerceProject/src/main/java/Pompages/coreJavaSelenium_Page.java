package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaSelenium_Page {
	@FindBy(xpath="//a[@title='Core Java for Selenium']")
	private WebElement selenium;

	public coreJavaSelenium_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void seleniumtraining() {
		selenium.click();
	}
   
}
