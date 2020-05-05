Feature: Search TestMeApp
Scenario: search
Given user should navigate to testmeapp on chrome browser
When user should click on login link
And user enter with username as "pranali"
And userenter with password as "Pass@123"
And user clicks on login button
And search for headphones
And add to cart
Then verify the search page
 
 