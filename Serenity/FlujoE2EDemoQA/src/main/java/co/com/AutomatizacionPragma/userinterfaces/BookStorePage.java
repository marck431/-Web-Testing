package co.com.AutomatizacionPragma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BookStorePage {
    public static Target BTN_BOOKSTORE = Target.the("Ingresar al login").locatedBy("//button[@id='{0}']");
    public static Target BTN_BOOKSTORE_TEXT = Target.the("Ingresar al login").locatedBy("//button[contains(text(),'{0}')]");
    public static Target LIBROS = Target.the("Libros del BookStore").locatedBy("//a[contains(text(),'{0}')]");
    public static Target INPUTS_BOOKSTORE = Target.the("Inputs del BookStore").locatedBy("//input[@id='{0}']");

}
