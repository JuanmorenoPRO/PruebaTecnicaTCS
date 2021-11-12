package com.demoblaze.automation.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import javax.sound.midi.Instrument;

public class WaitFor implements Interaction {

    private int seconds;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Performable thisSeconds(int seconds){
        return Instrumented.instanceOf(WaitFor.class).withProperties(seconds);
    }
}
