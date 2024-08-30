package co.com.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class PerfilPage {
    public static final Target SUB_MODULO = Target.the("sub modulo profile").located(By.xpath("//li[contains(.,'Profile')]"));
    public static final Target A_LOGIN = Target.the("href para ingresar al login").located(By.xpath("//a[contains(.,'login')]"));
    public static Target BTN_PERFIL_TEXT = Target.the("btn de perfil").locatedBy("//button[contains(text(),'{0}')]");

}
