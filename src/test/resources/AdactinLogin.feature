Feature: Booking an hotel in adactin website

Scenario Outline: Booking an hotel by filling required details 
Given User is on adactin login page
When User enters the valid "<username>" and "<password>"
Then User should click on login button
When User fills the correct details on "<Location>","<Hotels>","<RoomType>","<Number Of rooms>","<Adults per room>","<Children per room>"
Then User should click on search button
When User should select any hotel
Then User should click on continue button
When User should enter the correct details on "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry Date>","<Expiry year>","<CVV Number>"
Then User should click book now button

Examples:
|username|password|Location|Hotels|RoomType|Number Of rooms|Adults per room|Children per room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Expiry Date|Expiry year|CVV Number|
|purushothaman|vaishu@12345|Melbourne|Hotel Creek|Double|1 - One|1 - One|0 - None|Arjun|Das|Chennai|1234456778904321|American Express|February|2013|100|
|purushothaman|vaishu@12345|Melbourne|Hotel Creek|Double|1 - One|1 - One|0 - None|Virat|kohli|Bangalore|1234456778904321|American Express|May|2012|183|
