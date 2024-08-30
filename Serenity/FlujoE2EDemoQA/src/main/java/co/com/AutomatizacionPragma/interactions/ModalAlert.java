package co.com.AutomatizacionPragma.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import org.openqa.selenium.NoAlertPresentException;


import static net.serenitybdd.screenplay.Tasks.*;

public class ModalAlert implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            // That's fine.
        }

    }

    public static ModalAlert aceptar() {
        return instrumented(ModalAlert.class);
    }
}
