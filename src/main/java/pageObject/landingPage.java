package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

    public WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
    }


    // locate the web Element
    private By ClickHome = By.cssSelector("li[routerlinkactive='active'] button");
    //private By ClickHome = By.cssSelector("li[class='active']");
    private By ClickReturn = By.cssSelector("app-search li:nth-child(1) label:nth-child(1)");
    private By ClickDepart = By.cssSelector("#dept_city0");
   // private By ClickManch = By.xpath("//span[normalize-space()='Murtala Muhammed International Airport'] ");
    private By ClickArrive = By.cssSelector("#arr_city0");

    private By Clickdate = By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='dept_date']");
    private By SelDDate = By.xpath("//div[@aria-label='Tuesday, May 9, 2023']");
    private By Return = By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='arr_date']");
    private By SelectDReturn = By.xpath("//div[@aria-label='Tuesday, May 30, 2023']");
    // private By TravelsType = By.xpath("//span[normalize-space()='Traveller(s)']");
    // private By ClickTravel =By.cssSelector("a[type='button']");
    // private By ClickAdult = By.xpath("//li[@class='selected ng-star-inserted'][normalize-space()='1']");
    // private By ClickEconomy =By.xpath("//li[@class='selected']");
    // private By ClickApply =By.xpath("//button[@class='mat-focus-indicator btn btnApply mat-button mat-button-base mat-primary ng-star-inserted']");
    private By FSearch = By.cssSelector("button[type='submit'] span[class='mat-button-wrapper'] span");
    // private By ClickLondon = By.cssSelector("mat-option[id='mat-option-17'] div[class='col-2']");


    //Carry out the action on the locators
    public void HomeClick() {
        driver.findElement(ClickHome).click();
    }
    public void ReturnClick() {
        driver.findElement(ClickReturn).click();
    }


    //moveCursorToElement
    public void enterdepart() throws InterruptedException{

        WebElement DepartClick = driver.findElement(By.cssSelector("#dept_city0"));
        DepartClick.click();
        DepartClick.sendKeys( "Lagos");
       //DepartClick.findElement(By.cssSelector("mat-option[id='mat-option-1'] div[class='col-10']"));
        DepartClick.sendKeys(Keys.ARROW_DOWN);
        DepartClick.sendKeys(Keys.ARROW_DOWN);
        DepartClick.sendKeys(Keys.ARROW_DOWN);
        DepartClick.sendKeys(Keys.ENTER);

    }

    public void Clickarrive() {
        WebElement Lclick = driver.findElement(By.cssSelector("#arr_city0"));
        Lclick.click();
        Lclick.sendKeys( "Cape Town");
        Lclick.sendKeys(Keys.ARROW_DOWN);
        //Lclick.sendKeys(Keys.ARROW_DOWN);
        Lclick.sendKeys(Keys.ENTER);
    }
       // Click the date
    public void DateClick() {driver.findElement(Clickdate).click();}
    // Select the date
    public void SelectD() {driver.findElement(SelDDate).click();}
    //Click on the date to start the trip
    public void RReturn() {driver.findElement(Return).click();}
     // Click on the date  to return
    public void SReturn() {driver.findElement(SelectDReturn).click();}
     //Click on the search button to search flight
    public bookingPage FindSearch() {
        driver.findElement(FSearch).click();
        return new bookingPage(driver);
    }
    }

