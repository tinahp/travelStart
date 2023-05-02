package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class bookingPage {

    public WebDriver driver;

    public bookingPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate element on webpage

    private By flightDetails = By.xpath("(//div[@class='mb-3'][normalize-space()='Flight Details'])[1]");
    private By closedetails = By.cssSelector("img[src='../../../assets/icons/close-new-icn.svg']");
    private By bookNow = By.cssSelector("body > app-root:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-flight-results:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)");
    //private By FlightNotifyer =By.xpath("//button[@class='btn ok-btn onHover refreshBtn']");
    private By Trip = By.cssSelector("div[class='route_info'] h4");
    // private By ContactD =By.xpath("//h4[normalize-space()='Contact details']");
    private By CountryCode = By.cssSelector("div[title='United Kingdom: +44']");
    private By Country = By.xpath("(//li[@id='iti-1__item-al'])[1]");
    private By Inputmobile = By.cssSelector("#mobileNumber");
    private By email = By.xpath("//input[@id='email']");
    private By clickbookbtn = By.cssSelector(".btn.btn-primary.onHover.active");


    //Actions on the  located webelement

    //    Get the summary breakdown details.
    public void getFlightdetails() {
        driver.findElement(flightDetails).click();
    }

    //    Get close the pop-Up modal
    public void xCloseDetails() {
        driver.findElement(closedetails).click();
    }

    //click on the 1st bookNow button
    public void Cbookbtn() {
        driver.findElement(bookNow).click();
    }

    //    Click continue  to proceed with booking
    // public void clickcontinue(){driver.findElement(FlightNotifyer).click();}
    //verify  the title DETAILS of the TRip
    public String Tripdetails() {
        String resultName = driver.findElement(Trip).getText();
        System.out.println(resultName);
        return null;
    }
//    public String contactDetails() {
//        String Name = driver.findElement(ContactD).getText();
//        System.out.println(Name);
//        return null;

    //Scroll and select  the country code
    public void SCountryCode() throws InterruptedException {
        //Select the country code
        List<WebElement> itemList = driver.findElements(By.cssSelector("div[title='United Kingdom: +44']"));
        for (WebElement item : itemList) {
            // Do something with each item
            item.click(); // Click the item
            item.getText(); // Get the text of the item
        }

        driver.findElement(Inputmobile).sendKeys("7089675432");
    }

    public profilePage Email() {
        driver.findElement(email).sendKeys("tinahp52+001@gmail.com");
        driver.findElement(clickbookbtn).click();
        return new profilePage(driver);
    }
}



