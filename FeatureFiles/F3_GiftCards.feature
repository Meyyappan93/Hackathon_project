Feature: Customize Your Gift cards

  Scenario: Choose Birthday/Anniversay card and fill the form
    Given The user navigates to GiftCards Page and chooses BirthdayOrAnniversay
    Then User selects the gift amount
    Then User fill the details in the LuckyPerson form
    And User gets the error message
    Then User enters the valid details and submits the form

  @sanity
  Scenario: Choose Birthday/Anniversay card and fill the form
    Given The user navigates to GiftCards Page and chooses Birthday/Anniversay
