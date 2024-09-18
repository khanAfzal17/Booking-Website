Feature: Booking.com Website Functionality

  Scenario: Verify Booking Page Elements and Actions
    Given user is on the booking page
    When user handles the popup
    And user enters the destination
    And user selects the check-in date "24 September 2024"
    And user selects the check-out date "2 October 2024"
    And user selects the number of persons
    And user performs a search
    Then the search results should be displayed
    Then the search results should be displayed 
    And if a post-search pop-up appears, it should be handled
    #And user selects the hotel
    #And user select the number of rooms
    #And user select the reserve
   #
  
    