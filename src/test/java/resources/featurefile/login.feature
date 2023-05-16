Feature: Login Test
  As a user I want to login in on login page
  @sanity @regression
 Scenario: User should login with valid credentials
   Given I am on login page
   When I enter user name "standard_user"
   And I enter password "secret_sauce"
   And I click on login button
   Then verify the product text "Products"

  @smoke @regression
  Scenario: Verify the six products are display on page
    Given I am on login page
    When I enter user name "standard_user"
    And I enter password "secret_sauce"
    And I click on login button
    Then verify the product quantity "6"

