Feature: Main Page

  @navigate
  Scenario: Verify Main Page title is displayed
    Given User launches Chrome Browser
    When  User open ilcarro Main Page
    Then  User verifies Main Page title is displayed
    And   User quites browser