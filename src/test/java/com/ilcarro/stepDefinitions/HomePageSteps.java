package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    //    User launches Chrome Browser
//    User open ilcarro Main Page
//    User verifies Main Page title is displayed
    @Given("User launches Chrome Browser")
    public void launches_Chrome_Browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User open ilcarro Main Page")
    public void open_ilcarro_Main_Page() {
        new HomePage(driver).openUrl();
    }

    @Then("User verifies Main Page title is displayed")
    public void verifies_Main_Page_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }

    @And("User quites browser")
    public void quites_browser() {
        new HomePage(driver).quit();
    }

}
