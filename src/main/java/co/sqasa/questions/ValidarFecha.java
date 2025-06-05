package co.sqasa.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarFecha implements Question<Boolean> {
    private String fecha;

    public  ValidarFecha(String fecha){
        this.fecha = fecha;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String fechaWeb = actor.recall("fecha");
        return fechaWeb.contains(fecha);
    }

    public static ValidarFecha go(String fecha){
        return new ValidarFecha(fecha);
    }
}
