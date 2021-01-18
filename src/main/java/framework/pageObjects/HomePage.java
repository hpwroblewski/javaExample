package framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//12.DODANIE PAGE OBJECT PATERN
public class HomePage {

    public WebDriver driver;
    By searchInputSelector = By.id("downshift-0-label");

    //13.DODANIE KONSTRUKTORA KTÓRY PRZENOSI DRIVERA PRZEGLĄDARKI
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(searchInputSelector);
    }
}
