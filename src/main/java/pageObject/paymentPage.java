package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class paymentPage {
    WebDriver driver;

    public paymentPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate element on webpage
    private By cardNuM = By.cssSelector("input[placeholder='Enter Your Card Number']");
    private By cardHolder=By.xpath("//input[@placeholder='Enter Your Name On Card']");
    private By Month =By.cssSelector("select[placeholder='month']");
    private By Year = By.xpath("//select[@placeholder='year']");
    private By CVV =By.xpath("//input[@placeholder='cvv']");
    private By address1 =By.cssSelector("input[placeholder='Address line 1']");
    private By address2 =By.xpath("//input[@placeholder='Address line 2']");
    private By postCode= By.cssSelector("input[placeholder='Postal code']");
    private By city= By.cssSelector("input[placeholder='City']");
    private By Cuntry =By.xpath("//input[@placeholder='Country']");
    private By CuntyList =By.cssSelector("mat-option:nth-child(1) span:nth-child(1) div:nth-child(1)");
    private By countryCode =By.cssSelector("div[title='United Kingdom: +44']");
    private By Inputphone =By.xpath("//input[@placeholder='7400 123456']");
//    private By chekbox = By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']");
    private By PayNow =By.cssSelector("button[class='btn book_btn pull-right onHover']");
    private By errorMssg = By.xpath("//button[@class='btn ok-btn ng-star-inserted']");



//Action on the Webpages
     public void getCardNum(){driver.findElement(cardNuM).sendKeys("1234567892345678");}
     public void getCardHolder(){driver.findElement(cardHolder).sendKeys("Lanre");}
     public void getMonth() {
         Select cMonth = new Select(driver.findElement(Month));
         cMonth.selectByIndex(10);
         Select cyear = new Select(driver.findElement(Year));
         cyear.selectByIndex(11);
     }
     public void getCVV(){driver.findElement(CVV).sendKeys("506");}

     public void getAddress1(){driver.findElement(address1).sendKeys("Ajoke Salako");}
     public void getAddress2(){driver.findElement(address2).sendKeys("Salako Gbagada Lagos");}
     public void Mpostcode(){driver.findElement(postCode).sendKeys("M12 189");}
     public void Ccity (){driver.findElement(city).sendKeys("Manchester");}
     public void CCunty() {
        WebElement Country = driver.findElement(By.xpath("//input[@placeholder='Country']"));
        Country.click();
        Country.sendKeys("United Kingdom");
        Country.sendKeys(Keys.ARROW_DOWN);
        Country.sendKeys(Keys.ENTER);

//         driver.findElement(CuntyList).click();
     }

     public void MCountryCode() {
//         driver.findElement(countryCode).click();
         driver.findElement(Inputphone).sendKeys("7089675432");
     }
     public void Cpay(){driver.findElement(PayNow).click();}

    //locate error message
    public void getErrorMessage() {switch (driver.findElement(errorMssg).getText().split("")[0]) { }
    }

//    return page
    public landingPage landingPage() {return new landingPage(driver);
    }
}