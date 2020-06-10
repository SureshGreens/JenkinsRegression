Feature: Adactin Webpage Automation

	Scenario Outline: Validating the functionalities of adactin webpage
		Given User is on login page
		When User enter the "<username>" and "<password>" and click login button
		Then User navigates to SelectHotel page
		When User enter "<location>","<Hotel>","<Roomtype>","<NumberofRooms>","<CheckinDate>","<CheckOutDate>","<Adultsperroom>","<ChildrenperRoom>" and clicks search button
		Then User navigates to Searchhotel page
		When User select option and click continue button
		Then User navigates to BookHotel page
		When User "<First Name>","<Last Name>","<Billing address>","<Credit card No>","<Credit card type>","<select month>","<Select year>","<CVV>" and clicks BookNow button
		Then User navigates to BookingConfirmation page and print the order id
		
		Examples:
		
		| username     | password   | location | Hotel       | Roomtype | NumberofRooms | CheckinDate | CheckOutDate | Adultsperroom | ChildrenperRoom | First Name | Last Name | Billing address               | Credit card No   | Credit card type | select month | Select year | CVV  |  |
    | sureshgreens | suresh1988 | Sydney   | Hotel Creek | Deluxe   | 1 - One       | 10/03/2020  | 11/03/2020   | 1 - One       | 1 - One         | Suresh     | Kumar     | bfgawgfbewafawefhgbbhgwefkbka | 1234567891234123 | VISA             | January      |        2021 | 1234 |  |
		