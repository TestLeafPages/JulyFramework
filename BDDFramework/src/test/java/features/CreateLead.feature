Feature: CreateLead in Leaftaps
Background:
Given Open the chrome browser and load the url
And Enter the username as DemoCSR and password as crmsfa
And Click the Login Button
And Click the CRMSFA Link
And Click the Leads Link
And Click the Create Lead Link

Scenario Outline: Positive flow to create a lead
And Enter the Company Name as <Company Name>
And Enter the First Name as <First Name>
And Enter the Last Name as <Last Name>
When Click on the Create Lead Button
Then Verify the Lead Creation

Examples:
|Company Name|First Name|Last Name|
|Testleaf|Balaji|C|
|Testleaf|Dhivya|P|

Scenario: Negative flow to create a lead
And Enter the First Name as Balaji
And Enter the Last Name as C
When Click on the Create Lead Button
But Verify the error message