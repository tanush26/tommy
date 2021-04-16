@basket
Feature:
  As a customer
  I want to buy a product
  So that I can view product in basket

  Background:
    Given I  am on homepage
    When I select "WOMEN"
  @coats
  Scenario:
    And I select sublist "Coats & Jackets"
    And I select sublist filters "LABEL"
    And I select subFilters "TOMMY JEANS"
    And I select sublist filters "RANGE"
    And I select subFilters "SUSTAINABLE STYLE"
    And I select sublist filters "STYLE"
    And I select subFilters "PADDED JACKETS"
    And I select sublist filters "MATERIAL"
    And I select subFilters "DOWN FILLED"
    And I select sublist filters "SIZE"
    And I select subFilters "M"
    And I select sublist filters "PRICE"
    And I select subFilters "£85.00,£200.00"
    And I select random product""
    And I select size "M"
  @bags
  Scenario:
    And I select sublist "Bags"
    And I select sublist filters "LABEL"
    And I select subFilters "TOMMY JEANS"
    And I select random product""

