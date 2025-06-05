package co.sqasa.tasks;

import co.sqasa.interactions.SwichTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqasa.userinterfaces.UiJquery.*;

public class SeleccionarFechaProxima implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwichTo.iframe(IFRAME_FECHA),
                Click.on(TXT_FECHA),
                WaitUntil.the(LBL_TITULO_DATEPICKER, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds(),
                Click.on(BTN_SIGUIENTE_MES),
                WaitUntil.the(LBL_DIA_15.of("10"), WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds(),
                Click.on(LBL_DIA_15.of("10"))
        );

        String fecha = TXT_FECHA.resolveFor(actor).getValue();
        actor.remember("fecha", fecha);
    }

    public static SeleccionarFechaProxima go(){
        return Tasks.instrumented(SeleccionarFechaProxima.class);
    }
}
