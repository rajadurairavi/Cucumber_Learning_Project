@FaceBookValidLogin
Feature: This is to test facebookloginpage
@FaceBookValidLogin
Scenario: facebook login scenario

Given user is in facebook login page
When user is entering username
And use is entering password
Then user is clicking Submit button

@FaceBookInValidLogin
Scenario: facebook invalidlogin scenario

Given user is in facebook login page
When user is entering username
And use is entering password
Then user is clicking Submit button