Feature: The user validate the apollo aplication

  Scenario: The user validate the Find Doctor option
    Given the user launche the url for apollo aplication
    When the user click the find doctors option
    And the user send the city name
    And the user find the doctor
    Then the user validate the doctor details
    When the user book video consult
