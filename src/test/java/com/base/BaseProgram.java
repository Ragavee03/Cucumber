package com.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseProgram {
	public static WebDriver driver;

	public WebDriver launchURL() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\com.cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public void delCookies() {
		driver.manage().deleteAllCookies();

	}

	public void openBrowser(String Value) {
		driver.get(Value);

	}

	public void getTiltle() {
		System.out.println(driver.getTitle());

	}

	public void fillDetails(WebElement ele, String input) {
		ele.sendKeys(input);
	}

	public void clicking(WebElement ele) {
		ele.click();
	}

	Select s;

	public void dropDownByVisibleText(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public void dropdownValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}

	public void closeUrl() {
		driver.close();
	}

	public String getAttributeValue(WebElement ele) {
		return ele.getAttribute("value");

	}

	public String generateDate() {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss");
		return sf.format(date);

	}

	public void screenshot() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\User\\eclipse-workspace\\com.cucumber\\Screenshot\\" + generateDate() + ".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
