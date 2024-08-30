package co.com.AutomatizacionPragma.tasks.factories;

import co.com.AutomatizacionPragma.models.InformacionUsuario;
import co.com.AutomatizacionPragma.questions.*;


public class Validar {
    public static BotonLoginActivo queElBotonDeLoginEsteActivo() {
        return new BotonLoginActivo();
    }

    public static ErrorLoguearse queElUsuarioNoPuedeIngresar() {
        return new ErrorLoguearse();
    }

    public static Logeado queSeLogeoCorrectamente(InformacionUsuario informacionUsuario) {
        return new Logeado(informacionUsuario);
    }

    public static RespuestaCrearUsuario elStatusCodeDeCrearUsuario() {
        return new RespuestaCrearUsuario();
    }

    public static BookAgregado queElLibroSeCreo() {
        return new BookAgregado();
    }
}
