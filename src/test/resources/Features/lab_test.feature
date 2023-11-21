Feature: The user validate the apollo aplication

  Scenario: The user validate the lab test option
    Given the user launche the url for apollo aplication
    When The user click the lab test option
    And The user click the full body checkup
    Then User validate the full body checkup page
    When The user click add button for basic checkup
    And The user click the lab test page in card icon
    And The user click the procced to pay button
