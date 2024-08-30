package co.com.AutomatizacionPragma.tasks.factories;

import co.com.AutomatizacionPragma.interactions.EscogerBooks;
import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.tasks.BookStore;
import co.com.AutomatizacionPragma.tasks.FlujoLogin;
import co.com.AutomatizacionPragma.tasks.Home;
import co.com.AutomatizacionPragma.tasks.Login;


import static net.serenitybdd.screenplay.Tasks.*;

public class Ingresar {
    public static Login losDatosDelUsuario(InformacionUsuario informacionUsuario){
        return instrumented(Login.class,informacionUsuario);
    }
    public static Home alModulodeBookStore(){
        return instrumented(Home.class);
    }
    public static BookStore alBookStore(){
        return instrumented(BookStore.class);
    }
    public static EscogerBooks losBooksQueQuiere(){
        return instrumented(EscogerBooks.class);
    }
    public static FlujoLogin alModuloDeLogin(InformacionUsuario informacionUsuario){
        return instrumented(FlujoLogin.class,informacionUsuario);
    }
}
