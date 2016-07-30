@tag
Feature: Open Rediff Page


  @tag1
  Scenario: Login with invalid username
    Given Open rediff page
     When I am input username is "pinkgirl6103"
      And user click Signin button
     Then I verify the error message is "Please enter your password"