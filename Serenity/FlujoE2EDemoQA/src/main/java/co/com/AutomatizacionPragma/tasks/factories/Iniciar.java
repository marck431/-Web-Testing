package co.com.AutomatizacionPragma.tasks.factories;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.tasks.FlujoCarritoCompra;
import co.com.AutomatizacionPragma.tasks.FlujoEliminarBooks;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.*;

public class Iniciar {
    public static FlujoCarritoCompra elFlujodeAgregarLibro(InformacionUsuario informacionUsuario){
        return instrumented(FlujoCarritoCompra.class,informacionUsuario);
    }
    public static FlujoEliminarBooks elFlujoParaEliminarLibro(InformacionUsuario informacionUsuario){
        return instrumented(FlujoEliminarBooks.class,informacionUsuario);

    }
}
