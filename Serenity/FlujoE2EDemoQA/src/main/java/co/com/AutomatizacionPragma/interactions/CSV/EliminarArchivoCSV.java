package co.com.AutomatizacionPragma.interactions.CSV;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.io.File;

import static co.com.AutomatizacionPragma.utils.Constantes.RUTA_FILE;

public class EliminarArchivoCSV implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        File file= new File(RUTA_FILE);
        file.delete();
    }
    public static EliminarArchivoCSV dondeEstaElUserID(){
        return Tasks.instrumented(EliminarArchivoCSV.class);
    }
}
