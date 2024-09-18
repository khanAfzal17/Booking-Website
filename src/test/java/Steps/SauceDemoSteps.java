package Steps;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SauceDemoSteps {
	private WebDriver driver;

@Given("user on the Saucedemo login page")


public void user_on_the_saucedemo_login_page() {


      driver = DriverFactory.getDriver();


      driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
 }
  @When("user enter username {string}")

    public void user_enter_username(String username) {

   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
}

 @When("user enter password {string}")

public void user_enter_password(String password) {

 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

 }

@When("user click the login button")

 public void user_click_the_login_button() {

 driver.findElement(By.xpath("//input[@id='login-button']")).click();

 }

 @When("user should see the products page")

 public void user_should_see_the_products_page() {

 assert driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();

 }

 @When("user add the {string} to cart")

 public void user_add_the_to_cart(String productName) {

driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

  }

 @When("user click the shopping cart link")

public void user_click_the_shopping_cart_link() {

 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        }
 @When("user click the checkout button")



    public void user_click_the_checkout_button() {



        driver.findElement(By.xpath("//button[@id='checkout']")).click();



    }



    @Then("user should see the checkout information page")



    public void user_should_see_the_checkout_information_page() {



        assert driver.findElement(By.xpath("//span[contains(text(),'Checkout: Your Information')]")).isDisplayed();

    }



    @When("user enter first name {string}")



    public void user_enter_first_name(String firstName) {



        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);

    }
    @When("user enter last name {string}")
    public void user_enter_last_name(String lastName) {
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    }
    @When("user enter postal code {string}")
    public void user_enter_postal_code(String postalCode) {
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
    }
    @When("user click the continue button")
    public void user_click_the_continue_button() {
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }
    @When("user should see the checkout overview page")
    public void user_should_see_the_checkout_overview_page() {
        assert driver.findElement(By.xpath("//span[contains(text(),'Checkout: Overview')]")).isDisplayed();
    }
    @When("user click the finish button")
    public void user_click_the_finish_button() {
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }
    @Then("user is navigated to the thank you page")
    public void user_is_navigated_to_the_thank_you_page() {
        assert driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")).isDisplayed();



    }

}




