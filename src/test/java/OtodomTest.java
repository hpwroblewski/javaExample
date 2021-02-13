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
//        25.DODANIE ODCZYTU URL Z data.properties
        driver.get(prop.getProperty("urlOtodom"));
        driver.manage().window().maximize();

//        19.PAGE OBJECT PATTERN PRZENOSI DRIVERA PRZEGLĄDARKI
        SearchPage searchPage = new SearchPage(driver);

//        SPRAWDZENIE CZY SEARCHBOX JEST WYŚWIETLONY ZA POMOCĄ Assert.assertTrue ORAZ isDisplayed()
        Assert.assertTrue(searchPage.getSearchInput().isDisplayed());

//        ----------KOD TESTU----------
        searchPage.getSearchInput().click();
        searchPage.getSearchInput().sendKeys(destination);
        searchPage.getSearchInputCheckbox().click();
        searchPage.getSearchButton().click();
//        -----------------------------

//        19.PAGE OBJECT PATTERN PRZENOSI DRIVERA PRZEGLĄDARKI
        ListPage listPage = new ListPage(driver);

//        SPRAWDZENIE CZY SEARCHBOX JEST WYŚWIETLONY ZA POMOCĄ Assert.assertTrue ORAZ isDisplayed()
        Assert.assertTrue(listPage.getSearchInput().isDisplayed());

//        SPRAWDZENIE CZY WPISANA WARTOŚĆ DO SEARCHBOXA JEST TAKA SAMA
        Assert.assertEquals(listPage.getSearchInput().getText(), destination);

//        ----------KOD TESTU----------
        String text = listPage.getAmountOfRecord().getText();
        System.out.println(text);
//        -----------------------------

//        20.ZAMKNIĘCIE PRZEGLĄDARKI
        driver.close();
    }

    //        21.DODANIE DATA PROVIDER ODPOWIEDZIALNEGO ZA ODPALANIE TESTÓW Z RÓŻNYMI PARAMETRAMI
    @DataProvider
    public Object[][] getData() {

//        22.PIERWSZY WIERSZ ODPOWIADA ZA ILOŚĆ POWTARZANYCH TESTÓW [2][] - 0,1 CZYLI 2 TESTY A DRUGI WIERSZ ODPOWIADA ZA ILOŚĆ DANYCH WPROWADZANYCH W TEŚCIE [][1] - 0 CZYLI 1 ZMIENNA
//        ERROR - java.lang.ArrayIndexOutOfBoundException - GDY JEST ZA DUŻA WAROTŚĆ WPISANA W PIERWSZYM INDEXIE [ERROR][] KTÓRY WYCHODZI POZA ZAKRES TABLICY (UWAGA INDEX 1 ODPOWIADA TYLKO 0 A NIE 0,1)
//        ERROR - The data provider is trying to pass 2 parameters but the method OtodomTest#basePageNavigation takes 1 - GDY JEST ZA DUŻA WAROTŚĆ WPISANA W DRUGIM INDEXIE [][ERROR] I JEST ZA MAŁO PARAMETRÓW W METODZIE basePageNavigation(String destination) POD ZNACZNIKIEM @Test(dataProvider = "getData")
        Object[][] data = new Object[2][1];
        data[0][0] = "Siedlce, mazowieckie";
        data[1][0] = "Łosice, łosicki, mazowieckie";

        return data;
    }
}
