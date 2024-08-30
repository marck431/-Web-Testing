package co.com.AutomatizacionPragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.AutomatizacionPragma.userinterfaces.BookStorePage.*;

public class BookStore implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_BOOKSTORE.of("login"))
        );
    }
}
