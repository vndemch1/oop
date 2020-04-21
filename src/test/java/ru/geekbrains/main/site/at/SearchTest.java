package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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

        SearchClass searchClass = PageFactory.initElements(driver, SearchClass.class);
        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(d->ProfessionsBlock.isDisplayed());
//        wait.until(d->CoursesBlock.isDisplayed());
//        wait.until(d->EventsBlock.isDisplayed());
//        wait.until(d->PostsBlock.isDisplayed());
//        wait.until(d->TopicsBlock.isDisplayed());
//        wait.until(d->TestsBlock.isDisplayed());
//        wait.until(d->ProjectsAndCompaniesBlock.isDisplayed());

        wait.until(d->searchClass.getProfessionsBlock().isDisplayed());
        wait.until(d->searchClass.getCoursesBlock().isDisplayed());
        wait.until(d->searchClass.getEventsBlock().isDisplayed());
        wait.until(d->searchClass.getPostsBlock().isDisplayed());
        wait.until(d->searchClass.getTopicsBlock().isDisplayed());
        wait.until(d->searchClass.getTestsBlock().isDisplayed());
        wait.until(d->searchClass.getProjectsAndCompaniesBlock().isDisplayed());

        Assertions.assertEquals("Профессии",searchClass.getProfessionsBlock().getText());
        Assertions.assertEquals("Курсы",searchClass.getCoursesBlock().getText());
        Assertions.assertEquals("Вебинары",searchClass.getEventsBlock().getText());
        Assertions.assertEquals("Блоги",searchClass.getPostsBlock().getText());
        Assertions.assertEquals("Форум",searchClass.getTopicsBlock().getText());
        Assertions.assertEquals("Тесты",searchClass.getTestsBlock().getText());
        Assertions.assertEquals("Проекты и компании",searchClass.getProjectsAndCompaniesBlock().getText());

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
        System.out.println("Профессии");
        //        Курсы
        WebElement CoursesCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='courses']/span"));
        Assertions.assertTrue(Integer.parseInt(CoursesCount.getText())>15);
        System.out.println("Курсы");
        //        Вебинары
        WebElement EventsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='webinars']/span"));
        Assertions.assertTrue((Integer.parseInt(EventsCount.getText())>180)&&(Integer.parseInt(EventsCount.getText())<300));
        System.out.println("Вебинары");
        //        Блоги
        WebElement PostsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        Assertions.assertTrue(Integer.parseInt(PostsCount.getText())>300);
        System.out.println("Блоги");
        //        Форум
        WebElement TopicsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='forums']/span"));
        Assertions.assertNotEquals(Integer.parseInt(TopicsCount.getText()),350);
        System.out.println("Форум");
        //        Тесты
        WebElement TestsCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        Assertions.assertNotEquals(Integer.parseInt(TestsCount.getText()),0);
        System.out.println("Тесты");
        //        Проекты и компании
        WebElement ProjectsAndCompaniesCount = driver.findElement(By.xpath("//header[@class='search-page-block__header']/ul/li/a[@data-tab='blogs']/span"));
        // //div/div/section/div[2]/h3/a
        List<WebElement> elementList = driver.findElements(By.xpath("//div/div/section/div[2]/h3/a"));
        int ElementinList = -1;
        for(WebElement ListElement: elementList) {
            if (ElementinList == -1) ElementinList = ListElement.getText().indexOf("GeekBrains");
        }
        Assertions.assertTrue(ElementinList != -1);
        System.out.println("Проекты и компании");




    }
}
