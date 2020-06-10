package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibGlobal;

public class SelectHotel extends LibGlobal{
	
public SelectHotel() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="radiobutton_0")
	private List<WebElement> lstradiobutton;

	@FindBy(id="continue")
	private List<WebElement> lstcontinuebutton;

	public List<WebElement> getLstradiobutton() {
		return lstradiobutton;
	}

	public List<WebElement> getLstcontinuebutton() {
		return lstcontinuebutton;
	}


}
