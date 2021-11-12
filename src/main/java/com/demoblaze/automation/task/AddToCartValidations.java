package com.demoblaze.automation.task;

import com.demoblaze.automation.questions.PresenceElements;
import com.demoblaze.automation.questions.Validations;
import com.demoblaze.automation.ui.AddToCartPage;
import com.demoblaze.automation.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class AddToCartValidations implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(seeThat(PresenceElements.visible(AddToCartPage.TEXT_VALIDATION_PRODUCT)),
                seeThat(Validations.in(AddToCartPage.TEXT_VALIDATION_PRODUCT),
                        equalToIgnoringCase("MacBook Pro")));
    }

    public static AddToCartValidations validations(){
        return instrumented(AddToCartValidations.class);
    }
}
