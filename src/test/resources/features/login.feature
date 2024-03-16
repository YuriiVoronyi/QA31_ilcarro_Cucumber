Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When  User open ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And  User quites browser

  @invalidPassword
  Scenario Outline: Check User can't login with invalid data
    Given User launches Chrome Browser
    When  User open ilcarro Main Page
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And  User quites browser
    Examples:
      | email         | password |
      | fog@gmail.com | ghea1233 |
      | fog@gmail.com | ghea123$ |
      | fog@gmail.com | GHEA123$ |
      | fog@gmail.com | ghearrr$ |
      | fog@gmail.com | 1234556$ |
      | fog@gmail.com | $$$$$$$$ |