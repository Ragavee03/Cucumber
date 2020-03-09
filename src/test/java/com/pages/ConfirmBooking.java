package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseProgram;

public class ConfirmBooking extends BaseProgram {

	public ConfirmBooking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement fname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lname;

	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement add;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement card;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ctype;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmon;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expyr;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement btnCnfrm;
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderno;
	
	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	private WebElement bookedHistory;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnCnfrm() {
		return btnCnfrm;
	}

	public WebElement getOrderno() {
		return orderno;
	}
	
	public WebElement getBookedHistory() {
		return bookedHistory;
	}

}
