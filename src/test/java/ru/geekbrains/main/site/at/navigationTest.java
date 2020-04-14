package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class navigationTest extends BaseTest {

    void HeaderCheck () {
        WebElement header = driver.findElement(By.cssSelector("header[id=\"top-menu\"]"));
        Assertions.assertTrue(header.isDisplayed());
    }

    void FooterCheck () {
        WebElement footer = driver.findElement(By.cssSelector("footer[class=\"site-footer\"]"));
        Assertions.assertTrue(footer.isDisplayed());
    }

    @Test
    void CoursesTest() {
        System.out.println("Курсы - Тест");
        driver.get("https://geekbrains.ru/career");
//        Курсы
        WebElement CoursesButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/courses\"]"));
        CoursesButton.click();

        driver.findElement(By.cssSelector("div button svg[class=\"svg-icon icon-popup-close-button \"]")).click();
        WebElement CoursesPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Курсы", CoursesPageTitle.getText());
        HeaderCheck();
        FooterCheck();
    }

    @Test
    void EventsTest() {
        System.out.println("Вебинары - тест");
        driver.get("https://geekbrains.ru/career");
//        Вебинары
        WebElement EventsButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/events\"]"));
        EventsButton.click();
        //sleep(5000);
        WebElement EventsPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", EventsPageTitle.getText());
        HeaderCheck();
        FooterCheck();

    }

    @Test
    void TopicsTest() {
        System.out.println("Форум - тест");
        driver.get("https://geekbrains.ru/career");
//        Форум
        WebElement TopicsButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/topics\"]"));
        TopicsButton.click();
        //sleep(5000);
        WebElement TopicsPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Форум", TopicsPageTitle.getText());
        HeaderCheck();
        FooterCheck();

    }

    @Test
    void PostsTest() {
        System.out.println("Блог - тест");
        driver.get("https://geekbrains.ru/career");
//        Блог
        WebElement PostsButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/posts\"]"));
        PostsButton.click();
        //sleep(5000);
        WebElement PostsPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Блог", PostsPageTitle.getText());
        HeaderCheck();
        FooterCheck();

    }

    @Test
    void TestsTest() {
        System.out.println("Тесты - тест");
        driver.get("https://geekbrains.ru/career");
//        Тесты
        WebElement TestsButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/tests\"]"));
        TestsButton.click();
        //sleep(5000);
        WebElement TestsPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Тесты", TestsPageTitle.getText());
        HeaderCheck();
        FooterCheck();

    }

    @Test
    void CareerTest() {
        System.out.println("Карьера - тест");
        driver.get("https://geekbrains.ru/events");
//        Карьера
        WebElement CareerButton = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/career\"]"));
        CareerButton.click();
        //sleep(5000);
        WebElement CareerPageTitle = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Карьера", CareerPageTitle.getText());
        HeaderCheck();
        FooterCheck();

    }
}
