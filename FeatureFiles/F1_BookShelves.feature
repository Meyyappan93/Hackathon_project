Feature: Display BookShelves

  Scenario: To Fetch Details of Top Three   BookShelves
    Given The user Searches for Bookshelves and handles popup
    When User selects the price margin using slider and category using dropdown
    And User clicks the excludeOutOfStock checkbox and select the price high to low in sortBy dropdown
    Then User fetches the product details

  @regression
  Scenario: To Fetch Details of Top Three   BookShelves
    Given The user Searches for Bookshelves and handles popup
    When User selects the price margin using slider and category using dropdown
    And User clicks the excludeOutOfStock checkbox and select the price high to low in sortBy dropdown
    Then User fetches the product details

  @sanity
  Scenario: To Fetch Details of Top Three   BookShelves
    Given The user Searches for Bookshelves and handles popup
