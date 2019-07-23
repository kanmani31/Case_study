Feature: User searches for a product

@Login
Scenario: User performs Login
Given The user is in Login page of TestMe app
When The user enters "lalitha" and "password123" in the username and password fields
Then The user should be logged in and directed to home page



@Search
Scenario: The user searches for headphones but not adds it to cart
Given The user is in the home page
When The user searches for the headphones
Then The user doesn't add the product to cart 