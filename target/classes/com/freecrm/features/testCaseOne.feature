Feature: Test FreeCRM login functionality

Scenario: validate login fuctionality
    Given I open a browser
    When I go to FreeCRM link
    And I see CRM logo
    And I see Forgot Password link
    And I see Features link
    And I see SignUp link
    And I see Pricing link
    And I see Customers link
    And I see Contact link
    When I enter username and password
    And I click on login button
    Then I should see logout link
    And I click on the contact in the menu
    And I wait three seconds
    And I enter first name
    And I enter last name
    And I enter nickname
    And I enter position
    And I enter department
    And I click on save button
    