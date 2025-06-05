package co.sqasa.tasks;

import co.sqasa.interactions.SwichTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.userinterfaces.UiJquery.IFRAME_FECHA;
import static co.sqasa.userinterfaces.UiJquery.TXT_FECHA;

public class EscribirFecha implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwichTo.iframe(IFRAME_FECHA),
                Enter.theValue("").into(TXT_FECHA)
        );
        String fecha = TXT_FECHA.resolveFor(actor).getValue();
        actor.remember("fecha", fecha);
    }

    public static EscribirFecha go(){
        return Tasks.instrumented(EscribirFecha.class);
    }
}
