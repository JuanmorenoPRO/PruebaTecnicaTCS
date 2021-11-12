package com.demoblaze.test.stepdefinitions;


import com.demoblaze.automation.interactions.OpenBrowser;
import com.demoblaze.automation.task.SingUp;
import com.demoblaze.automation.ui.RegisterUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {

    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }

    @Given("^the user is in the homepage$")
    public void theUserIsInTheHomepage() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(RegisterUserPage.URL));
    }

    @When("^the user wants to sing up$")
    public void theUserWantsToSingUp() {
        theActorInTheSpotlight().attemptsTo(SingUp.successful());

    }

    @Then("^Validate sing up complete$")
    public void validateSingUpComplete() {
     // theActorInTheSpotlight().attemptsTo((Performable) AlertAceept);
    }

}
