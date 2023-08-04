package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	@FindBy(xpath="//button[@id='add']")
	private  WebElement addbtn;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private  WebElement cartbtn;
	public Addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void carttocartbtn() {
		 cartbtn.click();
	}

	

}
