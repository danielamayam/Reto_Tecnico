package co.sqasa.tasks;

import co.sqasa.interactions.SwichTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqasa.userinterfaces.UiJquery.*;


public class SeleccionarFecha implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwichTo.iframe(IFRAME_FECHA),
                Click.on(TXT_FECHA),
                WaitUntil.the(LBL_DIA_15.of("15"), WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds(),
                Click.on(LBL_DIA_15.of("15"))
        );
        String fecha = TXT_FECHA.resolveFor(actor).getValue();
        actor.remember("fecha", fecha);
    }

    public static SeleccionarFecha go(){
        return Tasks.instrumented(SeleccionarFecha.class);
    }
}
