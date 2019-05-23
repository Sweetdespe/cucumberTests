Feature: Gradle-Cucumber integration

  Scenario: Chrome Test
    Given I open Firefox
    When I search Hello Word
    Then I close the browser
    
  Scenario: Firefox Test
  	Given I open Chrome
    When I search Hello Word
    Then I close the browser