Feature: Home 
	As a site visitor
	I want to navigate to the homepage
	So that i can view general information of the site



@homeURL	
Scenario: Homepage from URL
Given I navigate to the URL "http://shopify.com/"
Then The page with title "Ecommerce Software, Online Store Builder, POS - Free 14-day Trial by Shopify" is displayed


@LoginScreen
Scenario: Is At Login Screen
Given I navigate to the URL "http://shopify.com/"
When I click on the "Log in" link
Then The page with title "Login" is displayed


@Login
Scenario: Login_fail_pass
Given I navigate to the URL "http://shopify.com/"
When I click on the "Log in" link
Then The page with title "Login" is displayed
When I login with a set of credentials
	|Username      |Password   |
	|abc@123.com.au|blahblah123|	
Then Appropriate outcome is achieved