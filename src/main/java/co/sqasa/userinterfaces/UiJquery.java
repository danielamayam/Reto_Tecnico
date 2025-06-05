package co.sqasa.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://jqueryui.com/datepicker/")
public class UiJquery extends PageObject {

    public final static Target IFRAME_FECHA = Target.the("Iframe fecha").located(By.className("demo-frame"));
    public final static Target TXT_FECHA = Target.the("Input fecha").located(By.id("datepicker"));
    public final static Target LBL_DIA_15 = Target.the("Label día 15").locatedBy("//a[@data-date='{0}']");
    public final static Target LBL_TITULO_DATEPICKER = Target.the("Label titulo datepicker").located(By.className("ui-datepicker-title"));
    public final static Target BTN_SIGUIENTE_MES = Target.the("Botón siguiente mes").located(By.xpath("//a[@title=\"Next\"]"));

}
