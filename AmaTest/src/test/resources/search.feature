Feature: Checking the search functionality
  Scenario: user is able to search item
    Given user is in home page
    When user clicks on searchbar
    When user types "laptop" in the search bar
    And user clicks on "search" button
    Then user should see the product detail page with text "laptop"
    And user clicks on "DELL Inspiron 5000 13.3-Inch 2in1 Convertible Touchscreen Laptop" link
   And user clicks on "Add to basket" btn
    Then user is able to see the item in the basket as "Added to Basket"