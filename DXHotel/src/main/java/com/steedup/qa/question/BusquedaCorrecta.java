package com.steedup.qa.question;

import com.steedup.qa.userinterface.SearchHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BusquedaCorrecta implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((SearchHotel.TITULO_BUSQUEDA_CORRECTA),
                WebElementStateMatchers.isVisible()));
        return Text.of(SearchHotel.TITULO_BUSQUEDA_CORRECTA).viewedBy(actor).asString();
    }

    public static BusquedaCorrecta title(){

        return new BusquedaCorrecta();
    }
}
