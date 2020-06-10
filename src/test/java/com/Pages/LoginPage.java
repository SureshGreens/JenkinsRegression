package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibGlobal;

public class LoginPage extends LibGlobal{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "username")
	private WebElement lstTxtusername;

	@FindBy(id ="password")
	private WebElement lsttxtpassword;

	@FindBy(id = "login")
	private WebElement lstloginbutton;

	public WebElement getLstTxtusername() {
		return lstTxtusername;
	}

	public WebElement getLsttxtpassword() {
		return lsttxtpassword;
	}

	public WebElement getLstloginbutton() {
		return lstloginbutton;
	}

	

}
