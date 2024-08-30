package co.com.AutomatizacionPragma.questions;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutomatizacionPragma.userinterfaces.LoginPage.*;

public class Logeado implements Question<Boolean> {
    InformacionUsuario informacionUsuario;

    public Logeado(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_LOGUEADO.of(informacionUsuario.getUserName()).resolveFor(actor).isVisible();
    }
}
