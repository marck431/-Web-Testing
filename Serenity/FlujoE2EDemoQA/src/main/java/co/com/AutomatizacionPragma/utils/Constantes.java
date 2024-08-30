package co.com.AutomatizacionPragma.utils;

public class Constantes {

    //Mapeo de todos los modulos
    public static String[] MODULOS = {
            "Book Store Application",
            "Elements",
            "Forms",
            "Alerts, Frame & Windows",
            "Widgets",
            "Interactions",
            "Book Store Application"
    };

    //Ruta donde se va a guardar el archivo
    public static final String RUTA_FILE = "../AutomatizacionPragma/src/test/resources/file/userId.csv";

    //Generar numeros aleatorios para creación de usuarios
    public static final int numeroAleatorio = (int) (Math.random() * (100 - 1 + 1)) + 1;
}
