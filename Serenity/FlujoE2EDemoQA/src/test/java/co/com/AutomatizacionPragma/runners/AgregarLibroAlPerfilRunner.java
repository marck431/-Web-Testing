package co.com.AutomatizacionPragma.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/agregar_libro_al_perfil.feature",
        glue = "co.com.AutomatizacionPragma.stepdefinitions",
        tags = "@FlujoExitoso"
)
public class AgregarLibroAlPerfilRunner {
}
