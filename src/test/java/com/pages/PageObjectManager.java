package com.pages;

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private ConfirmBooking confirmBooking;
	private BookedItenary bookedItenary;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotel getSearchHotel() {
		return (searchHotel == null) ? searchHotel = new SearchHotel() : searchHotel;
	}

	public SelectHotel getSelectHotel() {
		return (selectHotel == null) ? selectHotel = new SelectHotel() : selectHotel;
	}

	public ConfirmBooking getConfirmBooking() {
		return (confirmBooking == null) ? confirmBooking = new ConfirmBooking() : confirmBooking;
	}

	public BookedItenary getBookedItenary() {
		return (bookedItenary == null) ? bookedItenary = new BookedItenary() : bookedItenary;
	}

}
