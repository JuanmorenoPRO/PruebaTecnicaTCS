package com.demoblaze.automation.task;

import com.demoblaze.automation.interactions.Alert;
import com.demoblaze.automation.interactions.WaitFor;
import com.demoblaze.automation.models.DataDriven;
import com.demoblaze.automation.ui.RegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SingUp implements Task {

    private WebDriver driver;
    DataDriven dataDriven = new DataDriven();
    public String text;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(RegisterUserPage.SING_UP_OPTION),
                Enter.theValue(dataDriven.getUsername()).into(RegisterUserPage.SING_USERNAME),
                Enter.theValue(dataDriven.getPassword()).into(RegisterUserPage.SING_PASSWORD),
                JavaScriptClick.on(RegisterUserPage.SING_UP_BUTTON),
                WaitFor.thisSeconds(3000),
                Alert.thisDriver(driver)
        );

    }

    public static SingUp successful (){
        return instrumented(SingUp.class);
    }
}
