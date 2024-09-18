//package Steps;
//
//import com.pages.BookingPage;
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.en.*;
//
//public class BookingPageSteps {
//
//    private BookingPage bookingPage = new BookingPage();
//    
//
//    // Scenario: Search and Filter Hotels
//    @Given("user is on the booking page")
//    public void user_is_on_the_booking_page() {
//        DriverFactory.getDriver()
//        .get("https://www.booking.com/");
//    }
//
//    @When("i enter {string} in the destination search box")
//    public void i_enter_in_the_destination_search_box(String destination) throws InterruptedException {
//        bookingPage.enterDestination(destination);
//    }
//
//    @And("I select check-in date as From {string}")
//    public void i_select_check_in_date_as_from(String checkInDate) throws InterruptedException {
//        bookingPage.selectCheckInDate(checkInDate);
//    }
//
//    @And("user select To date {string}")
//    public void user_select_to_date(String checkOutDate) throws InterruptedException {
//        bookingPage.selectCheckOutDate(checkOutDate);
//    }
//
//    @And("I click on the search button")
//    public void i_click_on_the_search_button() throws InterruptedException {
//        bookingPage.clickSearchButton();
//    }
//
//    @Then("I should see a list of hotels available in {string} for the selected dates")
//    public void i_should_see_a_list_of_hotels_available_in_for_the_selected_dates(String destination) {
//        // Add assertions here to verify the list of hotels
//    }
//
//    // Scenario: Book a hotel room
//    @When("I have searched for hotels in a {string}")
//    public void i_have_searched_for_hotels_in_a(String destination) throws InterruptedException {
//        bookingPage.enterDestination(destination);
//        bookingPage.clickSearchButton();
//    }
//
//    @And("user should enter fromdate {string}")
//    public void user_should_enter_fromdate(String fromDate) throws InterruptedException {
//        bookingPage.selectCheckInDate(fromDate);
//    }
//
//    @And("user should be enter todate {string}")
//    public void user_should_be_enter_todate(String toDate) throws InterruptedException {
//        bookingPage.selectCheckOutDate(toDate);
//    }
//
//    @When("I choose a {string} bed")
//    public void i_choose_a_bed(String roomType) throws InterruptedException {
//        bookingPage.selectRoom(roomType, false);
//    }
//
//    @When("user select breakfast {string}")
//    public void user_select_breakfast(String breakfastOption) throws InterruptedException {
//        if (breakfastOption.equalsIgnoreCase("Breakfast included")) {
//            bookingPage.selectRoom("Double bed", true);
//        }
//    }
//
//    @And("select the Availability and click the option")
//    public void select_the_availability_and_click_the_option() throws InterruptedException {
//        // Implement the logic to select availability and click the relevant option
//    }
//
//    @And("user on the booking page and user select the rooms")
//    public void user_on_the_booking_page_and_user_select_the_rooms() throws InterruptedException {
//        // Implement the logic to select the rooms on the booking page
//    }
//
//    @Then("user click the reserve button")
//    public void user_click_the_reserve_button() throws InterruptedException {
//        bookingPage.clickReserveButton();
//    }
//
//    @And("user on Details page user enter first name {string}")
//    public void user_on_details_page_user_enter_first_name(String firstName) throws InterruptedException {
//        bookingPage.enterUserDetails(firstName, "", "", "", "");
//    }
//
//    @And("user enter last name {string}")
//    public void user_enter_last_name(String lastName) throws InterruptedException {
//        bookingPage.enterUserDetails("", lastName, "", "", "");
//    }
//
//    @And("user enter mail name {string}")
//    public void user_enter_mail_name(String email) throws InterruptedException {
//        bookingPage.enterUserDetails("", "", email, "", "");
//    }
//
//    @And("user enter country {string}")
//    public void user_enter_country(String country) throws InterruptedException {
//        bookingPage.enterUserDetails("", "", "", country, "");
//    }
//
//    @And("user enter phone number {string}")
//    public void user_enter_phone_number(String phoneNumber) throws InterruptedException {
//        bookingPage.enterUserDetails("", "", "", "", phoneNumber);
//    }
//
//    @And("user click the checkbox 1.e Yes, I want free paperless confirmation")
//    public void user_click_the_checkbox_yes_i_want_free_paperless_confirmation() throws InterruptedException {
//        bookingPage.clickPaperlessCheckbox();
//    }
//
//    @And("user click on Next: Final Details")
//    public void user_click_on_next_final_details() throws InterruptedException {
//        bookingPage.clickFinalDetailsButton();
//    }
//
//    @And("user click Checking your booking")
//    public void user_click_checking_your_booking() throws InterruptedException {
//        // Implement the logic to click Checking your booking
//    }
//
//    @Then("user click complete booking")
//    public void user_click_complete_booking() throws InterruptedException {
//        bookingPage.clickCompleteBookingButton();
//    }
//
//    // Scenario: User Account Management
//    @When("user click register option")
//    public void user_click_register_option() throws InterruptedException {
//        bookingPage.registerUser("", ""); // You should pass appropriate email and password if needed
//    }
//
//    @When("user enters username email {string}")
//    public void user_enters_username_email(String email) throws InterruptedException {
//        bookingPage.registerUser(email, ""); // Set password if needed
//    }
//
//    @And("user enters user password {string}")
//    public void user_enters_user_password(String password) throws InterruptedException {
//        bookingPage.registerUser("", password);
//    }
//
//    @And("user clicks on Login")
//    public void user_clicks_on_login() throws InterruptedException {
//        bookingPage.loginUser("", ""); // You should pass appropriate email and password if needed
//    }
//
//    @And("user clicks account option")
//    public void user_clicks_account_option() throws InterruptedException {
//        bookingPage.clickAccountOption();
//    }
//
//    @Then("user clicks Bookings and trips")
//    public void user_clicks_bookings_and_trips1() throws InterruptedException {
//        bookingPage.clickBookingsAndTrips();
//    }
//
//    // Scenario: Booking Management
//    @And("user clicks accounts option")
//    public void user_clicks_accounts_option() throws InterruptedException {
//        bookingPage.clickAccountOption();
//    }
//
//    @And("user clicks Bookings and trips")
//    public void user_clicks_bookings_and_trips() throws InterruptedException {
//        bookingPage.clickBookingsAndTrips();
//    }
//
//    @And("user see the viewing details and click")
//    public void user_see_the_viewing_details_and_click() throws InterruptedException {
//        bookingPage.viewBookingDetailsAndCancel();
//    }
//
//    @Then("user see the view the payment details and cancel booking")
//    public void user_see_the_view_the_payment_details_and_cancel_booking() throws InterruptedException {
//        bookingPage.viewBookingDetailsAndCancel();
//    }
//}





//running 1


package Steps;

import com.pages.BookingPage;
import io.cucumber.java.en.*;

public class BookingPageSteps {

    private BookingPage homePage = new BookingPage();

    @Given("user is on the booking page")
    public void user_is_on_the_booking_page() {
        homePage.Browser();
    }

    @When("user handles the popup")
    public void user_handles_the_popup() throws InterruptedException {
        homePage.HandlePopUp();
    }

    @When("user enters the destination")
    public void user_enters_the_destination() throws InterruptedException {
        homePage.Destination();
        Thread.sleep(3000);
    }

    @When("user selects the check-in date {string}")
    public void user_selects_the_check_in_date(String checkInDate) throws InterruptedException {
        homePage.check_in_date();
        Thread.sleep(3000);
    }

    @When("user selects the check-out date {string}")
    public void user_selects_the_check_out_date(String checkOutDate) throws InterruptedException {
        homePage.Check_Out_Date();
        Thread.sleep(3000);
    }

    @When("user selects the number of persons")
    public void user_selects_the_number_of_persons() throws InterruptedException {
        homePage.Persons_dropDown();
        Thread.sleep(3000);
    }

    @Then("user clicks the Done button")
    public void user_clicks_the_Done_button() throws InterruptedException {
        homePage.Done();
        Thread.sleep(3000);
    }

    @When("user performs a search")
    public void user_performs_a_search() throws InterruptedException {
        homePage.search();
        Thread.sleep(3000);
    }

    @Then("the search results should be displayed")
    public void the_search_results_should_be_displayed() {
        // Implement your assertion here to verify search results are displayed
        boolean resultsDisplayed = true; // replace with actual check
        if (!resultsDisplayed) {
            throw new AssertionError("Search results are not displayed.");
        }
    }
    
   
    @Then("if a post-search pop-up appears, it should be handled")
    public void if_a_post_search_pop_up_appears_it_should_be_handled() throws InterruptedException {
        homePage.HandlePostSearchPopUp();
        Thread.sleep(3000);
    }
   
    
//    @And("user selects the hotel")
//    public void user_selects_the_hotel() throws InterruptedException {
//    	homePage.SelectHotel();
//    	Thread.sleep(3000);
//    }
//    
//    @And("user select the number of rooms")
//    public void user_select_the_number_of_rooms() throws InterruptedException {
//    	homePage.roomDropdown();
//    	Thread.sleep(3000);
//    }
//    
//    @And("user select the reserve")
//    public void user_select_the_reserve() throws InterruptedException {
//    	homePage.Reserve();
//    	Thread.sleep(3000);
//    }  
}
