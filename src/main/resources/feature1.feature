Feature: Login TestMeApp
Scenario: login
Given user should navigate to testmeapp on chrome browser
When user should click on login link
And user enter with username as "pranali"
And user enter with first name as "Pranali"
And user enter with last name as "Mankar"
And userenter with password as "Pass@123"
And user enter with confirm password as "Pass@123"
And user selects the gender
And user enter with email as "ppm@gmail.com"
And user enter with mobile number as "9967546887"
And user enter with dob as "02/12/1997"
And user enter with address as "Mumbai"
And user selects the security que
And user enter the security ans as "akola"
And user clicks on register button
Then user should verify registration success
 
