package co.com.AutomatizacionPragma.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InformacionUsuario {
    private String userName;
    private String password;
}
