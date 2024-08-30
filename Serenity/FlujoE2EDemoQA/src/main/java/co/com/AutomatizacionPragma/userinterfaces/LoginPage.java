package co.com.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static Target INPUTS_LOGIN = Target.the("Inputs del login").locatedBy("//input[@id='{0}']");
    public static Target BTN_LOGIN = Target.the("btn del login").locatedBy("//button[@id='{0}']");
    public static final Target LBL_NO_LOGUEADO = Target.the("label Invalid username or password").located(By.xpath("//p[contains(text(),'Invalid username or password')]"));
    public static Target LBL_LOGUEADO = Target.the("label de logeado").locatedBy("//label[contains(text(),'{0}')]");
}
