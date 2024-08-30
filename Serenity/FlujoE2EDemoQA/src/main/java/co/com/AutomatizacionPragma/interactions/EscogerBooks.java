package co.com.AutomatizacionPragma.interactions;

import co.com.AutomatizacionPragma.models.InformacionBooks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutomatizacionPragma.userinterfaces.BookStorePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class EscogerBooks implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<InformacionBooks> books = actor.recall("books");
        for (int i = 0; i < 1; i++) {
            String booksEscoger = books.get(i).getTitle();
            System.out.println(books.get(i).getTitle());
            actor.attemptsTo(
                    WaitUntil.the(LIBROS.of(booksEscoger), isPresent()).forNoMoreThan(5).seconds(),
                    Scroll.to(LIBROS.of(booksEscoger)),
                    JavaScriptClick.on(LIBROS.of(booksEscoger))
            );
            actor.attemptsTo(
                    WaitUntil.the(BTN_BOOKSTORE_TEXT.of("Add To Your Collection"), isPresent()).forNoMoreThan(5).seconds(),
                    Scroll.to(BTN_BOOKSTORE_TEXT.of("Add To Your Collection")),
                    JavaScriptClick.on(BTN_BOOKSTORE_TEXT.of("Add To Your Collection"))
            );

                  ModalAlert.aceptar();
        }
    }
}
