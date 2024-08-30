package co.com.AutomatizacionPragma.tasks;

import co.com.AutomatizacionPragma.interactions.CSV.LeerArchivoCSV;
import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Consumir;
import co.com.AutomatizacionPragma.tasks.factories.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.AutomatizacionPragma.userinterfaces.PerfilPage.*;

public class FlujoEliminarBooks implements Task {

    InformacionUsuario informacionUsuario;

    public FlujoEliminarBooks(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Consumir.elToken(informacionUsuario),
                LeerArchivoCSV.dondeEstaElUserID(),
                Consumir.consultarUsuario((informacionUsuario))
        );
        System.out.println("quiero " + !actor.recall("booksUser").toString().isEmpty());
        actor.attemptsTo(
                Check.whether(!actor.recall("booksUser").toString().isEmpty())
                        .andIfSo(
                                Consumir.consultarBooks(),
                                Ingresar.alBookStore(),
                                Ingresar.losDatosDelUsuario(informacionUsuario),
                                Ingresar.losBooksQueQuiere(),
                                JavaScriptClick.on(SUB_MODULO)).
                        otherwise(
                                JavaScriptClick.on(SUB_MODULO),
                                JavaScriptClick.on(A_LOGIN),
                                Ingresar.losDatosDelUsuario(informacionUsuario))
        );
        System.out.println("paso por aqui");
        actor.attemptsTo(
                JavaScriptClick.on(BTN_PERFIL_TEXT.of("Delete All Books")),
                JavaScriptClick.on(BTN_PERFIL_TEXT.of("OK"))
        );
    }
}
