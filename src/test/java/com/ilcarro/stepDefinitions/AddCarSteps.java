package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetTheCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on Success message button")
    public void clicks_on_Success_message_button() {
        new LoginPage(driver).clickOnSuccessMessButton();
    }

    @And("User clicks on LetTheCarWork link")
    public void clicks_on_LetTheCarWork_link() {
        new HomePage(driver).clicksOnLetTheCarWorkLink();
    }

    @And("User enters location")
    public void enters_Location() {
        new LetTheCarWorkPage(driver).enterLocation("Tel Aviv, Israel","Tel Aviv ");
        //new LetTheCarWorkPage(driver).enterLocation("Tel Aviv, Israel");
    }

    @And("User enters manufacture model year")
    public void enters_manufacture_model_year() {
        new LetTheCarWorkPage(driver).enterManufactureModelYear("Ford","Mustang","2021");
    }

    @And("User enters fuel")
    public void enters_fuel() {
        new LetTheCarWorkPage(driver).enterFuel("Petrol");
    }

    @And("User enters seats carclass carregnumber price")
    public void enters_seats_carclass_carregnumber_price() {
        new LetTheCarWorkPage(driver)
                .enterSeats_Carclass_Carregnumber_Price("4","SPORT","AB123CD","1000");
    }

    @And("User enters text about")
    public void enters_text_about() {
        new LetTheCarWorkPage(driver)
                .entersTextAbout("Ford Mustang 2021 - a symbol of power and style.");
    }

    @And("User upload file")
    public void upload_file() {
        new LetTheCarWorkPage(driver).uploadFile("C:/Tools/car.png");
    }

    @And("User clicks submit button")
    public void clicks_submit_button() {
        new LetTheCarWorkPage(driver).clicksSubmitButton();
    }

    @Then("User verifies Success car added displayed")
    public void SuccessCarAddedDisplayed() {
        new LetTheCarWorkPage(driver).isCarAddedDisplayed();
    }


}

