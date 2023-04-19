package Tests;

import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * тесты вопросов с ответами
 */
public class TestQuestions extends BaseTest{
/**
    @Test
    //@DisplayName("Проверка ответа 1")
    public void testQuestion1 () {
        MainPage mainPage = new MainPage(BASE_URL);
        Boolean result = mainPage.setQuestions("Вопрос-1:");
        Assert.assertTrue(result, "Ответ совпадает с ожидаемым результатом!");
        delay(1000);
    }

    @Test
    //@DisplayName("Проверка ответа 2")
    public void testQuestion2 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-2:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
    //@DisplayName("Проверка ответа 3")
    public void testQuestion3 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-3:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
   // @DisplayName("Проверка ответа 4")
    public void testQuestion4 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-4:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
    //@DisplayName("Проверка ответа 5")
    public void testQuestion5 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-5:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
    //@DisplayName("Проверка ответа 6")
    public void testQuestion6 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-6:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
    //@DisplayName("Проверка ответа 7")
    public void testQuestion7 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-7:"), "Ответ совпадает с ожидаемым результатом!");
    }
    @Test
    //@DisplayName("Проверка ответа 8")
    public void testQuestion8 (){
        Assert.assertTrue(new MainPage(BASE_URL).setQuestions("Вопрос-8:"), "Ответ совпадает с ожидаемым результатом!");
    }
 */
}
