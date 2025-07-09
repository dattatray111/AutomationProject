Feature: Verify important features for Saucedemo site.

  @tag1
  Scenario Outline: Verify login check for saucedemo website	
    Given Open saucedemo website
    When Login with valid <username> and <password>
    Then User must logged in successfuly
    Examples: 
      | username  | password | 
      | standard_user  |    secret_sauce | 
