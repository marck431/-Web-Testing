package co.com.AutomatizacionPragma.tasks;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutomatizacionPragma.userinterfaces.LoginPage.*;

public class Login implements Task {
    InformacionUsuario informacionUsuario;

    public Login(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionUsuario.getUserName()).into(INPUTS_LOGIN.of("userName")),
                Enter.theValue(informacionUsuario.getPassword()).into(INPUTS_LOGIN.of("password")),
                Click.on(BTN_LOGIN.of("login"))
        );
    }
}
