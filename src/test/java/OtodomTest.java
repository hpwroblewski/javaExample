import framework.config.Base;
import framework.page.ListPage;
import framework.page.SearchPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

//11.DODANIE EXTENDS BASE DZIEDZICZENIA METODY INITIALIZEDRIVER ŻEBY MOŻNA BYŁO UŻYĆ METODY I ZWRÓCIĆ DRIVERA
public class OtodomTest extends Base {

    //    12.DODANIE ADNOTACJI TEST Z TESTNG ORAZ NAZWY TESTU
//    23.PODPIĘCIE DANYCH Z DATA PROVIDERA DO WYWOŁANIA WIELOKROTNIE TESTU
    @Test(dataProvider = "getData")
    public void basePageNavigation(String destination) throws IOException, InterruptedException {

//        13.INICJALIZACJA DRIVERA PRZEGLĄDARKI I ODPALENIE PRZEGLĄDARKI
        driver = initializeDriver();
        driver.get("https://www.otodom.pl/");
        driver.manage().window().maximize();

//        19.PAGE OBJECT PATTERN PRZENOSI DRIVERA PRZEGLĄDARKI
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.getSearchInput().isDisplayed());
        searchPage.getSearchInput().click();
        searchPage.getSearchInput().sendKeys(destination);
        searchPage.getSearchInputCheckbox().click();
        searchPage.getSearchButton().click();

        ListPage listPage = new ListPage(driver);
        Assert.assertTrue(listPage.getSearchInput().isDisplayed());
        Assert.assertEquals(listPage.getSearchInput().getText(), destination);
        String text = listPage.getAmountOfRecord().getText();
        System.out.println(text);

//        20.ZAMKNIĘCIE PRZEGLĄDARKI
        driver.close();
    }

    //        21.DODANIE DATA PROVIDER ODPOWIEDZIALNEGO ZA ODPALANIE TESTÓW Z RÓŻNYMI PARAMETRAMI
    @DataProvider
    public Object[][] getData() {

//        22.PIERWSZY WIERSZ ODPOWIADA ZA ILOŚĆ POWTARZANYCH TESTÓW [2][] - 0,1 CZYLI 2 TESTY A DRUGI WIERSZ ODPOWIADA ZA ILOŚĆ DANYCH WPROWADZANYCH W TEŚCIE [][1] - 0 CZYLI 1 ZMIENNA
        Object[][] data = new Object[2][1];
        data[0][0] = "Siedlce, mazowieckie";
        data[1][0] = "Łosice, łosicki, mazowieckie";

        return data;
    }
}
