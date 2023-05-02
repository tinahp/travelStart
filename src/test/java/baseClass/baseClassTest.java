package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import pageObject.*;

public class baseClassTest {

        public static WebDriver driver;
        public WebDriver startdriver(String browser) {
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                driver = new ChromeDriver();
            } else
                return driver;
            return null;
        }

        //ExtentTest test;
        //ExtentReports reports;
        //extentManager ExtentManager = new extentManager();
        // Create a Landingpage
        protected landingPage landingPage;
        protected bookingPage bookingpage;
        protected profilePage profilePage;
        protected paymentPage paymentPage;

        @BeforeTest
        public void SetUp() {
            // reports = ExtentManager.getReports();
            // test = reports.createTest("BaseClassTest");
           // ChromeOptions options = new ChromeOptions();
           // options.addArguments("---disable notifications");
            //Set Chrome Browser
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            this.driver = new ChromeDriver();

            // maximize window
            driver.manage().window().maximize();
            //Open the page URL
            driver.get("https://www.travelstart.com/");



            //Instantiate the page after launching the browser
             landingPage = new landingPage(driver);
             bookingpage = new bookingPage(driver);
             profilePage = new profilePage(driver);
             paymentPage = new paymentPage(driver);
        }
    }




