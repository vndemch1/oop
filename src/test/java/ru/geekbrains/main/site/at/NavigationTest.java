package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavigationTest extends BaseTest {

    @Test
    void navigationTest() {
        navigation.getCoursesButton().click();
        page.getPagePopUpClosed().click();
        Assertions.assertEquals("Курсы", page.getPageTitle().getText());
        navigation.getEventsButton().click();
        Assertions.assertEquals("Вебинары", page.getPageTitle().getText());
        navigation.getTopicsButton().click();
        Assertions.assertEquals("Форум", page.getPageTitle().getText());
        navigation.getPostsButton().click();
        Assertions.assertEquals("Блог", page.getPageTitle().getText());
        navigation.getTestsButton().click();
        Assertions.assertEquals("Тесты", page.getPageTitle().getText());
       navigation.getCareerButton().click();
        Assertions.assertEquals("Карьера", page.getPageTitle().getText());
    }
}
