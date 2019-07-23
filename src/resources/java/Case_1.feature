
Feature: User Registration
  

  @tag1
  Scenario: Registration
    Given The User should be in home page
    And Click on the Signup link
    When The User enters the username as "username1" and firstname as "user" and lastname as "name" and password as "456789" and confirm password as "456789" 
    And select gender options and enter email as "user@gmail.com" and number as "1234567891" and Dob as"04/12/1965" and address as "chrompet" 
    And selects a security question and enter answer as "pink" and click register button
    Then The user must be directed to login page
    
