package co.com.AutomatizacionPragma.interactions.CSV;

import com.opencsv.CSVWriter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.FileWriter;
import java.io.IOException;

import static co.com.AutomatizacionPragma.utils.Constantes.RUTA_FILE;
import static net.serenitybdd.screenplay.Tasks.*;

public class EscribirArchivoCSV implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String miUserId;
        String[] datos;
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(RUTA_FILE, true));
            miUserId = actor.recall("userId").toString();
            System.out.println(miUserId);
            datos = new String[]{miUserId};
            writer.writeNext(datos, false);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static EscribirArchivoCSV dondeEstaElUserID() {
        return instrumented(EscribirArchivoCSV.class);
    }
}
