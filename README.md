https://www.booking.com/


Capstone Project: Automated Testing of Travel Booking Website (Booking.com)
Project Overview:
This project aims to automate the testing of various functionalities of the Booking.com website
using Selenium for UI testing, manual testing techniques, API testing, and Cucumber for
Behavior-Driven Development (BDD). The goal is to ensure that the website functions smoothly,
providing users with a reliable and efficient travel booking experience.
Assignment Tasks:
1. Automated UI Testing with Selenium
 Task: Develop an automated test suite to verify key functionalities on Booking.com
using Selenium.
 Test Environment Setup:
o Set up Selenium WebDriver with a test framework like TestNG or JUnit.
o Integrate the project with Maven or Gradle for dependency management.
o Configure browser drivers (e.g., ChromeDriver, GeckoDriver) to support cross-
browser testing.
o Set up a Continuous Integration (CI) pipeline using Jenkins or GitLab CI to
automate test execution.
 Automated Test Cases:
o Home Page:
 Validate the search functionality for destinations, check-in/out dates, and
number of guests.
 Ensure proper loading and display of promotional banners and offers.
o Search Results:
 Automate the process of filtering results by price, star rating, property
type, and more.
 Validate the sorting of results by various criteria like price, rating, and
distance from landmarks.

o Hotel Details Page:
 Verify that hotel details such as name, description, amenities, room
options, and pricing are displayed correctly.
 Automate the selection of rooms and proceed to the booking page.
o Booking Process:
 Test the entire flow from selecting a hotel room to entering guest details
and completing the booking.
o User Account Management:
 Automate user registration, login, profile updates, and viewing past
bookings.

o Responsive Design Testing:
 Ensure that the website is responsive and functions correctly on different
devices (mobile, tablet, desktop).

o Cross-Browser Testing: Run tests on multiple browsers to ensure compatibility.

 Reporting:
o Generate detailed test execution reports using tools like Allure or ExtentReports.

2. Manual Testing
 Task: Perform manual testing to validate the user interface, core functionalities, and
explore edge cases.
 Test Plan and Test Cases:
o Home Page: Test navigation, search functionality, and the accuracy of displayed
promotions.
o Search Functionality: Validate the accuracy of search results, including sorting
and filtering options.
o Hotel Details: Check the accuracy of hotel descriptions, amenities, room
availability, and pricing.
o Booking Process: Manually test each step of the booking process, from room
selection to payment.
o User Account Management: Verify account creation, login/logout, and profile
management manually.
 Exploratory Testing:
o Conduct exploratory testing to identify potential usability issues and edge cases
not covered by automated tests.

 Documentation:
o Document test cases, expected results, and actual outcomes in a test management
tool like Jira or TestRail.
o Log any defects or issues discovered during testing and track their resolution.

3. API Testing
 Task: Use Postman and Rest Assured to test Booking.com&#39;s public APIs (e.g., hotel
search, booking management).
 Test Scenarios:
o Hotel Search API: Validate that the API returns accurate search results based on
various criteria (location, dates, guest count).
o Booking Management API: Test endpoints for creating bookings, retrieving
booking details, and canceling bookings.
o User Account API: Validate endpoints related to user account creation,
authentication, and profile management.
 Automated API Tests with Rest Assured:
o Write automated test cases to validate API responses, data integrity, and error
handling.
o Implement security testing to ensure proper authentication and authorization are
in place.
 Reporting:
o Generate API test reports and integrate them into the CI pipeline.

4. Behavior-Driven Development (BDD) with Cucumber

 Task: Implement BDD using Cucumber to define and automate test scenarios in Gherkin
syntax.
 Gherkin Syntax: Write feature files to describe the expected behavior of the
Booking.com website.
 Test Scenarios:
o Search and Filter Hotels: Define scenarios for searching for hotels and applying
various filters.
o Booking a Hotel Room: Write scenarios for the entire booking process, from
room selection to payment.
o User Account Management: Define scenarios for user registration, login, and
managing bookings.
o Booking Management: Describe scenarios for viewing and canceling bookings.
 Integration with Selenium and Rest Assured: Link Gherkin steps to Selenium for UI
testing and Rest Assured for API testing.
 Execution and Reporting: Run Cucumber tests and generate detailed reports.
Tools and Technologies:
 UI Testing: Selenium WebDriver, TestNG/JUnit, Maven/Gradle, Jenkins,
Allure/ExtentReports.
 Manual Testing: Jira, TestRail, or similar tools for test management.
 API Testing: Postman, Rest Assured, Swagger (for API documentation).
 BDD: Cucumber, Gherkin syntax, Jenkins for CI.
 CI/CD: Jenkins, GitLab CI, Docker (optional).
Expected Deliverables:
 Automated Test Scripts: Selenium and Rest Assured scripts for key functionalities.
 Manual Test Cases: Documented manual test cases and exploratory testing results.
 Test Reports: Comprehensive reports from both automated and manual testing.
 CI/CD Pipeline: A fully integrated CI/CD pipeline with automated tests.
 BDD Feature Files: Gherkin feature files detailing expected behavior.
 Project Presentation: A summary presentation covering the testing strategy, tools used,
and results.
