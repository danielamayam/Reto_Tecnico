package co.sqasa.StepDef;

import co.sqasa.questions.ValidarFecha;
import co.sqasa.tasks.AbrirPagina;
import co.sqasa.tasks.EscribirFecha;
import co.sqasa.tasks.SeleccionarFecha;
import co.sqasa.tasks.SeleccionarFechaProxima;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestStepDefinition {

    @Given("El {string} abrio la página principal de JQuery Datepicker")
    public void elUsuarioAbrioLaPaginaPrincipalDeJQueryDatepicker(String actor) {
        theActor(actor).wasAbleTo(
                AbrirPagina.navegar()
        );
    }
    @When("El usuario selecciona la fecha quince del mes actual")
    public void elUsuarioSeleccionaLaFechaDelMesActual() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFecha.go()
        );
    }
    @When("Selecciona el día dies del próximo mes")
    public void seleccionaElDiaDiesDelProximoMes() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFechaProxima.go()
        );
    }
    @When("Escribe la fecha en le campo de texto {string}")
    public void escribeLaFechaEnLeCampoDeTexto(String fecha) {
        theActorInTheSpotlight().attemptsTo(
                EscribirFecha.go()
        );
    }
    @Then("La fecha seleccionada debe aparecer en el campo de texto {string}")
    public void laFechaSeleccionadaDebeAparecerEnElCampoDeTexto(String fecha) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarFecha.go(fecha)
        ));
    }
}
