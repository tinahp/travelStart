package TestSuite;
import baseClass.baseClassTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.TestLanding;

import java.util.concurrent.TimeUnit;


public class TestingTest extends baseClassTest {

    @BeforeClass
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

/*
    @Test
    public void testSearchFlights() throws InterruptedException {
        // Enter search criteria and click search button
        TestLanding.setBooking();
        TestLanding.setReturn();
        TestLanding.setFrom("Manchester (MAN)");
        Thread.sleep(500);
        TestLanding.setTo("Los Angeles, CA (LAX)");
        Thread.sleep(500);
        TestLanding.setDepartureDate("2023-04-22");
        TestLanding.setReturnDate("2023-05-01");
        Thread.sleep(2000);
        TestLanding.SetAdultsSelect();
        TestLanding.setChildren(1);
        TestLanding.setInfants(0);
        TestLanding.clickSearchButton();

        // Verify that search results are displayed
        //Assert.assertTrue(driver.getCurrentUrl().contains("https://www.travelstart.com/flight/search"));
    }
}




*/
