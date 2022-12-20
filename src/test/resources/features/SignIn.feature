@SignInTest
Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sohial456@gmail.com' and password 'Asdf123456!'
    And User click on login button
    And User should be logged in into Accout

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'sohail.zahid12@gmail.com' and password 'Sohail123@'
    And User click on login button
    Then User should be logged in into Account

  @AccountCreate
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email               | password  | confirmPassword |
      | Sohail | Sohial456@gmail.com | Asdf1234! | Asdf1234!       |
    And User click on SignUp button
    Then User should be logged into account page

  @UpdateAccount
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Sohail Zahid' and Phone '5301234567'
    And User click on Update button
    Then user profile information should be updated

  @ChangePass
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Asdf12345!       | Asdf123456! | Asdf123456!     |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @Payment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3214567898925445 | ShaSho     |              12 |           2024 |          456 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @UptadeCardInfo
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User select card with ending '5445'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1472583693214569 | Panthers   |              11 |           2026 |          123 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @AddressInfo
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city     | state      | zipCode |
      | United States | Sohail   |  4151234123 | 12 ABC Street |   1 | San Jose | California |   95050 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on the card added to his account
    And User click on remove option of card section
    Then payment details should be removed

  @EditAaddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city        | state      | zipCode |
      | United States | Lashkari |  5301234568 | 123 ABCD Ave  |  35 | Santa Clara | California |   95050 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @removeAdress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
