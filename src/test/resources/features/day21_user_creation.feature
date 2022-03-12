@user_creation
Feature: user creation feature
  Scenario Outline:
    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user enters "<admin_id>" and "<admin_password>"
    And user clicks on the login button
    And verify the login is successful


    Examples:
      | admin_username | admin_password |
      | CWoburn        | Cw192837?      |

  Scenario Outline: create user
    Given user clicks on administration dropdown
    And user clicks on user management button
    And user clicks on create a new user button
    And user provides login as "<login>"
    And user enters firstname as "<firstName>" and
    And user enters lastname as "<lastName>"
    And user enters email "<email>"
    And user clicks on language dropdown
    And user selects "Turkce>"
    And user clicks on profiles dropdown "<profiles>"
    And user clicks on save button
    Then verify the new user creation is successful

#  Given user logs in as an admin
 # And navigates to ‘Create or Edit user page’
#  And enter user information
#  Then verify the new user creation is successful

    Examples: user info
      | login   | firstName | lastName | email             | successMessage       |
      | JohnDoe | John      | Doe      | kalin54@gmail.com | successfully created |