Feature: Add Car

  @addCar
  Scenario: Check Adding a car
    Given User launches Chrome Browser
    When  User open ilcarro Main Page
    And User clicks on LetTheCarWork link
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Success message button
    And User enters location
    And User enters manufacture model year
    And User enters fuel
    And User enters seats carclass carregnumber price
    And User enters text about
    And User upload file
    And User clicks submit button
    Then User verifies Success car added displayed
    And  User quites browser





