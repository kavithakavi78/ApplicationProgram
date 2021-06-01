
@tag
Feature: User test the Jpet application Functionality

  @tag1
  Scenario: User register the jpet application
    Given User launch the Jpet Application
    When User register his details
    Then User check sign in process
    
    @tag2
  Scenario: User Check the Search functionality
    Given User launches Jpet Application
    When User login with his credentials
    Then User searches the item in search tag
    
    	
    @tag3
  Scenario: User Check the place order functionality
    Given User launches the pet Application
    And User login the application with credentials	
    When User Searching the pet in search box
    And User add the pet in cart
    Then User placed the order
    
      
    @tag4
  Scenario: User Check the update cart function 
    Given User launching the pet application
    And User logged in with valid credentials
    When User select the pets
    And User update the cart 
    Then User add one more item in cart
    
    
    
    
    @tag5
  Scenario: User Check the remove functionality
    Given User launching the Jept application
    And User login with valid credentials
    When User search the item and add to the cart
    Then User click remove option in cart page
    
    
    

  
