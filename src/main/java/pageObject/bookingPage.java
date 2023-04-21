package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bookingPage {

    public WebDriver driver;

    public bookingPage(WebDriver driver) {
        this.driver = driver;
    }


    //locate element on webpage
    private By Bookno = By.cssSelector("body > app-root:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-flight-results:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > span:nth-child(2)");


}