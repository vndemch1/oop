package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Page {

    @FindBy(css = "[class=\"gb-header__title\"]")
    private WebElement pageTitle;

    @FindBy(css = "div button svg[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement pagePopUpClosed;

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public WebElement getPagePopUpClosed() {
        return pagePopUpClosed;
    }

    public void checkTitle(String expextedTitle) {
        String actualTitle = pageTitle.getText();
        assertThat();
    }
}
