package framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//14.DODANIE PAGE OBJECT PATERN W KTÓRYM KAŻDA STRONA MA DODANE WSZYSTKIE ELEMENTY STRONY DO AUTOMATYZACJI
public class ListPage {

    //    15.DODANIE DRIVERA
    public WebDriver driver;

    //    16.DODANIE SELEKTORÓW
    By amountOfRecordSelector = By.cssSelector("#body-container > div > div > div.row.section-listing__row > div > div.before-offers.clearfix.hidden-xs > div.offers-index.pull-left.text-nowrap > strong");

    //    17.DODANIE KONSTRUKTORA KTÓRY PRZENOSI DRIVERA PRZEGLĄDARKI
    public ListPage(WebDriver driver) {
        this.driver = driver;
    }

    //    18.DODANIE METOD DLA PAGE OBJECT PATERN KTÓRE POBIERAJĄ SELEKTORY
    public WebElement getAmountOfRecord() {
        return driver.findElement(amountOfRecordSelector);
    }
}
