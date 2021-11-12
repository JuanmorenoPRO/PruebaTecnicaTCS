package com.demoblaze.automation.task;

import com.demoblaze.automation.models.DataDriven;
import com.demoblaze.automation.questions.Validations;
import com.demoblaze.automation.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import com.demoblaze.automation.questions.PresenceElements;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginValidations implements Task {

    DataDriven dataDriven = new DataDriven();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(PresenceElements.visible(LoginPage.WELCOME_TEXT)),
                seeThat(Validations.in(LoginPage.WELCOME_TEXT),
                        equalToIgnoringCase("Welcome "+dataDriven.getUsername())));
    }


    public static LoginValidations validations(){
        return instrumented(LoginValidations.class);
    }

}
