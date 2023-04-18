package Tests;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public final static String BASE_URL = "https://qa-scooter.praktikum-services.ru/";

    public void setUp() {

        WebDriverManager.firefoxdriver().driverVersion("0.32.1").setup(); // Установили настройки драйвера
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = true;
        Configuration.fastSetValue=true;

     /*   Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://qa-scooter.praktikum-services.ru/";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
*/

    }

    @BeforeTest
    public void init() { setUp();  }

    @AfterTest
    public void tearDown (){
        Selenide.closeWebDriver();
    }

    public void delay(Integer timeToDelay){
        try {
            Thread.sleep(timeToDelay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
