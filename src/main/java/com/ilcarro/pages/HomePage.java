package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement title;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginlink;

    public LoginPage clickOnLoginLink() {
        click(loginlink);
        return new LoginPage(driver);
    }

    //****************************************************
    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement letthecarwork;

    public LetTheCarWorkPage clicksOnLetTheCarWorkLink() {
        letthecarwork.click();
        //click(letthecarwork);
        return new LetTheCarWorkPage(driver);
    }

}
