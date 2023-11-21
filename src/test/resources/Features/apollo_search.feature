Feature: The user validate the apollo aplication

  Scenario: The user validate the buy medicines page
    Given the user launche the url for apollo aplication
    When the user search the medicines
    And user click the add button
    And the user click the card icon
    Then the user validate the adder page
    When the use click the add address button
