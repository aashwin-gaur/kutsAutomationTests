
@Product
Feature: Product Maintenance
  As an admin
  I want to be able to add update delete or search a product
  So that I can track valid and invalid entries of products

  Background: Login and go to Product Page
    Given I am on the "AdminHome" Page
    When I login with my credentials
      | username            | password |
      | admin@yourstore.com | admin    |
    Given I click on "Catalog"
    And I click on "Products"

  @Product @AddProduct
  Scenario: Add Product Basic
    Given I click on "Add New"
    When I add Product Details
      | ProductName | ProductDescription | Price  |
      | Nike Shoes  | Shoes from Nike    | 120.00 |
    Then The product is in the list of Product

  @Product @RemoveProduct @Single
  Scenario: Remove Product Selected
    When I select a product
      | ProductName | $50 Physical Gift Card |
    And I click on Delete(Selected)
    Then the product is no longer in the list

  @Product @RemoveProduct @Many
  Scenario: Remove all Product Searched
    When I search a product:
      | ProductName | apple |
    And I Select all Products Found
    And I click on Delete(Selected)
    Then the products are no longer in the list


































#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
    #| name  |value | status |
    #| name1 |  5   | success|
    #| name2 |  7   | Fail   |
