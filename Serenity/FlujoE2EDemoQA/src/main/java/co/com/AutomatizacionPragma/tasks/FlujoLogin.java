package co.com.AutomatizacionPragma.tasks;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FlujoLogin implements Task {
    InformacionUsuario informacionUsuario;

    public FlujoLogin(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ingresar.alModulodeBookStore(),
                Ingresar.alBookStore(),
                Ingresar.losDatosDelUsuario(informacionUsuario)
        );
    }
}
