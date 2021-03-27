@OrangeHRMWithParameter
Feature: This is to test OrangeHRM login flow
Scenario: OrangeHRM login scenario

Given User is exist on OrangeHRM login page
When User is entering "Admin" and "admin123"
And User is Clicking on Submit button to login
And User is Clicking to logout from OrangeHRM
Then Again user is entered OrangeHRM login page now