package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseProgram;

public class SearchHotel extends BaseProgram {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement loc;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hot;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noRoom;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement btnClick;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	
}
