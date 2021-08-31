package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPage extends BaseClass {

	public LogPage() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup 
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(id="login")
	private WebElement login;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
}
