package framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//14.DODANIE PAGE OBJECT PATERN W KTÓRYM KAŻDA STRONA MA DODANE WSZYSTKIE ELEMENTY STRONY DO AUTOMATYZACJI
public class SearchPage {

    //    15.DODANIE DRIVERA
    public WebDriver driver;

    //    16.DODANIE SELEKTORÓW
    By searchInputSelector = By.id("downshift-0-label");
    By searchInputCheckboxSelector = By.cssSelector("#downshift-0-menu > li:nth-child(1) > div > span");
    By searchButtonSelector = By.cssSelector("#WidgetSearchFieldContainer > form > div.css-hl1f5l > div.css-19u3g69 > button");

    //    17.DODANIE KONSTRUKTORA KTÓRY PRZENOSI DRIVERA PRZEGLĄDARKI
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    //    18.DODANIE METOD DLA PAGE OBJECT PATERN KTÓRE POBIERAJĄ SELEKTORY
    public WebElement getLogin() {
        return driver.findElement(searchInputSelector);
    }

    public WebElement getLoginCheckbox() {
        return driver.findElement(searchInputCheckboxSelector);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButtonSelector);
    }
}
