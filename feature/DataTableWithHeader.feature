@DataDrivenWithHeader
Feature: This is to test OrangeHRM login flow
Scenario: OrangeHRM login scenario

Given Prakash is exist on OrangeHRM login page
When Prakash is entering the below credentials
|username|password|
|Admin   |admin123|
And Prakash is Clicking on Submit button to login
And Prakash is Clicking to logout from OrangeHRM
Then Prakash user is entered OrangeHRM login page now