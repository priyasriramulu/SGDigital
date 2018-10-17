@UserStory2
Feature: User Story 2 - Search for a specific vacancy

As a user
I want to be able to search on the open vacancies in the careers page
So that I can quickly find the open vacancies in Singapore that I’m interested in

Scenario: US02_To confirm the display of Free text filter and results

Given User is on Careers Page
Then there is free text filter field is available
Then I give input in search field
 |L2|
 |Test###|
 |##$$$|
 |Sample|
Then I give valid input by Search button

Scenario: US02_Validation of Filter by Location

When Filter by location



