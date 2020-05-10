Feature: MLC Life Insurance automation screening exercises

  @Exercise1
  Scenario: Web UI Test - Part 1
    Given User navigates to MLC homepage "https://www.mlcinsurance.com.au/"
    When User search for keyword "Lifeview"
    And Click on the first result from result list
    Then Search page is displayed with navigation pane on the top as "Home Partnering with us Superannuation funds LifeView"
    Then User Clicks on request a demo button
    And Enter relevant data in the form as name "Test User" email "testuser@testmail.com" and phone number as "0490000000"
    
  @Exercise2
  Scenario: Web UI Test - Part 2
    Given User navigates to ATO page "https://www.ato.gov.au/Calculators-and-tools/Host/?anchor=STC&anchor=STC#STC/questions"
    When User select assessment year, income and residency status as per below data
    | Year 				| Income 							| Residency   							| TaxableMonths | ExpectedTaxAmount |
		| 2018-19 	  | 100000 	 						| Resident for full year 		| 12						| 24,497.00					|
		| 2017-18 	  | 90000 	 						| Non-resident for full year| 12						| 29,385.00					|
		| 2016-17 	  | 80000 	 						| Part-year resident 				|	7							| 17,921.87					|
		Then User should be displayed with expected tax values
		| ExpectedTaxAmount |
		| $24,497.00			  |
		| $29,385.00				|
		| $17,921.87				|

  @Exercise3
  Scenario: API Test
  	Given The API is up and running with endpoint "http://digitalapi.auspost.com.au/postage/parcel/international/service.json"
  	When User sends request message to check price for sending a package of different weights to different countries as per below data
  	 | Weight 			  | Country							|
		 | 1.0      	    | India 	 					  |
		 | 2.0      	    | United Kingdom 			|
		 | 3.0      	    | United States	 			|
  	Then User recieves standard delivery price as part of response message
    
