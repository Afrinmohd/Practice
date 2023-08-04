package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	@FindBy(xpath="//div[@class='PlayButton_module_playButtonWrapper__c50ea884']")
	private WebElement playbtn;
	@FindBy(xpath="")
	private WebElement pausebtn;
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //Utilization
	public void playbutton() {
		playbtn.click();
		
	}
	public void pausebutton() {
		pausebtn.click();
		
	}
	public void addtowhishlist() {
		addtowishlist.click();
		
	}
	
}
