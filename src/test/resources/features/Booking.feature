#Feature: Expected behaviour of booking .com website
#
#Scenario: Search and Filter Hotels
#
#Given user is on the booking page
#When i enter "Kolkata" in the destinat search box
#5 And I select check-in date as From "24-9-2024" 
#And user select To date "2-10-2024"
#And I click on the search button
#Then I should see a list of hotels available in Kolkata for the selected dates
#
#Scenario: Book a hotel room
#
#Given user is on the booking page 
#When I have searched for hotels in a "Kolkata"
#And user should enter fromdate "24-9-2024"
#And user should be enter todate "2-10-24"
#And I click on the search button
#When I choose a Double bed
#When user select brackfast Breakfast included
#And select the Avalilability and click the option
#And user on the booking page and user select the rooms
#Then user click the reserve button
#And user on Details page user enter first name "Afzal"
#Then user enter last name "Khan"
#Then user enter mail name "afzalkhanbryant@gmail.com"
#Then user enter country "india"
#Then user enter phone number "9123710353"
#And user click the checkbox 1.e Yes, I want free paperless confirmation
#Then user click on Next: Final Details
#And user click Checking your booking
#Then user click complete booking
#
#Scenario: User Account Management
#Given user is on the booking page
#When user click register option
#When user engters username email "afzalkhanbryant@gmail.com"
#And user enters user password "Afzalkhan17"
#And user clicks on Login
#And user clicks account option
#Then  user clicks Bookings and trips
#
#Scenario: Booking Management
#Given user is on the booking page
#And user ciicks accounts option
#And user clicks Bookings and trips
#And user see the viewing details and click
#Then user see the view the payment details and cancel booking