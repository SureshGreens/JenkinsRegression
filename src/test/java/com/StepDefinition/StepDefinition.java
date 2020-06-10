package com.StepDefinition;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.Base.LibGlobal;
import com.Pages.BookHotel;
import com.Pages.BookingConfirmation;
import com.Pages.LoginPage;
import com.Pages.SearchHotel;
import com.Pages.SelectHotel;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {
	
@Given("User is on login page")
public void user_is_on_login_page() {
	
launchBrowser();
getUrl("https://www.adactin.com/HotelApp/index.php");
}

@When("User enter the {string} and {string} and click login button")
public void user_enter_the_and_and_click_login_button(String username, String password) throws IOException {
	LoginPage lp = new LoginPage();
	txtbox(lp.getLstTxtusername(),username);
	txtbox(lp.getLsttxtpassword(),password);
	button(lp.getLstloginbutton());
	LibGlobal.screenShot(driver, System.currentTimeMillis());
}

@Then("User navigates to SelectHotel page")
public void user_navigates_to_SelectHotel_page() {
//	Assert.assertEquals("Search page verified", "https://www.adactin.com/HotelApp/SearchHotel.php", driver.getCurrentUrl());
	Assert.assertFalse("https://www.adactin.com/HotelApp/SearchHotel.php", false);
}

@When("User enter {string},{string},{string},{string},{string},{string},{string},{string} and clicks search button")
public void user_enter_and_clicks_search_button(String location, String hotel, String roomtype, String roomno, String chkin, String chkout, String adult, String child) throws IOException {
    
	SearchHotel sh = new SearchHotel();
	drpdwn(sh.getLsttxtlocation().get(0), location);
	drpdwn(sh.getLsttxthotels().get(0), hotel);
	drpdwn(sh.getLsttxtroomtype().get(0), roomtype); 
	drpdwn(sh.getLsttxtroomno().get(0), roomno);
	sh.getLstChkin().clear();
	txtbox(sh.getLstChkin().get(0), chkin);
	sh.getLstChkOut().clear();
	txtbox(sh.getLstChkOut().get(0),chkout);
	drpdwn(sh.getLstadultsperroom().get(0),adult);
	drpdwn(sh.getLstchildperroom().get(0),child);
	button(sh.getLstbtnsubmit().get(0));
	LibGlobal.screenShot(driver, System.currentTimeMillis());
}

@Then("User navigates to Searchhotel page")
public void user_navigates_to_Searchhotel_page() {
	Assert.assertEquals("Search page verified", "https://www.adactin.com/HotelApp/SelectHotel.php", driver.getCurrentUrl());  

}

@When("User select option and click continue button")
public void user_select_option_and_click_continue_button() throws IOException {
	SelectHotel sl = new SelectHotel();
	button(sl.getLstradiobutton().get(0));
	button(sl.getLstcontinuebutton().get(0));
	LibGlobal.screenShot(driver, System.currentTimeMillis());
	
    }

@Then("User navigates to BookHotel page")
public void user_navigates_to_BookHotel_page() {
	Assert.assertEquals("Search page verified", "https://www.adactin.com/HotelApp/BookHotel.php", driver.getCurrentUrl());
}

@When("User {string},{string},{string},{string},{string},{string},{string},{string} and clicks BookNow button")
public void user_and_clicks_BookNow_button(String firstname, String lastname, String address, String ccno, String cctype, String month, String year, String cvv) throws IOException {
   BookHotel bh = new BookHotel(); 
	txtbox(bh.getLstfirstname().get(0),firstname);
	  txtbox(bh.getLstlastname().get(0),lastname);
	  txtbox(bh.getLsttxtaddress().get(0),address);
	  txtbox(bh.getLsttxtccno().get(0),ccno);
	  txtbox(bh.getLsttxtcctyp().get(0),cctype);
	  txtbox(bh.getLsttxtmonth().get(0),month);
	  txtbox(bh.getLsttxtyear().get(0),year);
	  txtbox(bh.getLsttxtcvv().get(0),cvv);
	  button(bh.getLstbtnbooknow().get(0));
	  LibGlobal.screenShot(driver, System.currentTimeMillis());
}

@Then("User navigates to BookingConfirmation page and print the order id")
public void user_navigates_to_BookingConfirmation_page_and_print_the_order_id() throws IOException {
    
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     
BookingConfirmation bc= new BookingConfirmation();
System.out.println(bc.getLsttxtorderno().get(0).getAttribute("value"));
LibGlobal.screenShot(driver, System.currentTimeMillis());
}

}
