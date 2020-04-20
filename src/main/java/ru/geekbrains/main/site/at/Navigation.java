package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation {

   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/courses\"]")
   private WebElement CoursesButton;
   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/events\"]")
   private WebElement EventsButton;
   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/topics\"]")
   private WebElement TopicsButton;
   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/posts\"]")
   private WebElement PostsButton;
   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/tests\"]")
   private WebElement TestsButton;
   @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/career\"]")
   private WebElement CareerButton;

    public WebElement getCoursesButton() {
        return CoursesButton;
    }

    public WebElement getEventsButton() {
        return EventsButton;
    }

    public WebElement getTopicsButton() {
        return TopicsButton;
    }

    public WebElement getPostsButton() {
        return PostsButton;
    }

    public WebElement getTestsButton() {
        return TestsButton;
    }

    public WebElement getCareerButton() {
        return CareerButton;
    }
}
