 @OrangeHRM
Feature: This is to test OrangeHRM login flow
Scenario: OrangeHRM login scenario

Given User is on OrangeHRM login page
When User is giving username and password
And User is Click on Submit button to login
And User is going to logout from OrangeHRM
Then Again user is on OrangeHRM login page now