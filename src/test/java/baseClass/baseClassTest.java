package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import pageObject.TestLanding;
import pageObject.landingPage;

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
        protected TestLanding TestLanding;

        @BeforeTest
        public void SetUp() {
            // reports = ExtentManager.getReports();
            // test = reports.createTest("BaseClassTest");
            //Set Chrome Browser
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            this.driver = new ChromeDriver();

            // maximize window
            driver.manage().window().maximize();
            //Open the page URL
            driver.get("https://www.travelstart.com/");
            // test.log(Status.INFO, "Starting test case Home_button");


            //Instantiate HomePage after launching the browser
             landingPage = new landingPage(driver);
             TestLanding = new TestLanding(driver);
        }
    }




