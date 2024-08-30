package co.com.AutomatizacionPragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BookAgregado implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return !actor.recall("booksUser").toString().isEmpty();
    }
}
