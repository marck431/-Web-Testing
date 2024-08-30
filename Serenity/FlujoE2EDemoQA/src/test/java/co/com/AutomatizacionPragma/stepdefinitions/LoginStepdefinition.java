package co.com.AutomatizacionPragma.stepdefinitions;

import co.com.AutomatizacionPragma.interactions.Abrir;
import co.com.AutomatizacionPragma.models.data.DataUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Ingresar;
import co.com.AutomatizacionPragma.tasks.factories.Validar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepdefinition {
    @Given("el usuario esta en la pagina de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        OnStage.theActorCalled("Marcos").wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @When("el usuario ingresa sus credenciales")
    public void el_usuario_ingresa_sus_credenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.alModuloDeLogin(DataUsuario.informacionUsuario())
        );
    }

    @Then("el usuario deberia ingresar a la pagina")
    public void el_usuario_deberia_ingresar_a_la_pagina() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.queSeLogeoCorrectamente(DataUsuario.informacionUsuario())));

    }

    @When("el usuario ingresa sus credenciales erradas")
    public void el_usuario_ingresa_sus_credenciales_erradas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.alModuloDeLogin(DataUsuario.informacionUsuarioErrada())
        );
    }

    @Then("el usuario deberia ver un mensaje de error")
    public void el_usuario_deberia_ver_un_mensaje_de_error() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.queElUsuarioNoPuedeIngresar()));
    }

}
