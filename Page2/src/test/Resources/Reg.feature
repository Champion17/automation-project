Feature: Accessing amazon login and search button
  @test1
  Scenario:User accessing search button as a guest
    Given user is on the home page
    When user searches as a guest for an item
    And user clicks on search button
    Then the search items are displayed

@test1
    Scenario: User accessing search after registering
      Given user is on the home page
      When user clicks the "Sign in" link
      When user enters user Email
      And user enters the password
      And user clicks on signin button
      Then user is on the amazon page
      When user enters the search item
      And user clicks on search button
      Then user can view the search item




