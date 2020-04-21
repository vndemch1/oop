package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchClass {

   @FindBy(xpath = "//div[@class='search-page-block'][1]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement ProfessionsBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][2]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement CoursesBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][3]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement EventsBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][4]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement PostsBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][5]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement TopicsBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][6]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement TestsBlock;
   @FindBy(xpath = "//div[@class='search-page-block'][7]/div[@class='stickyTitleWrap']/header/h2")
   private WebElement ProjectsAndCompaniesBlock;

   public WebElement getProfessionsBlock() {
      return ProfessionsBlock;
   }

   public WebElement getCoursesBlock() {
      return CoursesBlock;
   }

   public WebElement getEventsBlock() {
      return EventsBlock;
   }

   public WebElement getPostsBlock() {
      return PostsBlock;
   }

   public WebElement getTopicsBlock() {
      return TopicsBlock;
   }

   public WebElement getTestsBlock() {
      return TestsBlock;
   }

   public WebElement getProjectsAndCompaniesBlock() {
      return ProjectsAndCompaniesBlock;
   }
}
