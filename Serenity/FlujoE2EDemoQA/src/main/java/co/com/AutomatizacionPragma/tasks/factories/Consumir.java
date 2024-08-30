package co.com.AutomatizacionPragma.tasks.factories;

import co.com.AutomatizacionPragma.interactions.apis.books.ConsultarBooks;
import co.com.AutomatizacionPragma.interactions.apis.usuario.ConsultarUsuario;
import co.com.AutomatizacionPragma.interactions.apis.usuario.CrearUsuario;
import co.com.AutomatizacionPragma.interactions.apis.Token;
import co.com.AutomatizacionPragma.models.InformacionUsuario;

import static net.serenitybdd.screenplay.Tasks.*;

public class Consumir {
    public static Token elToken(InformacionUsuario informacionUsuario){
        return instrumented(Token.class,informacionUsuario);
    }
    public static CrearUsuario crearUsuario(InformacionUsuario informacionUsuario){
        return instrumented(CrearUsuario.class,informacionUsuario);
    }
    public static ConsultarBooks consultarBooks(){
        return instrumented(ConsultarBooks.class);
    }
    public static ConsultarUsuario consultarUsuario(InformacionUsuario informacionUsuario){
        return instrumented(ConsultarUsuario.class, informacionUsuario);
    }
}
