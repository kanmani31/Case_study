Feature:Login
Login  into TestMe App
Scenario Outline:Login using valid registered credentials
Given The user is already registered and in the login page
When The user enters <username> and <password> and click on login button
Then The user must be directed to home page

Examples:
|username| |password|
|"lalitha"| |"password123"|
|"alphabets"| |"password"|
