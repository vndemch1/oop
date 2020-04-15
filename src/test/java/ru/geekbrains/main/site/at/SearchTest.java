package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Thread.sleep;

public class SearchTest extends BaseTest {

    @Test
    void EnterTextTest() throws InterruptedException {
        //    Перейти на сайт https://geekbrains.ru/courses
        driver.get("https://geekbrains.ru/career");
        //    Нажать на кнопку Поиск
        WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/div/ul/li[2]/a"));
        SearchButton.click();
        //    В поле Поиск ввести текст: java
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");
        //    Проверить что отобразились блоки:
        //sleep(5000);
        //        Профессии
        WebElement ProfessionsBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][1]/div[@class='stickyTitleWrap']/header/h2"));
        //        Курсы
        WebElement CoursesBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][2]/div[@class='stickyTitleWrap']/header/h2"));
        //        Вебинары
        WebElement EventsBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][3]/div[@class='stickyTitleWrap']/header/h2"));
        //        Блоги
        WebElement PostsBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][4]/div[@class='stickyTitleWrap']/header/h2"));
        //        Форум
        WebElement TopicsBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][5]/div[@class='stickyTitleWrap']/header/h2"));
        //        Тесты
        WebElement TestsBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][6]/div[@class='stickyTitleWrap']/header/h2"));
        //        Проекты и компании
        WebElement ProjectsAndCompaniesBlock = driver.findElement(By.xpath("//div[@class='search-page-block'][7]/div[@class='stickyTitleWrap']/header/h2"));

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(d->ProfessionsBlock.isDisplayed());
        wait.until(d->CoursesBlock.isDisplayed());
        wait.until(d->EventsBlock.isDisplayed());
        wait.until(d->PostsBlock.isDisplayed());
        wait.until(d->TopicsBlock.isDisplayed());
        wait.until(d->TestsBlock.isDisplayed());
        wait.until(d->ProjectsAndCompaniesBlock.isDisplayed());

        Assertions.assertEquals("Профессии",ProfessionsBlock.getText());
        Assertions.assertEquals("Курсы",CoursesBlock.getText());
        Assertions.assertEquals("Вебинары",EventsBlock.getText());
        Assertions.assertEquals("Блоги",PostsBlock.getText());
        Assertions.assertEquals("Форум",TopicsBlock.getText());
        Assertions.assertEquals("Тесты",TestsBlock.getText());
        Assertions.assertEquals("Проекты и компании",ProjectsAndCompaniesBlock.getText());

        //        Профессий не менее чем 2
        //        Курсов более 15
        //        Вебинаров больше чем 180, но меньше 300
        //        Блогов более 300
        //        Форумов не 350
        //        Тестов не 0
        //        В Проектах и компаниях отображается GeekBrains
        //        Профессии
        WebElement ProfessionsCount = driver.findElement(By.xpath("//*[@id=\"professions\"]/div[1]/header/ul/li/a/span"));
        //int professionsNum = Integer.parseInt(ProfessionsCount.getText());
        Assertions.assertTrue(Integer.parseInt(ProfessionsCount.getText())>1);
        //        Курсы
        WebElement CoursesCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='courses']/span"));
        Assertions.assertTrue(Integer.parseInt(CoursesCount.getText())>15);
        //        Вебинары
        WebElement EventsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='webinars']/span"));
        Assertions.assertTrue((Integer.parseInt(EventsCount.getText())>180)&&(Integer.parseInt(EventsCount.getText())<300));
        //        Блоги
        WebElement PostsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        Assertions.assertTrue(Integer.parseInt(PostsCount.getText())>300);
        //        Форум
        WebElement TopicsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='forums']/span"));
        Assertions.assertNotEquals(Integer.parseInt(TopicsCount.getText()),350);
        //        Тесты
        WebElement TestsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        Assertions.assertNotEquals(Integer.parseInt(TestsCount.getText()),0);
        //        Проекты и компании
        WebElement ProjectsAndCompaniesCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        // //div/div/section/div[2]/h3/a
        List<WebElement> elementList = driver.findElements(By.xpath("//div/div/section/div[2]/h3/a"));
        int ElementinList = -1;
        for(WebElement ListElement: elementList) {
            if (ElementinList == -1) ElementinList = ListElement.getText().indexOf("GeekBrains");
        }
        Assertions.assertTrue(ElementinList != -1);




    }
}
