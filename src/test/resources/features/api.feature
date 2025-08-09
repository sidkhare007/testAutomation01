Feature: API tests
  Scenario: Call public API
    Given I call demoqa users API
    Then status code is 200
