package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestLanding {
    private WebDriver driver;

    public TestLanding(WebDriver driver) {this.driver = driver;}

    // Elements on Webpage
    private WebElement getFlightBook() {
        return driver.findElement(By.cssSelector("li[routerlinkactive='active'] button"));
    }

    private WebElement getReturn() {
        return driver.findElement(By.cssSelector("app-search li:nth-child(1) label:nth-child(1"));
    }

    private WebElement getFromInput() {
        return driver.findElement(By.cssSelector("input[role='combobox'][type='text'][formcontrolname='dept_city']"));
    }

    private WebElement getToInput() {
        return driver.findElement(By.xpath("//input[@formcontrolname='arr_city']"));
    }

    private WebElement getDepartureDateInput() {
         driver.findElement(By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='dept_date']"));
        return driver.findElement(By.cssSelector(".custom-day.range.ng-star-inserted.focused"));
    }

    private WebElement getReturnDateInput() {
         driver.findElement(By.cssSelector("input[name='dpFromDate'][outsidedays='hidden'][formcontrolname='arr_date']"));
         return driver.findElement(By.cssSelector("#return > form > div > div > div.col-lg-3.col-sm-12 > div > div.p-0.position-relative.depart_date.q-datepicker.w-100.col-lg-6.col-sm-6 > ngb-datepicker > div.ngb-dp-content.ngb-dp-months > div:nth-child(1) > ngb-datepicker-month > div:nth-child(5) > div:nth-child(3)"));
    }

   // private Select getAdultsSelect() {
    //    return new Select(driver.findElement(By.cssSelector("li[data-adult-id='1']")));
   // }

    private WebElement getAdultsSelect() {
        return driver.findElement(By.cssSelector("li[data-adult-id='2']"));
    }
   // private WebElement getChildrenSelect() {
     //   return driver.findElement(By.cssSelector("li[data-child-id='1']"));
   // }

    private Select getChildrenSelect() {
        return new Select(driver.findElement(By.cssSelector("li[data-child-id='1']")));
    }

    private Select getInfantsSelect() {
        return new Select(driver.findElement(By.cssSelector("li[data-infants-id='1']")));
    }

    private WebElement getSearchButton() {
        return driver.findElement(By.xpath("button[type='submit'] span[class='mat-button-wrapper'] span"));
    }

    // Actions on the Element

    public void setBooking() {
        getFlightBook().click();
    }
        public void setReturn() {
            getReturn().click();
        }
        public void setFrom(String from) {
        getFromInput().sendKeys(from);
    }

    public void setTo(String to) {
        getToInput().sendKeys(to);
    }

    public void setDepartureDate(String departureDate) {
        getDepartureDateInput().click();
        getDepartureDateInput().click();
    }

    public void setReturnDate(String returnDate) {
        getReturnDateInput().click();
        getReturnDateInput().click();
    }

    //list dropdown
    public void SetAdultsSelect() {

        driver.findElement(By.cssSelector("li[data-adult-id='2']")).click();

     String option = "Highest to lowest";

     WebElement dropdown = driver.findElement(By.cssSelector("li[data-adult-id='2'], '" + option + "')]"));

     dropdown.click();

     System.out.println("clicked");
    }

    // public void setAdults(int numAdults) {
    //    getAdultsSelect().selectByValue(String.valueOf(numAdults));
    //}

    public void setChildren(int numChildren) {
        getChildrenSelect().selectByValue(String.valueOf(numChildren));
    }

    public void setInfants(int numInfants) {
      getInfantsSelect().selectByValue(String.valueOf(numInfants));
    }

    public void clickSearchButton() {
        getSearchButton().click();
    }
}

