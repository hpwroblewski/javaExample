package framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//4.DODANIE KLASY BASE JAKO BAZOWEJ KONFIGURACJI
public class Base {

    //    5.DODANIE DRIVERA
    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {

//        6.USTAWIENIE ODCZYTU NAZWY PRZEGLĄDARKI Z PLIKU DATA.PROPERTIES
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/data.properties");
        prop.load(fis);

//        8.DODANIE LOGIKI WYBORU PRZEGLĄDARKI Z ODPOWIEDNIM DRIVEREM
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/java/framework/lib/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/java/framework/lib/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "src/main/java/framework/lib/driver/iedriverserver.exe");
            driver = new InternetExplorerDriver();
        }

//        9.OCZEKIWANIE NA ZAŁADOWANIE ELEMENTU 10 SEKUND
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        10.ZWRÓCENIE DRIVERA DO INNYCH CLASS
        return driver;
    }
}
