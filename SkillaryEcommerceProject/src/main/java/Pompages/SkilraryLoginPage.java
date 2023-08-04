package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	@FindBy(name="q")
	private WebElement searchtb;
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	public SkilraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void gearsbutton() {
		gearbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchTextbox() {
		searchtb.click();
	
	}
	public void gobutton() {
		searchbtn.click();
	}

}
