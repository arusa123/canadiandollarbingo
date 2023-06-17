Feature: Login Test

  Scenario: Verify user can not login with invalid credentials
    Given when I am on homepage
    When I enter "prime" in the username field
    And I enter "Prime123" in the password field
    And I click on login button
    Then I should not be able to log in with invalid credentials
