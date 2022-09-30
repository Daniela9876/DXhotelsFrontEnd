package com.steedup.qa.stepdefinitions;

import com.steedup.qa.models.SearchHotel;
import com.steedup.qa.question.BusquedaCorrecta;
import com.steedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchHotelStep {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Daniela G.M");
    }

    @Given("^that the user is on the main page$")
    public void thatTheUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^search hotel with$")
    public void searchHotelWith(List<SearchHotel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(com.steedup.qa.task.SearchHotel.withData(data.get(0)));
    }

    @Then("^he should see the title (.*)$")
    public void heShouldSeeTheTitle(String busquedacorrecta) {
        theActorInTheSpotlight().should(seeThat(BusquedaCorrecta.title(),
                org.hamcrest.Matchers.is(busquedacorrecta)));

    }

}
