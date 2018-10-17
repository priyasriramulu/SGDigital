@UserStory1
Feature: User Story 1 - Login page

As a user
I want to login 
So that i can see my account home page

Scenario: Sign up for new acount

Given User on the home page
When click on Sign Up Menu
Then I can see Account creation page
|hello world|
Then I input the fields
|PlanType|Firstname|Lastname|Email|Confirm Email|Username|Password|ConfirmPassword|company_name|company_phone|company_email|company_fax|company_desc|city|state|postcode|country|
|Free Edition|John2|Nicolas2|JohnNicolas@gmail.com|JohnNicolas@gmail.com|Johnnicolas22|Password#123|Password#123|siv|12345|sv@gmail.com|12345|fdfdgs|test|Michigan|112233|Australia|
|Free Edition|Joh|Nic|JohnNic@gmail.com|JohnNic@gmail.com|johnnic|Password#123|Password#123|comp|112233|comp@gmail.com|112233|nghgj|fdfdg|Michigan|12321|Canada|
|Free Edition|test|tester|tester@gmail.com|tester@gmail.com|testtester|Password#123|Password#123|comp2|143212|comp2@gmail.com|14321|ddff|tytyr|Michigan|343422|Finland|