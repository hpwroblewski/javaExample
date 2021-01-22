import framework.config.Base;
import framework.page.ListPage;
import framework.page.SearchPage;
import org.testng.annotations.Test;

import java.io.IOException;

//11.DODANIE EXTENDS BASE DZIEDZICZENIA METODY INITIALIZEDRIVER ŻEBY MOŻNA BYŁO UŻYĆ METODY I ZWRÓCIĆ DRIVERA
public class OtodomTest extends Base {

    //    12.DODANIE ADNOTACJI TEST Z TESTNG ORAZ NAZWY TESTU
    @Test
    public void basePageNavigation() throws IOException, InterruptedException {

//        13.INICJALIZACJA DRIVERA PRZEGLĄDARKI I ODPALENIE PRZEGLĄDARKI
        driver = initializeDriver();
        driver.get("https://www.otodom.pl/");
        driver.manage().window().maximize();

//        19.PAGE OBJECT PATTERN PRZENOSI DRIVERA PRZEGLĄDARKI
        SearchPage searchPage = new SearchPage(driver);
        searchPage.getLogin().click();
        searchPage.getLogin().sendKeys("Siedlce, mazowieckie");
        searchPage.getLoginCheckbox().click();
        searchPage.getSearchButton().click();

        ListPage listPage = new ListPage(driver);
        String text = listPage.getAmountOfRecord().getText();
        System.out.println(text);

//        20.ZAMKNIĘCIE PRZEGLĄDARKI
        driver.close();
    }
}
