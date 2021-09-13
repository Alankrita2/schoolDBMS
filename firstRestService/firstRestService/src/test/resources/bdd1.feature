Feature: Need to test PostController
  Scenario: Whenever a student enrolls to a school
    Given A student enrolls
    When The data is collected
    Then The data is added in the database

  Scenario: Whenever a student leaves the school
    Given A student leaves
    When The data is deleted
    Then The data is removed from the database