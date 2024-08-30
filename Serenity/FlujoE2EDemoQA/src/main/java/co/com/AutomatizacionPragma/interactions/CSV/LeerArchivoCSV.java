package co.com.AutomatizacionPragma.interactions.CSV;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.FileReader;
import java.io.IOException;;
import java.util.List;

import static co.com.AutomatizacionPragma.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class LeerArchivoCSV implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String[]> filas ;

        try {
            CSVReader reader = new CSVReader(new FileReader(RUTA_FILE));
            filas=reader.readAll();
            reader.close();
            System.out.println("Imprimio---> "+filas.get(0)[0]);
            actor.remember("User",filas.get(0)[0]);
            System.out.println(actor.recall("User").toString());

        } catch (IOException | CsvException e) {
                //
        }
    }
    public static LeerArchivoCSV dondeEstaElUserID(){
        return instrumented(LeerArchivoCSV.class);
    }
}
