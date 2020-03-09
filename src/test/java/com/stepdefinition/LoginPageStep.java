package com.stepdefinition;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.BaseProgram;
import com.pages.BookedItenary;
import com.pages.ConfirmBooking;
import com.pages.LoginPage;
import com.pages.PageObjectManager;
import com.pages.SearchHotel;
import com.pages.SelectHotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseProgram {

	WebDriver driver;
	/*
	 * LoginPage Page; SearchHotel Page1; SelectHotel Page2; ConfirmBooking Page3;
	 * BookedItenary Page4;
	 */
PageObjectManager pageObjectManager;

	@Given("User has already registered")
	public void user_has_already_registered() {
		driver = launchURL();
		maximize();
		delCookies();
		openBrowser("https://adactin.com/HotelApp/index.php");
		getTiltle();
		screenshot();

	}

	@When("User enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable data) throws InterruptedException {
		Thread.sleep(3000);
		;
		List<Map<String, String>> user = data.asMaps();
		Map<String, String> map = user.get(0);
		String s1 = map.get("username");
		String s2 = map.get("password");
		pageObjectManager = new PageObjectManager();
		
		WebElement uName = pageObjectManager.getLoginPage().getUsername();
		fillDetails(uName, s1);

		WebElement pwd = pageObjectManager.getLoginPage().getPassword();
		fillDetails(pwd, s2);

	}

	@When("login should be successfull")
	public void login_should_be_successfull() {
		WebElement btnLogin = pageObjectManager.getLoginPage().getBtnLogin();
		btnLogin.click();
	}

	@When("User selects options for Hotel search")
	public void user_selects_options_for_Hotel_search(io.cucumber.datatable.DataTable dataTable1) {
		pageObjectManager = new PageObjectManager();
		WebElement loc = pageObjectManager.getSearchHotel().getLoc();
		dropDownByVisibleText(loc, "London");
		WebElement hot = pageObjectManager.getSearchHotel().getHot();
		dropDownByVisibleText(hot, "Hotel Hervey");

		WebElement room = pageObjectManager.getSearchHotel().getRoom();
		dropdownValue(room, "Double");

		WebElement noRoom = pageObjectManager.getSearchHotel().getNoRoom();
		dropdownValue(noRoom, "4");

		WebElement checkin = pageObjectManager.getSearchHotel().getCheckin();
		checkin.clear();
		WebElement checkout = pageObjectManager.getSearchHotel().getCheckout();
		checkout.clear();
		List<Map<String, String>> cheDateIn = dataTable1.asMaps();
		Map<String, String> map1 = cheDateIn.get(0);
		String s3 = map1.get("CheckInDate");
		String s4 = map1.get("CheckOutDate");
		fillDetails(checkin, s3);
		fillDetails(checkout, s4);

		WebElement adult = pageObjectManager.getSearchHotel().getAdult();
		dropdownValue(adult, "2");

		WebElement child = pageObjectManager.getSearchHotel().getChild();
		dropdownValue(child, "2");
		screenshot();
		WebElement btnClick = pageObjectManager.getSearchHotel().getBtnClick();
		clicking(btnClick);

	}

	@When("User should select hotel and continue")
	public void user_should_select_hotel_and_continue() {
		pageObjectManager = new PageObjectManager();
		WebElement btnSelClick = pageObjectManager.getSelectHotel().getBtnSelClick();
		clicking(btnSelClick);
		WebElement btnnxtClick = pageObjectManager.getSelectHotel().getBtnnxtClick();
		clicking(btnnxtClick);
	}

	@When("User fills details on confrim hotel")
	public void user_fills_details_on_confrim_hotel(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		List<Map<String, String>> cnfrm = dataTable.asMaps();
		Map<String, String> map = cnfrm.get(0);
		String s1 = map.get("firstname");
		String s2 = map.get("lastname");
		String s3 = map.get("address");
		String s4 = map.get("creditcardNo");
		String s5 = map.get("CVV");
		
		pageObjectManager = new PageObjectManager();
		
		WebElement fname = pageObjectManager.getConfirmBooking().getFname();
		fillDetails(fname, s1);

		WebElement lname = pageObjectManager.getConfirmBooking().getLname();
		fillDetails(lname, s2);

		WebElement add = pageObjectManager.getConfirmBooking().getAdd();
		fillDetails(add, s3);

		WebElement card = pageObjectManager.getConfirmBooking().getCard();
		fillDetails(card, s4);

		WebElement ctype = pageObjectManager.getConfirmBooking().getCtype();
		dropdownValue(ctype, "VISA");

		WebElement expmon = pageObjectManager.getConfirmBooking().getExpmon();
		dropdownValue(expmon, "2");

		WebElement expyr = pageObjectManager.getConfirmBooking().getExpyr();
		dropdownValue(expyr, "2020");

		WebElement cvv = pageObjectManager.getConfirmBooking().getCvv();
		fillDetails(cvv, s5);
		screenshot();
		
		WebElement btnCnfrm = pageObjectManager.getConfirmBooking().getBtnCnfrm();
		btnCnfrm.click();
		Thread.sleep(5000);
		screenshot();

	}

	@Then("User should  Successfully book hotel")
	public void user_should_Successfully_book_hotel() throws InterruptedException {
		Thread.sleep(5000);
		WebElement orderno = pageObjectManager.getConfirmBooking().getOrderno();
		orderno.click();
		String finalorder = orderno.getAttribute("Value");
		System.out.println("order ID is "+finalorder);
		screenshot();
		WebElement bookedHistory = pageObjectManager.getConfirmBooking().getBookedHistory();
		bookedHistory.click();
	   WebElement SelRecord = driver.findElement(By.xpath("//input[@value='"+finalorder+"']/parent::td/preceding-sibling::td"));
		SelRecord.click();
		WebElement cancelBtn = pageObjectManager.getBookedItenary().getCancelBtn();
		cancelBtn.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();	
		System.out.println("Cancelled successfully");
	}
	
}