@DataDrivenWithoutHeader
Feature: This is to test OrangeHRM login flow
Scenario: OrangeHRM login scenario

Given Raja is exist on OrangeHRM login page
When Raja is entering the below credentials
|Admin|admin123|
And Raja is Clicking on Submit button to login
And Raja is Clicking to logout from OrangeHRM
Then Raja user is entered OrangeHRM login page now