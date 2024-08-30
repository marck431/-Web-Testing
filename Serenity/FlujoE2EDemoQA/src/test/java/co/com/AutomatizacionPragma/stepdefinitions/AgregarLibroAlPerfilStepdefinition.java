package co.com.AutomatizacionPragma.stepdefinitions;

import co.com.AutomatizacionPragma.interactions.Abrir;
import co.com.AutomatizacionPragma.models.data.DataUsuario;

import co.com.AutomatizacionPragma.tasks.factories.Iniciar;
import co.com.AutomatizacionPragma.tasks.factories.Validar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class AgregarLibroAlPerfilStepdefinition {
    @Given("El usuario escoge el modulo de Book Store")
    public void el_usuario_escoge_el_modulo_de_Book_Store() {
        OnStage.theActorCalled("Marcos").wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @When("El usuario hace el flujo para agregar un libro al perfil")
    public void el_usuario_hace_el_flujo_para_agregar_un_libro_al_perfil() {
        OnStage.theActorInTheSpotlight().attemptsTo(
           Iniciar.elFlujodeAgregarLibro(DataUsuario.informacionUsuario())
        );
    }

    @Then("El usuario verifica que El libro se haya agregado")
    public void el_usuario_verifica_que_El_libro_se_haya_agregado() {
        OnStage.theActorInTheSpotlight().should(
                        GivenWhenThen.seeThat(Validar.queElLibroSeCreo())
        );
    }
}
