package com.steedup.qa.task;

import com.steedup.qa.interaction.Scroll;
import com.steedup.qa.interaction.Wait;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.steedup.qa.userinterface.SearchHotel.*;

public class SearchHotel implements Task {
    private com.steedup.qa.models.SearchHotel searchHotel;
    public SearchHotel(com.steedup.qa.models.SearchHotel searchHotel) {
        this.searchHotel = searchHotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATION1), Wait.waitFor(1));
        actor.attemptsTo(Click.on(LOS_HANALULU.of(searchHotel.getLocation())), Wait.waitFor(1));
        actor.attemptsTo(Enter.theValue(searchHotel.getCheckout()).into(CALENDAR2), Wait.waitFor(1));
        actor.attemptsTo(Enter.theValue(searchHotel.getCheckin()).into(CALENDAR), Wait.waitFor(1));
        actor.attemptsTo(Click.on(ROOMSCLICK), Wait.waitFor(1));
        actor.attemptsTo(Click.on(ROOM.of(searchHotel.getRooms())), Wait.waitFor(1));
        actor.attemptsTo(Click.on(CLICADULTS), Wait.waitFor(1));
        actor.attemptsTo(Click.on(ADULTS.of(searchHotel.getAdults())), Wait.waitFor(1));
        actor.attemptsTo(Click.on(CLICCHILD), Wait.waitFor(1));
        actor.attemptsTo(Click.on(CHILDREN.of(searchHotel.getChildren())), Wait.waitFor(1));
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
        //actor.attemptsTo(Click.on(NUMBER_PAGE), Wait.waitFor(3));
        //actor.attemptsTo(Click.on(SELECT_HOTEL), Wait.waitFor(5));
        WebElementFacade PrecioHotel1 = BrowseTheWeb.as(actor).findBy(com.steedup.qa.userinterface.SearchHotel.GET_PRICE_HOTEL1.getCssOrXPathSelector());
        WebElementFacade PrecioHotel2 = BrowseTheWeb.as(actor).findBy(com.steedup.qa.userinterface.SearchHotel.GET_PRICE_HOTEL2.getCssOrXPathSelector());
        WebElementFacade PrecioHotel3 = BrowseTheWeb.as(actor).findBy(GET_PRICE_HOTEL3.getCssOrXPathSelector());





        StringBuilder t1 = new StringBuilder(PrecioHotel1.getText());
        StringBuilder t2 = new StringBuilder(PrecioHotel2.getText());
        StringBuilder t3 = new StringBuilder(PrecioHotel3.getText());



        int Precio1=Integer.parseInt(String.valueOf(t1.deleteCharAt(0)));
        int Precio2=Integer.parseInt(String.valueOf(t2.deleteCharAt(0)));
        int Precio3=Integer.parseInt(String.valueOf(t3.deleteCharAt(0)));



        System.out.println(Precio1);
        System.out.println(Precio2);
        System.out.println(Precio3);


        int menorvalor;
        if(Precio1 < Precio2 && Precio1 < Precio3 ){
            actor.attemptsTo(Click.on(CLICK_BUTTON), Wait.waitFor(1));
            menorvalor = Precio1;
        }else if (Precio2 < Precio1 && Precio2 < Precio3){
            actor.attemptsTo(Click.on(CLICK_BUTTON2), Wait.waitFor(1));
            menorvalor = Precio2;
        }else {
            actor.attemptsTo(Click.on(CLICK_BUTTON3), Wait.waitFor(1));
            menorvalor = Precio3;
        }
        String checkinDate = searchHotel.getCheckin();
        String checkoutDate = searchHotel.getCheckout();

        LocalDate ci = LocalDate.parse(checkinDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        LocalDate co = LocalDate.parse(checkoutDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        long numdias = ci.until(co, ChronoUnit.DAYS)+1;

        System.out.println(numdias);


        //PRECIO TOTAL
        WebElementFacade PrecioTOTAL = BrowseTheWeb.as(actor).findBy(GET_PRICE_TOTAL.getCssOrXPathSelector());

        StringBuilder PT = new StringBuilder(PrecioTOTAL.getText());
        double PrecioT=Double.parseDouble(String.valueOf(PT.deleteCharAt(0)));
        System.out.println(PrecioT);

        double preciototalcalculado = numdias*menorvalor;

        if (preciototalcalculado == PrecioT){
            System.out.println("El valor total es el correcto");
        }else {
            System.out.println("El valor total no coincide con la formula aplicada");
        }


        //

    }
    public static SearchHotel withData(com.steedup.qa.models.SearchHotel searchHotel) {
        return new SearchHotel(searchHotel);
    }
}
