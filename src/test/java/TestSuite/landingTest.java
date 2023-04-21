package TestSuite;

import baseClass.baseClassTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class landingTest extends baseClassTest {

    @BeforeTest
    public void innit (){driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);}

    @Test(priority = 0 )
    public void Bookflight() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        landingPage.HomeClick();
        landingPage.ReturnClick();
        Thread.sleep(1000);
        landingPage.enterdepart();
        Thread.sleep(1000);
        landingPage.Clickarrive();
        landingPage.DateClick();
        landingPage.SelectD();
        landingPage.RReturn();
        landingPage.SReturn();
        Thread.sleep(2000);
        landingPage.FindSearch();
       /* Thread.sleep(1000);
        landingPage.TraavelClick();
        landingPage.Traavel2();
        Thread.sleep(1000);
        landingPage.Apply();
       */
        //landingPage.enterdepart();
       // landingPage.ClickLondon();
        //landingPage.Ttypes();
        //Thread.sleep(3000);
        //landingPage.Ctravel();
      //  landingPage.TraavelClick();
       // Thread.sleep(3000);
      //  landingPage.Traavel2();
        //Thread.sleep(2000);
        //landingPage.DateClick();
       // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //landingPage.SelectD();
       // landingPage.RReturn();
       // Thread.sleep(3000);
        //landingPage.SReturn();
       // Thread.sleep(3000);
       // landingPage.Apply();




    }

}
