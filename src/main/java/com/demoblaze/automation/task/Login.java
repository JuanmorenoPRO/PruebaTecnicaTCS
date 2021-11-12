package com.demoblaze.automation.task;
import com.demoblaze.automation.models.DataDriven;
import com.demoblaze.automation.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    DataDriven dataDriven = new DataDriven();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LoginPage.LOGIN_OPTION),
                Enter.theValue(dataDriven.getUsername()).into(LoginPage.LOGIN_USERNAME),
                Enter.theValue(dataDriven.getPassword()).into(LoginPage.LOGIN_PASSWORD),
                JavaScriptClick.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Login successful(){
        return instrumented(Login.class);
    }
}
