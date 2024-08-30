package co.com.AutomatizacionPragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutomatizacionPragma.userinterfaces.LoginPage.*;

public class ErrorLoguearse implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_NO_LOGUEADO.resolveFor(actor).isVisible();
    }
}
