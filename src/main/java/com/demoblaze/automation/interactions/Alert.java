package com.demoblaze.automation.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Alert implements Interaction {

    WebDriver driver;

    public Alert(WebDriver driver){
        this.driver = driver;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.switchTo().alert().accept();
        String text = driver.switchTo().alert().getText();
    }

    public static Performable thisDriver(WebDriver driver){
        return Instrumented.instanceOf(WaitFor.class).withProperties(driver);
    }
}
