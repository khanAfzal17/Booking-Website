Feature: Library Management

  Scenario: Logging in
    Given the user is on the login page
    When the user logs in with username "user" and password "password"
    Then the user should see the home page

  Scenario: Searching for a book
    Given the user is logged in
    When the user searches for "Effective Java"
    Then the user should see the book in the search results

  Scenario: Adding a book
    Given the user is logged in
    When the user adds a book with title "New Book", author "Author Name", and isbn "9876543210"
    Then the book should be added successfully

  Scenario: Updating book details
    Given the user is logged in
    When the user updates the book with isbn "9876543210" to have the title "Updated Title"
    Then the book details should be updated successfully
