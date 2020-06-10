package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibGlobal;

public class BookHotel extends LibGlobal{

public BookHotel() {
		
		PageFactory.initElements(driver, this);
	}


@FindBy(id = "first_name")
private List<WebElement> lstfirstname;

@FindBy(id = "last_name")
private List<WebElement> lstlastname;

@FindBy(id = "address")
private List<WebElement> lsttxtaddress;


@FindBy(id = "cc_num")
private List<WebElement> lsttxtccno;

@FindBy(id = "cc_type")
private List<WebElement> lsttxtcctyp;

@FindBy(id = "cc_type")
private List<WebElement> lsttxtcctype;

@FindBy(id = "cc_exp_month")
private List<WebElement> lsttxtmonth;

@FindBy(id = "cc_exp_year")
private List<WebElement> lsttxtyear;

@FindBy(id = "cc_cvv")
private List<WebElement> lsttxtcvv;

@FindBy(id = "book_now")
private List<WebElement> lstbtnbooknow;

public List<WebElement> getLstfirstname() {
	return lstfirstname;
}

public List<WebElement> getLstlastname() {
	return lstlastname;
}

public List<WebElement> getLsttxtaddress() {
	return lsttxtaddress;
}

public List<WebElement> getLsttxtccno() {
	return lsttxtccno;
}

public List<WebElement> getLsttxtcctyp() {
	return lsttxtcctyp;
}

public List<WebElement> getLsttxtcctype() {
	return lsttxtcctype;
}

public List<WebElement> getLsttxtmonth() {
	return lsttxtmonth;
}

public List<WebElement> getLsttxtyear() {
	return lsttxtyear;
}

public List<WebElement> getLsttxtcvv() {
	return lsttxtcvv;
}

public List<WebElement> getLstbtnbooknow() {
	return lstbtnbooknow;
}


}
