package com.ilcarro.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LetTheCarWorkPage extends BasePage {

    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement pickupplace;

    @FindBy(css = "html")
    WebElement space;

    public LetTheCarWorkPage enterLocation(String place, String address_data) {
        type(pickupplace, place);
        ((JavascriptExecutor) driver).executeScript(
                "var divElement = document.querySelector('.address-data');" +
                        "var textNode = document.createTextNode(arguments[0]);" +
                        "divElement.appendChild(textNode);", address_data
        );
        click(space);
        return this;
    }

    @FindBy(id = "make")
    WebElement inputmake;

    @FindBy(id = "model")
    WebElement inputmodel;

    @FindBy(id = "year")
    WebElement inputyear;

    public LetTheCarWorkPage enterManufactureModelYear(String manufacture, String model, String year) {
        type(inputmake, manufacture);
        type(inputmodel, model);
        type(inputyear, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement inputfuel;

    public LetTheCarWorkPage enterFuel(String fuel) {
        Select dropdown = new Select(inputfuel);
        dropdown.selectByValue(fuel);
        return this;
    }

    @FindBy(id = "seats")
    WebElement inputseats;

    @FindBy(id = "class")
    WebElement inputcarclass;

    @FindBy(id = "serialNumber")
    WebElement inputcarregnumber;

    @FindBy(id = "price")
    WebElement inputprice;

    public LetTheCarWorkPage enterSeats_Carclass_Carregnumber_Price(String seats, String carclass, String carregnumber, String price) {
        type(inputseats, seats);
        type(inputcarclass, carclass);
        type(inputcarregnumber, carregnumber);
        type(inputprice, price);
        return this;
    }

    @FindBy(id = "about")
    WebElement inputabout;

    public LetTheCarWorkPage entersTextAbout(String text) {
        inputabout.sendKeys(text);
        return this;
    }

    @FindBy(id = "photos")
    WebElement uploadPicture;

    public LetTheCarWorkPage uploadFile(String path) {
        uploadPicture.sendKeys(path);
        return this;
    }

    @FindBy(xpath = "//button[.='Submit']")
    WebElement buttonsubmit;

    public LetTheCarWorkPage clicksSubmitButton() {
        click(buttonsubmit);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement caradded;

    public LetTheCarWorkPage isCarAddedDisplayed() {
        assert isElementDisplayed(caradded);
        return this;
    }

}
