package co.com.AutomatizacionPragma.models.data;

import co.com.AutomatizacionPragma.models.InformacionUsuario;

import static co.com.AutomatizacionPragma.utils.Constantes.*;

// Clase donde se llena la informacion del usuario
public class DataUsuario {
    public static InformacionUsuario informacionUsuario() {
        return InformacionUsuario.builder()
                .userName("coplees")
                .password("M@rcos1205")
                .build();
    }

    public static InformacionUsuario informacionUsuarioErrada() {
        return InformacionUsuario.builder()
                .userName("pruebaMala")
                .password("M@rcos1205")
                .build();
    }

    public static InformacionUsuario informacionUsuarioNew() {
        return InformacionUsuario.builder()
                .userName("pruebNum" + numeroAleatorio)
                .password("M@cos1205")
                .build();
    }

}
