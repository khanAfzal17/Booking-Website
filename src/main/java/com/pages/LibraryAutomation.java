//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LibraryAutomation {
//
//    private WebDriver driver;
//
//    public LibraryAutomation(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void Login(String username, String password) {
//        try {
//            WebElement usernameField = driver.findElement(By.id("username"));
//            WebElement passwordField = driver.findElement(By.id("password"));
//            WebElement loginButton = driver.findElement(By.id("loginButton"));
//
//            usernameField.sendKeys(username);
//            passwordField.sendKeys(password);
//            loginButton.click();
//        } catch (Exception e) {
//            System.out.println("Login failed: " + e.getMessage());
//        }
//    }
//
//    public List<String> SearchBook(String bookTitle) {
//        try {
//            driver.findElement(By.id("searchField")).sendKeys(bookTitle);
//            driver.findElement(By.id("searchButton")).click();
//
//            List<WebElement> results = driver.findElements(By.className("bookTitle"));
//            return results.stream().map(WebElement::getText).collect(Collectors.toList());
//        } catch (Exception e) {
//            System.out.println("Search failed: " + e.getMessage());
//            return Collections.emptyList();
//        }
//    }
//    public void AddBook(String title, String author, String isbn) {
//        try {
//            driver.findElement(By.id("addBookLink")).click();
//            driver.findElement(By.id("titleField")).sendKeys(title);
//            driver.findElement(By.id("authorField")).sendKeys(author);
//            driver.findElement(By.id("isbnField")).sendKeys(isbn);
//            driver.findElement(By.id("submitButton")).click();
//
//            // Verify book is added by searching or by checking confirmation message
//        } catch (Exception e) {
//            System.out.println("Adding book failed: " + e.getMessage());
//        }
//    }
//    public void UpdateBookDetails(String isbn, String newTitle) {
//        try {
//            SearchBook(isbn); // Assumes the search returns the book
//            driver.findElement(By.id("editButton")).click(); // Locate the edit button
//            WebElement titleField = driver.findElement(By.id("titleField"));
//            titleField.clear();
//            titleField.sendKeys(newTitle);
//            driver.findElement(By.id("saveButton")).click();
//
//            // Verification step
//        } catch (Exception e) {
//            System.out.println("Updating book failed: " + e.getMessage());
//        }
//    }
//    public Map<String, String> GetBookDetails(String isbn) {
//        try {
//            SearchBook(isbn); // Assumes search displays the book details
//            String title = driver.findElement(By.id("bookTitle")).getText();
//            String author = driver.findElement(By.id("bookAuthor")).getText();
//
//            Map<String, String> bookDetails = new HashMap<>();
//            bookDetails.put("title", title);
//            bookDetails.put("author", author);
//
//            return bookDetails;
//        } catch (Exception e) {
//            System.out.println("Fetching book details failed: " + e.getMessage());
//            return Collections.emptyMap();
//        }
//    }
//  
//
//    public boolean VerifyBookAddedViaAPI(String isbn) {
//        try {
//            Response response = RestAssured.get("http://localhost:8080/api/books/" + isbn);
//            return response.getStatusCode() == 200;
//        } catch (Exception e) {
//            System.out.println("API verification failed: " + e.getMessage());
//            return false;
//        }
//    }
//    public void TestRestApiForBooks() {
//        // Create a book
//        Response createResponse = RestAssured
//                .given()
//                .contentType("application/json")
//                .body("{\"title\": \"Test Book\", \"author\": \"Test Author\", \"isbn\": \"1234567890\"}")
//                .post("http://localhost:8080/api/books");
//        assert createResponse.getStatusCode() == 201;
//
//        // Get the book
//        Response getResponse = RestAssured.get("http://localhost:8080/api/books/1234567890");
//        assert getResponse.getStatusCode() == 200;
//
//        // Update the book
//        Response updateResponse = RestAssured
//                .given()
//                .contentType("application/json")
//                .body("{\"title\": \"Updated Book Title\"}")
//                .put("http://localhost:8080/api/books/1234567890");
//        assert updateResponse.getStatusCode() == 200;
//
//        // Delete the book
//        Response deleteResponse = RestAssured.delete("http://localhost:8080/api/books/1234567890");
//        assert deleteResponse.getStatusCode() == 204;
//    }
//}


//package com.pages;
// 
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//public class LibraryAutomation {
//
//    private WebDriver driver;
//
//    public LibraryAutomation(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void Login(String username, String password) {
//        try {
//            WebElement usernameField = driver.findElement(By.id("username"));
//            WebElement passwordField = driver.findElement(By.id("password"));
//            WebElement loginButton = driver.findElement(By.id("loginButton"));
//
//            usernameField.sendKeys(username);
//            passwordField.sendKeys(password);
//            loginButton.click();
//
//            // Verifying that the user is on the home page after login
//            String expectedUrl = "http://localhost:8080/api/books/";
//            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed: User did not reach the home page.");
//        } catch (Exception e) {
//            System.out.println("Login failed: " + e.getMessage());
//        }
//    }
//
//    public List<String> SearchBook(String bookTitle) {
//        try {
//            driver.findElement(By.id("searchField")).sendKeys(bookTitle);
//            driver.findElement(By.id("searchButton")).click();
//
//            List<WebElement> results = driver.findElements(By.className("bookTitle"));
//            List<String> bookTitles = results.stream().map(WebElement::getText).collect(Collectors.toList());
//
//            // Verification: Ensuring the book title is in the search results
//            Assert.assertTrue(bookTitles.contains(bookTitle), "Search failed: Book '" + bookTitle + "' not found in search results.");
//            return bookTitles;
//        } catch (Exception e) {
//            System.out.println("Search failed: " + e.getMessage());
//            return Collections.emptyList();
//        }
//    }
//
//    public void AddBook(String title, String author, String isbn) {
//        try {
//            driver.findElement(By.id("addBookLink")).click();
//            driver.findElement(By.id("titleField")).sendKeys(title);
//            driver.findElement(By.id("authorField")).sendKeys(author);
//            driver.findElement(By.id("isbnField")).sendKeys(isbn);
//            driver.findElement(By.id("submitButton")).click();
//
//            // Verification: Checking if the book was successfully added by searching for it
//            Map<String, String> bookDetails = GetBookDetails(isbn);
//            Assert.assertEquals(bookDetails.get("title"), title, "Book title mismatch after adding.");
//            Assert.assertEquals(bookDetails.get("author"), author, "Book author mismatch after adding.");
//        } catch (Exception e) {
//            System.out.println("Adding book failed: " + e.getMessage());
//        }
//    }
//
//    public void UpdateBookDetails(String isbn, String newTitle) {
//        try {
//            SearchBook(isbn); // Assuming the search returns the book
//            driver.findElement(By.id("editButton")).click(); // Locating the edit button
//            WebElement titleField = driver.findElement(By.id("titleField"));
//            titleField.clear();
//            titleField.sendKeys(newTitle);
//            driver.findElement(By.id("saveButton")).click();
//
//            // Verification: Ensuring the title was updated correctly
//            Map<String, String> updatedBookDetails = GetBookDetails(isbn);
//            Assert.assertEquals(updatedBookDetails.get("title"), newTitle, "Book title was not updated correctly.");
//        } catch (Exception e) {
//            System.out.println("Updating book failed: " + e.getMessage());
//        }
//    }
//
//    public Map<String, String> GetBookDetails(String isbn) {
//        try {
//            SearchBook(isbn); // Assuming search displays the book details
//            String title = driver.findElement(By.id("bookTitle")).getText();
//            String author = driver.findElement(By.id("bookAuthor")).getText();
//
//            Map<String, String> bookDetails = new HashMap<>();
//            bookDetails.put("title", title);
//            bookDetails.put("author", author);
//
//            return bookDetails;
//        } catch (Exception e) {
//            System.out.println("Fetching book details failed: " + e.getMessage());
//            return Collections.emptyMap();
//        }
//    }
//
//    public boolean VerifyBookAddedViaAPI(String isbn) {
//        try {
//            Response response = RestAssured.get("http://localhost:8080/api/books/" + isbn);
//            boolean bookExists = response.getStatusCode() == 200;
//            Assert.assertTrue(bookExists, "API verification failed: Book with ISBN " + isbn + " was not found.");
//            return bookExists;
//        } catch (Exception e) {
//            System.out.println("API verification failed: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public void TestRestApiForBooks() {
//        try {
//            // Creating a book
//            Response createResponse = RestAssured
//                    .given()
//                    .contentType("application/json")
//                    .body("{\"title\": \"Test Book\", \"author\": \"Test Author\", \"isbn\": \"1234567890\"}")
//                    .post("http://localhost:8080/api/books");
//            Assert.assertEquals(createResponse.getStatusCode(), 201, "Failed to create a book via API.");
//
//            // Get the book
//            Response getResponse = RestAssured.get("http://localhost:8080/api/books/1234567890");
//            Assert.assertEquals(getResponse.getStatusCode(), 200, "Failed to get the book via API.");
//
//            // Updating the book
//            Response updateResponse = RestAssured
//                    .given()
//                    .contentType("application/json")
//                    .body("{\"title\": \"Updated Book Title\"}")
//                    .put("http://localhost:8080/api/books/1234567890");
//            Assert.assertEquals(updateResponse.getStatusCode(), 200, "Failed to update the book via API.");
//
//            // Deleting the book
//            Response deleteResponse = RestAssured.delete("http://localhost:8080/api/books/1234567890");
//            Assert.assertEquals(deleteResponse.getStatusCode(), 204, "Failed to delete the book via API.");
//        } catch (Exception e) {
//            System.out.println("API test failed: " + e.getMessage());
//        }
//    }
//}
//
//
