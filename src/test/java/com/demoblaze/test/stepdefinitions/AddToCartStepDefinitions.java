package com.demoblaze.test.stepdefinitions;

import com.demoblaze.automation.task.AddToCart;
import com.demoblaze.automation.task.AddToCartValidations;
import com.demoblaze.automation.task.ContactForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCartStepDefinitions {

    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }


    @When("^the user add to cart a laptop$")
    public void the_user_add_to_cart_a_laptop() {
        theActorInTheSpotlight().attemptsTo(AddToCart.successful());
    }

    @Then("^Validate that the laptop is  in the cart$")
    public void validate_that_the_laptop_is_in_the_cart() {
        theActorInTheSpotlight().attemptsTo(AddToCartValidations.validations());
    }

}
