package co.com.AutomatizacionPragma.interactions.apis;

import co.com.AutomatizacionPragma.interactions.CSV.EliminarArchivoCSV;
import co.com.AutomatizacionPragma.interactions.CSV.EscribirArchivoCSV;
import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Consumir;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static co.com.AutomatizacionPragma.utils.ConstantesApi.*;

public class Token implements Interaction {
    InformacionUsuario usuario;

    public Token(InformacionUsuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.whoCan(CallAnApi.at(URL));
            actor.attemptsTo(
                    Post.to(ACCOUNT + TOKEN)
                            .with(request -> request
                                    .contentType(ContentType.JSON)
                                    .body(usuario)
                            )

            );
            actor.should(
                    ResponseConsequence.seeThatResponse("Token validado",
                            response -> response.statusCode(200))
            );
            System.out.println("Entreo aqui --->"+SerenityRest.lastResponse().jsonPath().getString("token"));


            actor.remember("token", SerenityRest.lastResponse().jsonPath().getString("token").trim());

        } catch (NullPointerException e) {
            actor.attemptsTo(
                    Consumir.crearUsuario(usuario),
                    EliminarArchivoCSV.dondeEstaElUserID(),
                    EscribirArchivoCSV.dondeEstaElUserID(),
                    Consumir.elToken(usuario)
            );
        }


    }
}
