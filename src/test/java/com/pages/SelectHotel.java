package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseProgram;

public class SelectHotel extends BaseProgram {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private WebElement btnSelClick;
	
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement btnnxtClick;


	public WebElement getBtnSelClick() {
		return btnSelClick;
	}


	public WebElement getBtnnxtClick() {
		return btnnxtClick;
	}
	

}
