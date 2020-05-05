Feature: Login TestMeApp
Scenario Outline: login
Given user should navigate to testmeapp on chrome browser
When user should click on login link
And user enter with username as "<un>"
And userenter with password as "<pass>"
And user clicks on login button
Then user should verify login success
 
 Examples:
 |un||pass|
 |pranali||Pass@123|
 |Alex||Alex@123|
