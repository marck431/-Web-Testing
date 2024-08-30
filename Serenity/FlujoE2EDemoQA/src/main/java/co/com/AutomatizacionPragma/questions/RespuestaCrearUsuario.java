package co.com.AutomatizacionPragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RespuestaCrearUsuario implements Question<Integer> {
    int statusCode ;
    @Override
    public Integer answeredBy(Actor actor) {
        statusCode= actor.recall("userCode");
        return statusCode;
    }
}
