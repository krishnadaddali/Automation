Feature: Registration page 
  


  Scenario: Verify the dropdown selection
    Given i go to guru registration page
    When i choose an element from the dropdown
    Then the that element will be selected
    
 
  Scenario: Verify the dropdown selection
    Given i go to guru registration page
    When i choose "ANTARCTICA" from the dropdown
    Then "ANTARCTICA" will be selected
    
    
  Scenario Outline: Add two numbers <num1> & <num2>
    Given i go to guru registration page
    When i choose <country> from the dropdown
    Then <country> will be selected
 
  Examples: 
    | country |
    |   ANTARCTICA     |
    |    INDIA    |
    
    
    
    
    
    
    
    
    
    
    