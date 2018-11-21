Feature: Shop Kirkland water

  Scenario: Buy Kirkland water by searching kirkland on search menu
    Given user opened browser and navigate to costco homepage
    When user search kirkland water on search and hit enter
    Then User land on kirkland result page
