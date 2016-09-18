#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#Background: List of steps run before each of the scenarios
@tag
Feature: Product Maintenance
  As an admin
  I want to be able to add update delete or search a product
  So that I can track valid and invalid entries of products

  Background: Login
    Given I am on the "AdminHome" Page
    When I login with my credentials
      | username            | password |
      | admin@yourstore.com | admin    |

  Scenario: Add Product Basic
    Given I click on "Catalog"
    And I click on "Products"
    And I click on "Add New"
    When I add Product Details
      | ProductName | ProductDescription | Price   |
      | Nike Shoes  | Shoes from Nike    | 120.00  |
    Then The product is in the list of Product
    
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
