package TestSuite;

import baseClass.baseClassTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.bookingPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class landingTest extends baseClassTest {

    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
    }

    //Testcase
    @Test(priority = 1)
    public void Bookflight() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        landingPage.HomeClick();
        landingPage.ReturnClick();
        landingPage.enterdepart();
        Thread.sleep(3000);
        landingPage.Clickarrive();
        Thread.sleep(3000);
        landingPage.DateClick();
        landingPage.SelectD();
        landingPage.RReturn();
        landingPage.SReturn();
        Thread.sleep(500);
        landingPage.FindSearch();

        // Verify that search results are displayed
        String expectedTitle = "https://www.travelstart.com/flights/results";
        String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("https://www.travelstart.com/flights/results");
        // Assert.assertEquals("flights/results", "flights/results","flight search successful");

    }

    // Testcase 1
    @Test(priority = 2)
    public void BookFlight1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//       Verify if users can click on the cheapest button
//       bookingpage.CCheapest();
        // Verify if the flight details can be clicked and viewed
        bookingpage.getFlightdetails();
        Thread.sleep(2000);
        //close flight modal
        bookingpage.xCloseDetails();
        //Verify if the user can click on the book button now
        bookingpage.Cbookbtn();
        //click on the continue button to proceed
        // bookingpage.clickcontinue();
        //Verify if the user can see the trip details
        bookingpage.Tripdetails();
        Thread.sleep(5000);
        // Scroll to the Contact element
        WebElement Scroll = driver.findElement(By.cssSelector("div[title='United Kingdom: +44']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        Scroll.click();
//      Assert the booking confirmation
        assertTrue(driver.findElement(By.xpath("//label[contains(text(),'We will send your booking confirmation to these contact details')]")).isDisplayed());
        bookingpage.SCountryCode();
        bookingpage.Email();
    }

    @Test(priority = 3)
    //Testcases 3
    public void Cprofile() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        profilePage.cTitle();
        profilePage.CFName();
        profilePage.Cmiddle();
        profilePage.Clast();
        profilePage.DOB();
        Thread.sleep(50);
//      profilePage.cAutomated();
        profilePage.cMedRefund();
        profilePage.Ccontinue();

    }

    @Test(priority = 4)
    public void Paymentpage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        paymentPage.getCardNum();
        paymentPage.getCardHolder();
        paymentPage.getMonth();
        paymentPage.getCVV();
        paymentPage.getAddress1();
        paymentPage.getAddress2();
        paymentPage.Mpostcode();
        paymentPage.Ccity();
        paymentPage.CCunty();
        Thread.sleep(500);
        paymentPage.MCountryCode();
        paymentPage.Cpay();
        paymentPage.getErrorMessage();


    }
}