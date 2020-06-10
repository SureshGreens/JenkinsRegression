package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibGlobal;

public class SearchHotel extends LibGlobal{

	
	public SearchHotel(){
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private List<WebElement> lsttxtlocation;

	@FindBy(id = "hotels")
	private List<WebElement> lsttxthotels;

	@FindBy(id = "room_type")
	private List<WebElement> lsttxtroomtype;

	@FindBy(id = "room_nos")
	private List<WebElement> lsttxtroomno;

	@FindBy(id = "adult_room")
	private List<WebElement> lstadultsperroom;
	
	@FindBy(id = "child_room")
	private List<WebElement> lstchildperroom;


	@FindBy(id = "Submit")
	private List<WebElement> lstbtnsubmit;

	public List<WebElement> getLstchildperroom() {
		return lstchildperroom;
	}

	public List<WebElement> getLstbtnsubmit() {
		return lstbtnsubmit;
	}

	public List<WebElement> getLstChkin() {
		return lstChkin;
	}

	public List<WebElement> getLstChkOut() {
		return lstChkOut;
	}



	@FindBy(id = "datepick_in")
	private List<WebElement> lstChkin;

	@FindBy(id = "datepick_out")
	private List<WebElement> lstChkOut;


	public List<WebElement> getLsttxtlocation() {
		return lsttxtlocation;
	}

	public List<WebElement> getLsttxthotels() {
		return lsttxthotels;
	}

	public List<WebElement> getLsttxtroomtype() {
		return lsttxtroomtype;
	}

	public List<WebElement> getLsttxtroomno() {
		return lsttxtroomno;
	}

	public List<WebElement> getLstadultsperroom() {
		return lstadultsperroom;
	}

}
