# Author : Mamun Chowdhury
# Date : 4/23/2021

Feature: Sauce Demo Shopping

@smoke
 Scenario: Sauce Demo Shopping using Functions
  
    Given user are in the login page
    When user are able to type user name
    And user are able to type password
    Then user able to click on login button
    Then user are able to see the backpackText
    And user are able to see the back pack price
    When user are able to backPack add  to Cart
    And user are able to add cart
    And user are able to click on continue shopping
    When user are able to see the fleece Jacket Text
    And user are able to see fleece Jacket parice
    Then user are able to Fleece Jacket add to Cart
    And user able to add Cart
    Then user are able to Click Check out
    And user have to type First Name
    And user have type Last Name
    When user type zipcode
    Then user are able to Click Continue
    And user are able to see Total Price
    Then user also see the Tax
    When user see trhe Final Price
    And user can finish the shopping

  #...........Sauce Demo Positive and Nagetive data validating......
 
 @smoke
  Scenario: positive Data testing for Sauce Demo
    Given user in the login page
    When user text box is enable
    Then user enters right username
    When usertext box is enable
    Then users enters right password
    When user able to see click button
    And users click on the login button
    Then user should be able to login
    And driver quit

@smoke
  Scenario: Nagetive Dat testing for Sauce Demo
    Given user in the login page
    When user text box is enable
    Then user enters wrong username
    When usertext box is enable
    Then users enters wrong password
    When user able to see click button
    And users click on the login button
    Then user should not be able to login
    And driver quit

  #..........Face Book Sign Up Validating...............
  
  Scenario: Facebook sign up validating
  
    Given user in the facebook sign up page
    Then user enters the first Name
    When user can enter the last Name
    Then users enters the email
    When user re-enter the email
    And user are able type password
    Then user have to put Birth Month
    And user have to put Birth Day
    When user have to put Birth Year
    And user are able to select gender
    Then users click on the sign up button
