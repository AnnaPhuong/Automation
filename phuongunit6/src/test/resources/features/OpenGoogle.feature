@tag
Feature: Open Google Page

@tag1
  Scenario: Open google page
    Given Open google
     When I am input keywork is "hello"
      And user click search button
     Then I verify the error message is "Incorrect password. Please try again."