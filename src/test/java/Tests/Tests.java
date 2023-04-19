package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends BaseTest{

    @Test
   // @DisplayName("Наличие логотипа Самокат")
   // @EnabledOnOs({ OS.WINDOWS }) // тест запустится только на Windows
    public void checkMainPage(){
        Assert.assertTrue(new MainPage(BASE_URL).getHeader().contains("Самокат"));
    }

    /**
     * Проверка перехода по Самокат Logo на главную страницу
     */
    /**
    @Test
  //  @DisplayName("Проверка ссылки по лого Самокат")
    public void checkSamokatLogoHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.checkLogoHref();
        Assert.assertTrue(mainPage.header().isDisplayed(), "Не открылась стратовая страница");
    }
     */
    /**
     * Проверка блокировки перехода по Yandex logo на сайт Yandex Dzen.
     * Блокировщик - rel="noopener noreferrer"
     */
    /**
    @Test
  //  @DisplayName("Проверка блокировки открытия Yandex")
    public void checkYandexLogoHref() throws InterruptedException {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.yandexLogoClick();
        YandexMainPage yandexPage = new YandexMainPage();
        Boolean result = yandexPage.dzenLogoExist();
        Assert.assertFalse(result, "Yandex Dzen открылся");

        Assert.assertEquals("Не открылся Yandex Dzen", "Найти",new MainPage(BASE_URL).yandexLogoClick().getFindButton());
    }
     */
    /**
     * Проверка поиска НЕ ВЕРНОГО номера заказа
     */
    /**  @Test
    public void checkSearchWrongOrderError(){
        Assert.assertTrue(new MainPage(BASE_URL).statusErrorOrderClick().checkErrorOrder());
    }
     */
    /**
     * Проверка поиска ВЕРНОГО номера заказа
     */
    /**   @Test
    public void checkSearchOrder(){

        Assert.assertTrue(new MainPage(BASE_URL).statusOrderClick().checkPageExist());
    }

    /**
     * Проверка формирования заказа. Ошибка на сайте, кнопка подтверждения заказа не кликабельна в Chrome
     */
/**    @Test
    public void makeOrderCustomer1(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.makeOrderButtonClick();
        OrderPage pageOrder = new OrderPage();
        pageOrder.makeOrderCustomers("Покупатель 1");
        delay(3000);
       // pageOrder.makeOrder(NAME_BUYER,LAST_NAME_BUYER,ADRESS_BUYER,PHONE_BUYER);
        AboutOrderPage aboutOrderPage = new AboutOrderPage();
        aboutOrderPage.enterDataInOrder();
        ConfirmOrderPage confirmOrder = new ConfirmOrderPage();
        confirmOrder.confirm();
        SuccessOrderPage successOrderPage = new SuccessOrderPage();
        System.out.println(successOrderPage.getOrderHeader());
        //проверка на то, что окно подтверждения заказа, при нажатии на копку "Да" закрыто.
        Assert.assertTrue(successOrderPage.getOrderHeader().contains("Заказ оформлен"), "Заказ не сформирован, ошибка");

    }
 */

}
