package co.com.AutomatizacionPragma.interactions.apis.books;

import co.com.AutomatizacionPragma.models.InformacionBooks;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static co.com.AutomatizacionPragma.utils.ConstantesApi.*;

public class ConsultarBooks implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(URL));
        actor.attemptsTo(
                Get.resource(BOOKSTORE+BOOKS).with(request -> request
                        .contentType(ContentType.JSON))
        );
        actor.should(
                ResponseConsequence.seeThatResponse("Trajo los libros",
                        response -> response.statusCode(200))
        );
        List<InformacionBooks> respuesta = SerenityRest.lastResponse().jsonPath().getList("books", InformacionBooks.class);
        actor.remember("books",respuesta);
    }
}
