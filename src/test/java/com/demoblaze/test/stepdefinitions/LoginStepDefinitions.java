package com.demoblaze.test.stepdefinitions;

import com.demoblaze.automation.task.Login;
import com.demoblaze.automation.task.LoginValidations;
import com.demoblaze.automation.task.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {


    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }

    @When("^the user wants to Login$")
    public void the_user_wants_to_Login() {
        theActorInTheSpotlight().attemptsTo(Login.successful());
    }


    @Then("^Validate Login complete$")
    public void validate_Login_complete() {
        theActorInTheSpotlight().attemptsTo(LoginValidations.validations());
    }
}
