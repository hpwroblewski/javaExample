import framework.Base;
import framework.pageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

//9.DODANIE EXTENDS BASE DZIEDZICZENIA METODY INITIALIZEDRIVER ŻEBY MOŻNA BYŁO UŻYĆ METODY I ZWRÓCIĆ DRIVERA
public class OtodomTest extends Base {

    //    10.DODANIE ADNOTACJI TEST Z TESTNG
    @Test
    public void basePageNavigation() throws IOException, InterruptedException {
//    11. INICJALIZACJA DRIVERA PRZEGLĄDARKI I ODPALENIE TESTU
        driver = initializeDriver();
        driver.get("https://www.otodom.pl/");
        driver.manage().window().maximize();
//    14.PAGE OBJECT PATTERN PRZENOSI DRIVERA PRZEGLĄDARKI
        HomePage homePage = new HomePage(driver);
        homePage.getLogin();

//        driver.findElement(By.id("downshift-0-label")).click();
//        driver.findElement(By.id("downshift-0-label")).sendKeys("Siedlce, mazowieckie");
//        Thread.sleep(2000);
//        driver.findElement(By.className("css-19u3g69")).click();
    }
}
