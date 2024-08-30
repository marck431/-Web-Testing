package co.com.AutomatizacionPragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.AutomatizacionPragma.userinterfaces.HomePage.*;
import static co.com.AutomatizacionPragma.utils.Constantes.*;

public class Home implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(OPCION_HOME.of(MODULOS[0]))
        );
    }
}
