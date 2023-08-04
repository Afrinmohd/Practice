package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login {
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTb;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTb;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;

	public WebElement getEmailTb() {
		return emailTb;
	}

	public void setEmailTb(WebElement emailTb) {
		this.emailTb = emailTb;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public void setPasswordTb(WebElement passwordTb) {
		this.passwordTb = passwordTb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	public Fb_login(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void emailTextField(String data) {
		emailTb.sendKeys(data);
	}
	public void passwordTextField(String data) {
		passwordTb.sendKeys(data);
	}
    public void loginTextField() {
    	loginBtn.click();
    	
    }
    
}
