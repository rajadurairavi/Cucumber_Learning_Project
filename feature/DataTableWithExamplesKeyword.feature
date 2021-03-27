@DataDrivenWithExamples
Feature: This is to test OrangeHRM login flow
Scenario Outline: OrangeHRM login scenario

Given Rajadurai is exist on OrangeHRM login page
When Rajadurai is entering "<username>" and "<password>"
And Rajadurai is Clicking on Submit button to login
And Rajadurai is Clicking to logout from OrangeHRM
Then Rajadurai user is entered OrangeHRM login page now

Examples:

|username|password|
|Admin   |admin123|
|Admin   |admin123|