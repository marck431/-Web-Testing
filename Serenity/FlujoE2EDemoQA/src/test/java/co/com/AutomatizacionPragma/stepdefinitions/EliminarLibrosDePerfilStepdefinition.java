package co.com.AutomatizacionPragma.stepdefinitions;

import co.com.AutomatizacionPragma.models.data.DataUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Ingresar;
import co.com.AutomatizacionPragma.tasks.factories.Iniciar;
import co.com.AutomatizacionPragma.tasks.factories.Validar;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.core.IsEqual;
import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.*;


public class EliminarLibrosDePerfilStepdefinition {
    @Given("El usuario ingresa al Bookstore")
    public void el_usuario_ingresa_al_Bookstore() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.alModulodeBookStore()
        );
    }


    @When("El usuario quiere eliminar los libros")
    public void el_usuario_quiere_eliminar_los_libros() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Iniciar.elFlujoParaEliminarLibro(DataUsuario.informacionUsuario())
        );
    }

    @Then("El usuario debera ver que se borraron")
    public void el_usuario_debera_ver_que_se_borraron() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Validar.queElLibroSeCreo(), not(equalTo(true)))
        );
    }

}
