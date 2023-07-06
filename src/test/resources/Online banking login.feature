@Smoke @Regression
Feature: Login function for Smarttech online Banking

Description:

@Positive_Scenario  @TC_LP-18
Scenario: Login function test with valid credential.
Given Open the Browser
And Go to Application
When valid user name
And valid password
And sign in
Then Check signout button there or not


@Negative_Scenerio @TC_LP-19

Scenario: Login function test with invalid credential.
Given Open the Browser
And Go to Application
When put invalid user name
And put invalid password
And Click sign in
And Accept Alert
Then Signout button should not visible 

