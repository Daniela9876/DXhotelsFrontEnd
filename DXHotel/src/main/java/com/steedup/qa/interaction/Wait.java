package com.steedup.qa.interaction;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    private int seconds;

    public Wait(int seconds) {
        this.seconds = seconds;
    }
    @Override
    public <T extends Actor> void performAs(T t) {


        new InternalSystemClock().pauseFor(seconds*1000);
    }
    public static Wait waitFor(int seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }
}
