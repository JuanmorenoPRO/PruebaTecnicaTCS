package com.demoblaze.test.stepdefinitions;

import com.demoblaze.automation.task.ContactForm;
import com.demoblaze.automation.task.Login;
import com.demoblaze.automation.ui.ContactFormPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContactFormStepDefinitions {

    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }

    @When("^the user send a contact message$")
    public void the_user_send_a_contact_message() {
        theActorInTheSpotlight().attemptsTo(ContactForm.successful());
    }

    @Then("^Validate that the message send successfully$")
    public void validate_that_the_message_send_successfully() {

    }
}
