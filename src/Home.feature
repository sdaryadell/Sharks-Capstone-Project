Feature: Retail Home Page

  # we can write comment in feature file using Hashtag
  #each feature file starts with word Feature: Name of Feature
  # each test case is one scenario
  # each scenario starts with Gherkin keywords
  #Given precondition
  #when Action
  #Then expected Result
  #And which is following When steps.
  @loginTest
  Scenario: login to Retail Website
    Given user is on Retail home Page
    When user click on MyAccount
    And user click on Login option
    And user enter userName "shark@tekschool.us" and password "123456"
    And user click on login button
    Then user should be logged into myAccount Page