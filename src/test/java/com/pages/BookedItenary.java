package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseProgram;

public class BookedItenary extends BaseProgram {
	
	public BookedItenary() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelBtn;
	
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
}
