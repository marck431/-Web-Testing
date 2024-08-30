package co.com.AutomatizacionPragma.interactions.apis.usuario;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static co.com.AutomatizacionPragma.utils.ConstantesApi.*;

public class ConsultarUsuario implements Interaction {
    InformacionUsuario informacionUsuario;

    public ConsultarUsuario(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            System.out.println("Llega"+actor.recall("User"));
            actor.whoCan(CallAnApi.at(URL));
            actor.attemptsTo(
                    Get.resource(ACCOUNT + USER + actor.recall("User").toString()).with(request -> request
                            .header("Authorization", "Basic " + AUTH)
                    )
            );
            actor.should(
                    ResponseConsequence.seeThatResponse("Usuario consultado exitosamente",
                            response -> response.statusCode(200))
            );
            actor.remember("booksUser", SerenityRest.lastResponse().jsonPath().getString("books.title[0]").trim());

        } catch (NullPointerException e) {
            actor.remember("booksUser", "");
        }

    }
}
