package com.pages;
import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;

public class SauceDemoLogin {
	private WebDriver driver;

// 1. By Locators: OR

    private By Username = By.xpath("//input[@id='user-name']");

     private By Password = By.xpath("//input[@id='password']");

    private By LoginButton = By.xpath("//input[@id='login-button']");

    private By ProductsPage = By.xpath("//span[contains(text(),'Products')]");

    private By addTocart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    private By checkoutbutton = By.xpath("//button[@id='checkout']");

    private By fname = By.xpath("//input[@id='firstname']");

    private By lname = By.xpath("//input[@id='last-name']");

    private By Pcode = By.xpath("//input[@id='postal-code']");

    private By Continue= By.xpath("//input[@id='continue']");

    private By Finish = By.xpath("//input[@id='finish']");

	
    public SauceDemoLogin(WebDriver driver) {

         this.driver = driver;

        }

    public String getSaucedemoLoginLoginTitle() {

        return driver.getTitle();

       }

   public void enterUserName(String username) throws InterruptedException {

	Thread.sleep(4000);

   driver.findElement(Username).sendKeys(username);

        }

   public void enterPassword(String password) throws InterruptedException {

   Thread.sleep(4000);

   driver.findElement(Password).sendKeys(password);

   }

   public void clickOnLogin() {

   driver.findElement(LoginButton).click();

    }

   public void clickOnProducts() {

   driver.findElement(ProductsPage).click();

    }

   public void clickOnaddTocart() {

   driver.findElement(addTocart).click();

   }

    public void clickOncheckoutButton() {

    driver.findElement(checkoutbutton).click();

  }

    public void enterfirstname(String firstname) throws InterruptedException {

  Thread.sleep(4000);


driver.findElement(fname).sendKeys(firstname);

}


    public void enterlname(String lastname) throws InterruptedException {

  Thread.sleep(4000);

  driver.findElement(lname).sendKeys(lastname);

	}

    public void enterPcode(String postalcode ) throws InterruptedException {

   Thread.sleep(4000);

   driver.findElement(Pcode).sendKeys(postalcode);
}

   public void clickOnContinue() {

   driver.findElement(Continue).click();

  }

   public void clickOnFinish() {

  driver.findElement(Finish).click();

  }

  public SauceDemoLogin() {

	driver.get("https://www.saucedemo.com/");

    driver.findElement(Username).sendKeys("standard-user");

    driver.findElement(Password).sendKeys("secret_sauce");

    driver.findElement(LoginButton).click();

    driver.findElement(ProductsPage).click();



    	driver.findElement(checkoutbutton).click();



    	driver.findElement(fname).sendKeys("Afzal");



    	driver.findElement(lname).sendKeys("Khan");



		driver.findElement(Pcode).sendKeys("2473473");



		driver.findElement(Continue).click();



		driver.findElement(Finish).click();



    }

}





