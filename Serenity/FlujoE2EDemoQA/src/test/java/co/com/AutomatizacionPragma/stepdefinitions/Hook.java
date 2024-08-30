package co.com.AutomatizacionPragma.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hook {
    @Before
    public void prepararActor() {
        OnStage.setTheStage(new OnlineCast());
    }
}
