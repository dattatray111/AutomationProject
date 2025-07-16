Feature: Verify important features for Saucedemo site.

  @tag1
  Scenario Outline: Verify login check for saucedemo website
    Given Open saucedemo website
    When Login with valid <username> and <password>
    Then User must logged in successfuly
    And User logout

    Examples: 
      | username | password |
      | Admin    | admin123 |
      
      @tag1
  Scenario Outline: Verify login check for saucedemo website1
    Given Open saucedemo website
    When Login with valid <username> and <password>
    Then User must logged in successfuly
    And User logout

    Examples: 
      | username | password |
      | Admin    | admin123 |
      
         @tag1
  Scenario Outline: Verify login check for saucedemo website2
    Given Open saucedemo website
    When Login with valid <username> and <password>
    Then User must logged in successfuly
    And User logout

    Examples: 
      | username | password |
      | Admin    | admin123 |
