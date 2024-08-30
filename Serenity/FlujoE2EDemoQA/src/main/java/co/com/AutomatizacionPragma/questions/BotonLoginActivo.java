package co.com.AutomatizacionPragma.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutomatizacionPragma.userinterfaces.BookStorePage.*;

public class BotonLoginActivo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_BOOKSTORE.of("login").resolveFor(actor).isVisible();
    }
}
