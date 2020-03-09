package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseProgram;

public class LoginPage extends BaseProgram {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement uName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement btnLogin;

	public WebElement getUsername() {
		return uName;
	}

	public WebElement getPassword() {
		return pwd;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
