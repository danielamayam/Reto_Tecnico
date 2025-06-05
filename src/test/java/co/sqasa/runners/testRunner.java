package co.sqasa.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = "@RetoEscenarios",
        glue = {"co.sqasa.StepDef", "co.sqasa.StepDef.conf"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class testRunner {
}
