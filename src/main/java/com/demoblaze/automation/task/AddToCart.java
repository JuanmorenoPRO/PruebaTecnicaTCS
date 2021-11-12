package com.demoblaze.automation.task;

import com.demoblaze.automation.ui.AddToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(AddToCartPage.LAPTOP_OPTION),
                JavaScriptClick.on(AddToCartPage.LAPTOP_SELECT),
                JavaScriptClick.on(AddToCartPage.ADD_TO_CART_BUTTON)
        );
        BrowseTheWeb.as(actor).getAlert().accept();
        actor.attemptsTo(JavaScriptClick.on(AddToCartPage.CART_OPTION));
    }


    public static AddToCart successful(){
        return instrumented(AddToCart.class);
    }
}
