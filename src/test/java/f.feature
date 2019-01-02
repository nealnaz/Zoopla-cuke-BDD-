Feature:Test
  Property to rent

  Scenario: validate UK property to rent search

    Given  I am on the homwpage
    When i click To Rent
    And enter address
    And enter max price
    And enter min price
    And enter Property type
    And enter Bedrooms
    And  click on search
    Then validate UK property to rent search
