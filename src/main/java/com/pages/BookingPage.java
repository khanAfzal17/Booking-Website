package com.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By Destination = By.xpath("(//input[@id=':rh:'])[1]");
    private By DestinationDropdown = By.xpath("//li[@id='autocomplete-result-2']//div[@role='button']");
    private By PopUp = By.xpath("//*[name()='path' and contains(@d,'m13.31 12 ')]");
    private By CheckinDate = By.xpath("//span[@aria-label='24 September 2024']");
    private By CheckOutDate = By.xpath("//span[@aria-label='2 October 2024']");
    private By PersonsdropDown = By.xpath("(//span[normalize-space()='2 adults · 0 children · 1 room'])[1]");
    private By Done = By.xpath("//button[@class='dba1b3bddf e99c25fd33 ea757ee64b a86bcdb87f d3785a8ddc ea220f5cdc ed852f1b1f c437808707']");
    private By Search = By.cssSelector("button[type='submit']");
    private By PostSearchPopUp = By.xpath("//button[@aria-label='Close map']");
//    private By SelectHotel =By.xpath("//body/div[@id='bodyconstraint']/div[@id='bodyconstraint-inner']/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]");
//    private By roomDropdown = By.xpath("//select[@id='hprt_nos_select_352130705_398325605_3_0_0']");
//    private By Reserve = By.xpath("//button[@id='b_tt_holder_1']");
//    
    
    //form fillup locators
//    private By firstNameInput = By.id("firstname");
//    private By lastNameInput = By.id("lastname");
//    private By emailInput = By.id("email");
//    private By countryInput = By.id("country");
//    private By phoneInput = By.id("phone");
//    private By reserveButton = By.xpath("//button[contains(text(),'Reserve')]");
//    private By checkboxPaperless = By.xpath("//input[@name='paperless']");
//    private By finalReserveButton = By.xpath("//button[contains(text(),'Next: Final details')]");
//    private By completeBookingButton = By.xpath("//button[contains(text(),'Complete booking')]");
//    
    // Constructor of the page class
    public BookingPage() {
        ChromeOptions co = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void Browser() {
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void HandlePopUp() throws InterruptedException {
        Thread.sleep(4000); // Wait for the initial pop-up to appear
        driver.findElement(PopUp).click();
    }

    public void Destination() throws InterruptedException {
        WebElement we = driver.findElement(Destination);
        we.sendKeys("Kolkata");
        Thread.sleep(3000);

        // Wait for the dropdown to appear and select the first option
        wait.until(ExpectedConditions.visibilityOfElementLocated(DestinationDropdown));
        driver.findElement(DestinationDropdown).click();
    }

    public void check_in_date() {
        WebElement checkinElement = driver.findElement(CheckinDate);
        wait.until(ExpectedConditions.elementToBeClickable(checkinElement));
        checkinElement.click();
    }

    public void Check_Out_Date() {
        WebElement checkoutElement = driver.findElement(CheckOutDate);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutElement));
        checkoutElement.click();
    }

    public void Persons_dropDown() throws InterruptedException {
        driver.findElement(PersonsdropDown).click();
        driver.findElement(By.xpath("(//*[name()='svg'])[16]")).click();
        driver.findElement(By.xpath("(//span[normalize-space()='Done'])[1]")).click();
        Thread.sleep(3000);
    }

    public void Done() throws InterruptedException {
        driver.findElement(Done).click();
        Thread.sleep(2000);
    }

    public void search() throws InterruptedException {
        driver.findElement(Search).click();
        Thread.sleep(4000); // Wait for search results to load
    }

 
    
    public void HandlePostSearchPopUp() {
        try {
            WebElement postSearchPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(PostSearchPopUp));
            if (postSearchPopUp.isDisplayed()) {
                postSearchPopUp.click();
            }
        } catch (Exception e) {
            // Handle case where pop-up does not appear
            System.out.println("No post-search pop-up found.");
        }
    }
   
//    public void SelectHotel() throws InterruptedException {
//    	driver.findElement(SelectHotel).click();
//    	Thread.sleep(3000);
//    }
//   
//    public void roomDropdown() throws InterruptedException {
//        driver.findElement(roomDropdown).click();
//        driver.findElement(By.xpath("//td[@class='hprt-table-cell hprt-table-room-select hprt-remove-top-border']//div[@class='hprt-block']")).click();
//        driver.findElement(By.xpath("//select[@id='hprt_nos_select_352130705_398325605_3_0_0']//option[@value='1'][contains(text(),'1')]")).click();
//        Thread.sleep(3000);
//    }
//    
//    public void Reserve() throws InterruptedException {
//    	driver.findElement(Reserve).click();
//    	Thread.sleep(3000);
//    }
   
 // Enter form fill up
    
    
//    public void enterUserDetails(String firstName, String lastName, String email, String country, String phoneNumber) {
//    driver.findElement(firstNameInput).sendKeys(firstName);
//    driver.findElement(lastNameInput).sendKeys(lastName);
//    driver.findElement(emailInput).sendKeys(email);
//    driver.findElement(countryInput).sendKeys(country);
//    driver.findElement(phoneInput).sendKeys(phoneNumber);
//
//    }
//    // Click the reserve button
//    public void clickReserveButton() {
//    driver.findElement(reserveButton).click();
//
//    }
//    // Click the check box for paperless
//    public void clickPaperlessCheckbox() {
//    driver.findElement(checkboxPaperless).click();
//
//    }
//    // finalreserve
//    public void clickFinalDetailsButton() {
//    driver.findElement(finalReserveButton).click();
//
//    }
//    // Click the "Complete Booking" button
//    public void clickCompleteBookingButton() {
//    driver.findElement(completeBookingButton).click();
//
//    }
    
    public void reselect() throws InterruptedException {
        Browser();
        HandlePopUp();
        Destination();
        check_in_date();
        Check_Out_Date();
        Persons_dropDown();
        Done();
        search();
        HandlePostSearchPopUp(); // Handle pop-up after search
//        SelectHotel();
//        roomDropdown();
//        Reserve();
    }
}
