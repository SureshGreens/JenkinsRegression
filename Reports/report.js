$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Adactin.feature");
formatter.feature({
  "name": "Adactin Webpage Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating the functionalities of adactin webpage",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click login button",
  "keyword": "When "
});
formatter.step({
  "name": "User navigates to SelectHotel page",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter \"\u003clocation\u003e\",\"\u003cHotel\u003e\",\"\u003cRoomtype\u003e\",\"\u003cNumberofRooms\u003e\",\"\u003cCheckinDate\u003e\",\"\u003cCheckOutDate\u003e\",\"\u003cAdultsperroom\u003e\",\"\u003cChildrenperRoom\u003e\" and clicks search button",
  "keyword": "When "
});
formatter.step({
  "name": "User navigates to Searchhotel page",
  "keyword": "Then "
});
formatter.step({
  "name": "User select option and click continue button",
  "keyword": "When "
});
formatter.step({
  "name": "User navigates to BookHotel page",
  "keyword": "Then "
});
formatter.step({
  "name": "User \"\u003cFirst Name\u003e\",\"\u003cLast Name\u003e\",\"\u003cBilling address\u003e\",\"\u003cCredit card No\u003e\",\"\u003cCredit card type\u003e\",\"\u003cselect month\u003e\",\"\u003cSelect year\u003e\",\"\u003cCVV\u003e\" and clicks BookNow button",
  "keyword": "When "
});
formatter.step({
  "name": "User navigates to BookingConfirmation page and print the order id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "Hotel",
        "Roomtype",
        "NumberofRooms",
        "CheckinDate",
        "CheckOutDate",
        "Adultsperroom",
        "ChildrenperRoom",
        "First Name",
        "Last Name",
        "Billing address",
        "Credit card No",
        "Credit card type",
        "select month",
        "Select year",
        "CVV",
        ""
      ]
    },
    {
      "cells": [
        "sureshgreens",
        "suresh1988",
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "1 - One",
        "10/03/2020",
        "11/03/2020",
        "1 - One",
        "1 - One",
        "Suresh",
        "Kumar",
        "bfgawgfbewafawefhgbbhgwefkbka",
        "1234567891234123",
        "VISA",
        "January",
        "2021",
        "1234",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the functionalities of adactin webpage",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"sureshgreens\" and \"suresh1988\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and_and_click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to SelectHotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_SelectHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"Sydney\",\"Hotel Creek\",\"Deluxe\",\"1 - One\",\"10/03/2020\",\"11/03/2020\",\"1 - One\",\"1 - One\" and clicks search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and_clicks_search_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Searchhotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_Searchhotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select option and click continue button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_select_option_and_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to BookHotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_BookHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User \"Suresh\",\"Kumar\",\"bfgawgfbewafawefhgbbhgwefkbka\",\"1234567891234123\",\"VISA\",\"January\",\"2021\",\"1234\" and clicks BookNow button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_and_clicks_BookNow_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to BookingConfirmation page and print the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_BookingConfirmation_page_and_print_the_order_id()"
});
formatter.result({
  "status": "passed"
});
});