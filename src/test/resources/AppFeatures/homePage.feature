Feature: To verify the functionality on the Friday Application

  Background: 
    Given I launch Chrome Browser

  Scenario: Tescase Case For BMW
    Given user is on Home page
    When I click on Next button 
    And I click on Next button 
    And I click on Search button
    And I click on BMW Car
    And I select 1er
    And I select Cabrio
    And I select Benzin
    And I select 105kw 
    And I enter Registertion year
    And I click on Next button
    Then I should see DOB Screen
    
   Scenario: Tescase Case For Ford
    Given user is on Home page
    When I click on Next button 
    And I click on Next button 
    And I click on Search button
    And I click on Ford Car
    And I select Fiesta
    And I select Benzin
    And I select 33kW/45PS
    And I select FIESTA84
    And I enter Registertion year
    And I click on Next button
    Then I should see DOB Screen
    
    Scenario: Tescase Case For Ford
    Given user is on Home page
    When I click on Next button 
    And I click on Next button 
    And I click on Search button
    And I click on Audi Car
    And I select Aone
    And I select Benzin
    And I select 60kW/82PS
    And I select BHL
    And I enter Registertion year
    And I click on Next button
    Then I should see DOB Screen
  
