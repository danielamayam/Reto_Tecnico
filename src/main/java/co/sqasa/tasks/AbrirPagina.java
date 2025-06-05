package co.sqasa.tasks;

import co.sqasa.userinterfaces.UiJquery;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private UiJquery uiJquery;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(uiJquery)
        );
    }

    public static AbrirPagina navegar() {
        return Tasks.instrumented(AbrirPagina.class);
    }
}
