package co.com.AutomatizacionPragma.tasks;

import co.com.AutomatizacionPragma.interactions.CSV.LeerArchivoCSV;
import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.models.data.DataUsuario;
import co.com.AutomatizacionPragma.tasks.factories.Consumir;
import co.com.AutomatizacionPragma.tasks.factories.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FlujoCarritoCompra implements Task {
    InformacionUsuario informacionUsuario;

    public FlujoCarritoCompra(InformacionUsuario informacionUsuario) {
        this.informacionUsuario = informacionUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Consumir.consultarBooks(),
                Ingresar.alModulodeBookStore(),
                Ingresar.alBookStore(),
                Consumir.elToken(DataUsuario.informacionUsuario()),
                Ingresar.losDatosDelUsuario(informacionUsuario),
                Ingresar.losBooksQueQuiere()
        );
        actor.attemptsTo(
                Consumir.elToken(DataUsuario.informacionUsuario()),
                LeerArchivoCSV.dondeEstaElUserID(),
                Consumir.consultarUsuario(DataUsuario.informacionUsuario())
        );
    }
}
