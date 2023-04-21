package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class landingPage {

    public WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
    }




    //locate the Web element
   /* private By ClickHome = By.cssSelector("li[routerlinkactive='active'] button");
    // private By ClickHome = By.cssSelector("li[class='active']");
    private By ClickReturn = By.cssSelector("app-search li:nth-child(1) label:nth-child(1)");
    private By TravelsType = By.xpath("//span[normalize-space()='Traveller(s)']");
    private By ClickTravel = By.cssSelector("a[type='button']");
    private By ClickAdult = By.xpath("//li[@class='selected ng-star-inserted'][normalize-space()='1']");
    private By ClickEconomy = By.xpath("//li[@class='selected']");
    private By ClickApply = By.xpath("//button[@class='mat-focus-indicator btn btnApply mat-button mat-button-base mat-primary ng-star-inserted']");
    private By ClickDepart = By.cssSelector("#dept_city0");
    // private By ClickLondon = By.cssSelector("mat-option[id='mat-option-17'] div[class='col-2']");
    private By ClickArrive = By.cssSelector("#arr_city0");
    private By ClickMutaah = By.xpath("//span[normalize-space()='Murtala Muhammed International Airport'] ");
    private By Clickdate = By.xpath("//*[@id=\"dept_date0\"]");
    private By SelDDate = By.cssSelector("div[aria-label='Friday, April 14, 2023'] span[class='custom-day ng-star-inserted']");
    private By Return = By.xpath("//input[@id='arr_date0']");
    private By SelectDReturn = By.xpath("//div[@aria-label='Wednesday, April 19, 2023']//span[@class='custom-day ng-star-inserted']");
    private By FSearch = By.cssSelector("button[type='submit'] span[class='mat-button-wrapper'] span");
*/
    //Second location of web Element

    private By ClickHome = By.cssSelector("li[routerlinkactive='active'] button");
    //private By ClickHome = By.cssSelector("li[class='active']");
    private By ClickReturn = By.cssSelector("app-search li:nth-child(1) label:nth-child(1)");
    private By ClickDepart = By.cssSelector("#mat-option   -725 > span > div > div.col-10");
    private By ClickManch = By.xpath("//span[normalize-space()='Murtala Muhammed International Airport'] ");
    private By ClickArrive = By.cssSelector("#arr_city0");

    private By Clickdate =By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='dept_date']");
    private By SelDDate = By.cssSelector(".custom-day.range.ng-star-inserted.focused");
    private By Return = By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='arr_date']");
    private By SelectDReturn = By.xpath("//div[@aria-label='Monday, May 1, 2023']//span[contains(text(),'1')]");
   // private By TravelsType = By.xpath("//span[normalize-space()='Traveller(s)']");
   // private By ClickTravel =By.cssSelector("a[type='button']");
   // private By ClickAdult = By.xpath("//li[@class='selected ng-star-inserted'][normalize-space()='1']");
   // private By ClickEconomy =By.xpath("//li[@class='selected']");
   // private By ClickApply =By.xpath("//button[@class='mat-focus-indicator btn btnApply mat-button mat-button-base mat-primary ng-star-inserted']");
    private By FSearch = By.cssSelector("button[type='submit'] span[class='mat-button-wrapper'] span");
    // private By ClickLondon = By.cssSelector("mat-option[id='mat-option-17'] div[class='col-2']");


    //Carry out the action on the locators
    public void HomeClick() {driver.findElement(ClickHome).click();}
    public void ReturnClick() {driver.findElement(ClickReturn).click();}
    // WebElement DepartClick = driver.findElement(By.cssSelector(""));
    //List<WebElement>dynamicDD = driver.findElements(By.cssSelector("#dept_city0"));
    //for(int i=0;)i<dynamicDD.

    //moveCursorToElement
    public void enterdepart() {

       // Find elements using tag name
        List<WebElement> allInputElements = driver.findElements(By.cssSelector("#dept_city0"));

        if(allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + " Elements found by CSS as id  \n");

            for(WebElement inputElement : allInputElements)
            {
                System.out.println(inputElement.getAttribute("id"));
            }
        }
    }


        // WebElement DepartClick = driver.findElement(By.cssSelector("#dept_city0"));
        // DepartClick.click();
        // DepartClick.sendKeys("Lyon (LYS) ");
        // DepartClick.sendKeys(Keys.ARROW_DOWN);}

    /* List<WebElement> findElements(By by){
            List<WebElement> elemets = driver.findElements(by);

            List<WebElement> loggedElements = new ArrayList<WebElement>();

            for (WebElement element : elemets) {
                loggedElements.add((WebElement) driver.findElements(By.cssSelector("#mat-option-725 > span > div > div.col-10")));
            }

            return loggedElements;
        }




       List<WebElement> dynamicList = driver.findElements(By.cssSelector("#mat-option-725 > span > div > div.col-10"));
        {
               //Object cities = null;
               //this.dynamicList = (List<WebElement>) cities;

                for (int i = 0; i < dynamicList.size(); i++)
                {
                    String text = dynamicList.get(i).getText();
                    System.out.println("Text is" + text);
                    if (text.contains("Lyon,")) {
                        dynamicList.get(i).click();
                        break;
                    }
*/

      //driver.findElement(By.cssSelector("#dept_city0")).sendKeys();}

        public void Clickarrive ()throws InterruptedException {
            WebElement Lclick = driver.findElement(By.cssSelector("#arr_city0"));
            Lclick.sendKeys("Murtala Muhammed International Airport");
            Lclick.sendKeys(Keys.ARROW_DOWN);
            Lclick.sendKeys(Keys.ENTER);
        }


        public void DateClick () {
            driver.findElement(Clickdate).click();
        }
        public void SelectD () {
            driver.findElement(SelDDate).click();
        }
        public void RReturn () {
            driver.findElement(Return).click();
        }
        public void SReturn () {
            driver.findElement(SelectDReturn).click();
        }

    /*public void Ttypes() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement travelType = driver.findElement(By.xpath("//span[normalize-space()='Traveller(s)']"));
        actions.moveToElement(TravelsType).build().perform();

    public void Ctravel(){driver.findElement(ClickTravel).click();}
    public void TraavelClick() {driver.findElement(ClickAdult).click();}
    public void Traavel2(){driver.findElement(ClickEconomy).click();}
    public void Apply(){driver.findElement(ClickApply).click();}*/

        public void FindSearch () {
            driver.findElement(FSearch).click();
        }


        //moveCursorToElement
        // public void enterdepart()  {
        //  Actions actions = new Actions(driver);
        //  WebElement DepartClick = driver.findElement(By.cssSelector("#dept_city0"));
        //  actions.moveToElement((WebElement) ClickDepart).build().perform();
        //  DepartClick.sendKeys("Manchester, Manchester MAN");}

        //public void () throws InterruptedException{
        // WebElement DepartClick = driver.findElement(By.cssSelector("#dept_city0"));
        // DepartClick.sendKeys("London (LON)");
        // DepartClick.sendKeys("Manchester, Manchester MAN");
        // DepartClick.sendKeys(Keys.ARROW_DOWN);}
        //driver.findElement(By.cssSelector("#dept_city0")).sendKeys();}

        // public void ClickLondon() {driver.findElement(ClickLondon).click();}
        // public void ArriveClick(){driver.findElement(ClickArrive).click();}

        // public void ClickL()throws InterruptedException{
        // WebElement Lclick = driver.findElement(By.cssSelector("#arr_city0"));
        // Lclick.sendKeys("Murtala Muhammed International Airport");
        // Lclick.sendKeys(Keys.ARROW_DOWN);}

        //public void AriveClick() {driver.findElement(ClickArrive).click();}
        //public void departure() {driver.findElement(ClickMutaah).click();}
        //public void DateClick(){driver.findElement(Clickdate).click();}
        //public void SelectD() {driver.findElement(SelDDate).click();}
        // public void RReturn() {driver.findElement(Return).click();}
        //public void SReturn(){driver.findElement(SelectDReturn).click();}


        // public void AAdult(){driver.findElement(Adult).click();}
        //public void EEco(){driver.findElement(Eco).click();}
        // public void Aapply(){driver.findElement(Apply).click();}


    }

