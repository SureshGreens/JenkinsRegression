package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibGlobal;

public class BookingConfirmation extends LibGlobal {
public BookingConfirmation() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public List<WebElement> getLsttxtorderno() {
		return lsttxtorderno;
	}

@FindBy(id = "order_no")
	private List<WebElement> lsttxtorderno;

}
