package com.demoblaze.automation.task;

import com.demoblaze.automation.models.DataDriven;
import com.demoblaze.automation.ui.ContactFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContactForm implements Task {

    DataDriven dataDriven = new DataDriven();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(ContactFormPage.CONTACT_OPTION),
                Enter.theValue(dataDriven.getEmail()).into(ContactFormPage.CONTACT_EMAIL_FIELD),
                Enter.theValue(dataDriven.getName()).into(ContactFormPage.CONTACT_NAME_FIELD),
                Enter.theValue(dataDriven.getMessage()).into(ContactFormPage.MESSAGE_FIELD),
                JavaScriptClick.on(ContactFormPage.SEND_BUTTON)
        );
    }

    public static ContactForm successful(){
        return instrumented(ContactForm.class);
    }
}
