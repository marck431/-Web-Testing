package co.com.AutomatizacionPragma.interactions.apis.usuario;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.devco.automation.mobile.actions.WaitFor;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.AutomatizacionPragma.utils.ConstantesApi.*;

public class CrearUsuario implements Interaction {

    InformacionUsuario usuario;

    public CrearUsuario(InformacionUsuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(URL));
        actor.attemptsTo(
                WaitFor.seconds(4),
                Post.to(ACCOUNT+USER)
                        .with(request -> request
                                .contentType(ContentType.JSON)
                                .body(usuario)
                        )

        );


        actor.remember("userCode", SerenityRest.lastResponse().statusCode());
        actor.remember("userId", SerenityRest.lastResponse().jsonPath().getString("userID"));
      //  System.out.println(actor.recall("UserId").toString());
    }
}
