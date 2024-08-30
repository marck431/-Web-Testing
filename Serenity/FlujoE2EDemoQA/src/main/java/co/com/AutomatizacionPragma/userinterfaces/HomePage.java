package co.com.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static Target OPCION_HOME = Target.the("opciones para escoger").locatedBy("//div[@class='card mt-4 top-card' and contains(.,'{0}')]");
}
