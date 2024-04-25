Feature: Ebay Advanced Search Page
  @P1
  Scenario: Ebay Logo on Advanced Search Page
    Given I am on Ebay search page
    When I click Ebay Logo
    Then I am navigated to Ebay Home page

    @P2
    Scenario: Ebay search an item
      Given I am on Ebay Advanced Search Page
      When I advanced search an item "i phone11"
      Then I am navigated to Product Page

      @P3
      Scenario: Advanced search an item
        Given I am on Ebay Advanced Search Page
        When I advanced search an item
          | keyword     | exclude     | min | max |
          | i700phone11 | refurbished |800  |9000 |