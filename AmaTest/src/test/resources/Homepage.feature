Feature:Checking thr home functionality
  Scenario: verify link
    Given user is in home page
    When user clicks on"Hello. Sign in"
    And I enters data with name as"macy2005@gmail.com"  and Password as "chetan1"
    And I click on "Sign in" button
    Then  user should login successfully with text "Hello, macy"

    @prime
  Scenario: check Try Prime functionality

    Given user is in home page
    When user mouse hovers on Try Prime button
    Then user should see the Prime detail page successfully