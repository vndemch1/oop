package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.stream.Stream;

@DisplayName("Тест навигации")
public class NavigationTest extends BaseTest {

    public static Stream<String> stringProvider(){
        return Stream.of();
    }

    @Test
    void navigationTest() {
        PageFactory.initElements(driver,Page.class)
                .getNavigation().checkButton("Курсы").PopUpClosed().checkTitle("Курсы")
                .getNavigation().checkButton("Вебинары").checkTitle("Вебинары")
                .getNavigation().checkButton("Форум").checkTitle("Форум")
                .getNavigation().checkButton("Блог").checkTitle("Блог")
                .getNavigation().checkButton("Тесты").checkTitle("Тесты")
                .getNavigation().checkButton("Карьера").checkTitle("Карьера");



        // Обычный Page Object
//        page.getNavigation().checkButton("Курсы");
//        page.PopUpClosed();
//        page.checkTitle("Курсы");
//
//        page.getNavigation().checkButton("Вебинары");
//        page.checkTitle("Вебинары");
//
//        page.getNavigation().checkButton("Форум");
//        page.checkTitle("Форум");
//
//        page.getNavigation().checkButton("Блог");
//        page.checkTitle("Блог");
//
//        page.getNavigation().checkButton("Тесты");
//        page.checkTitle("Тесты");
//
//        page.getNavigation().checkButton("Карьера");
//        page.checkTitle("Карьера");
    }
}
