package co.com.AutomatizacionPragma.stepdefinitions;

import co.com.AutomatizacionPragma.models.data.DataUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Consumir;
import co.com.AutomatizacionPragma.tasks.factories.Validar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.equalTo;

public class CrearUsuarioStepdefinition {
    @When("El usuario consume el servicio de crear usuario")
    public void el_usuario_consume_el_servicio_de_crear_usuario() {
        OnStage.theActorCalled("Marcos").wasAbleTo(
                Consumir.crearUsuario(DataUsuario.informacionUsuarioNew())
        );
    }

    @When("El usuario consume el servicio de crear usuario ya creado")
    public void el_usuario_consume_el_servicio_de_crear_usuario_ya_creado() {

        OnStage.theActorCalled("Marcos").wasAbleTo(
                Consumir.crearUsuario(DataUsuario.informacionUsuario())
        );
    }

    @Then("El servicio le responde {int} y ve un mensaje user exists")
    public void el_servicio_le_responde_y_ve_un_mensaje_user_exists(Integer code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.elStatusCodeDeCrearUsuario(), equalTo(code)));
    }

    @Then("El servicio le responde {int} y ve su user id")
    public void el_servicio_le_responde_y_ve_su_user_id(Integer code) {
        System.out.println(code);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.elStatusCodeDeCrearUsuario(), equalTo(code)));
    }

}
