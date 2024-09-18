package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.pages.LibraryAutomation;
public class LibraryStepDefinitions {

    WebDriver driver;
    LibraryAutomation libraryAutomation;

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        driver.get("http://localhost:8080/api/books/");
    }

    @When("the user logs in with username {string} and password {string}")
    public void user_logs_in(String username, String password) {
        libraryAutomation.Login(username, password);
    }

    @Then("the user should see the home page")
    public void user_sees_home_page() {
        
        String expectedUrl = "http://localhost:8080/api/books/"; 
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "User is not on the home page.");
    }

    @When("the user searches for {string}")
    public void user_searches_for(String bookTitle) {
        libraryAutomation.SearchBook(bookTitle);
    }

    @Then("the user should see the book in the search results")
    public void user_sees_book_in_search_results() {
       
        List<String> searchResults = libraryAutomation.SearchBook("Effective Java");
        Assert.assertTrue(searchResults.contains("Effective Java"), "The book 'Effective Java' was not found in the search results.");
    }

    @When("the user adds a book with title {string}, author {string}, and isbn {string}")
    public void user_adds_book(String title, String author, String isbn) {
        libraryAutomation.AddBook(title, author, isbn);
    }

    @Then("the book should be added successfully")
    public void book_is_added_successfully() {
     
        Map<String, String> bookDetails = libraryAutomation.GetBookDetails("9876543210");
        Assert.assertEquals(bookDetails.get("title"), "New Book", "Book title does not match.");
        Assert.assertEquals(bookDetails.get("author"), "Author Name", "Book author does not match.");
    }

    @When("the user updates the book with isbn {string} to have the title {string}")
    public void user_updates_book(String isbn, String newTitle) {
        libraryAutomation.UpdateBookDetails(isbn, newTitle);
    }

    @Then("the book details should be updated successfully")
    public void book_details_are_updated() {
      
        Map<String, String> updatedBookDetails = libraryAutomation.GetBookDetails("9876543210");
        Assert.assertEquals(updatedBookDetails.get("title"), "Updated Title", "Book title was not updated correctly.");
    }
}
