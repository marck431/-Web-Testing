package co.com.AutomatizacionPragma.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/crear_usuario.feature",
        glue = "co.com.AutomatizacionPragma.stepdefinitions",
        tags = "@UsuarioNuevo,@UsuarioQueExiste"
)
public class CrearUsuarioRunner {
}
