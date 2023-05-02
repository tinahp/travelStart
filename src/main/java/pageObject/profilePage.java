package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class profilePage {

    WebDriver driver;

    public profilePage(WebDriver driver) {
        this.driver = driver;
    }


    //  locate webelement on the page
    private By title = By.cssSelector("body > app-root:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-booking-view:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > app-traveller-info:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > label:nth-child(1) > input:nth-child(1)");
    private By firstName = By.cssSelector("#firstName0");
    private By middleName = By.cssSelector("#middleName0");
    private By lastName = By.cssSelector("#lastName0");
    //   click on the day of the Birth drop down
    private By DayDate = By.cssSelector("select[placeholder='day']");
    private By monthDate = By.cssSelector("select[placeholder='month']");
    private By yearDate = By.cssSelector("select[placeholder='year']");
    //    click on optional Automated Addon
    private By AutomatdAddon = By.xpath("//label[@for='mat-checkbox-15-input']//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']");
    //    click on Medical Cancellation
    private By medRefund = By.cssSelector("label[for='mat-checkbox-19-input'] div[class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']");
    private By ctNbutton = By.cssSelector("button[class='btn onHover']");


    //  Carry out an Action on the webpages
    public void cTitle() {
        driver.findElement(title).click();
    }

    public void CFName() {
        driver.findElement(firstName).sendKeys("Lanre");
    }

    public void Cmiddle() {
        driver.findElement(middleName).sendKeys("Yusuf");
    }

    public void Clast() {
        driver.findElement(lastName).sendKeys("judith");
    }

    //    click on the Date of Birth
    public void DOB() {
//        driver.findElement(DayDate).click();
        //Click on the dropdown button for the day
        WebElement drpdown1 = driver.findElement(By.name("selectedDay"));
        Select drpdate = new Select( drpdown1);
        drpdate.selectByValue("3");

        //Click on the dropdown button for the month
        WebElement drpdown2 = driver.findElement(By.name("selectedMonth"));
        Select drpmonth = new Select(drpdown2);
        drpmonth.selectByVisibleText("May");

        //Click on the dropdown button for the year
        WebElement drpdown3 = driver.findElement(By.cssSelector("select[placeholder='year']"));
        Select drpyear = new Select(drpdown3);
        drpyear.selectByIndex(15);



//        Select objSelect = new Select(driver.findElement(DayDate));
//        objSelect.selectByIndex(3);
//        objSelect.selectByIndex(3);
//
//        objSelect.selectByVisibleText("May");
//        driver.findElement(yearDate);
//        objSelect.selectByIndex(8);
    }

//    public void cAutomated() {driver.findElement(AutomatdAddon).click();}

    public void cMedRefund() {driver.findElement(medRefund).click();}

    //returnPagee
    public paymentPage Ccontinue() {
        driver.findElement(ctNbutton).click();
        return new paymentPage(driver);
    }
}














    


