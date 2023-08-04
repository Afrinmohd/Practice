package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillraryPage {
	@FindBy(id="course")
	private  WebElement coursetab;
	@FindBy(name="addresstype")
	private  WebElement courseadd;
	@FindBy(xpath="//a[text()='Selenium Training']")
	private  WebElement seleniumtraining;
	public demoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getcourseadd() {
		return courseadd;
	}
	public WebElement getcoursetab() {
		return coursetab;
	}
	public WebElement seleniumtraining() {
		return seleniumtraining;
	}
}
