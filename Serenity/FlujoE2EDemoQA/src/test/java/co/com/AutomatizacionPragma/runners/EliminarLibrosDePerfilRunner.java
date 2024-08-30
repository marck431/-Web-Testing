package co.com.AutomatizacionPragma.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/eliminar_libro_del_perfil.feature",
        glue = "co.com.AutomatizacionPragma.stepdefinitions"
)
public class EliminarLibrosDePerfilRunner {
}
