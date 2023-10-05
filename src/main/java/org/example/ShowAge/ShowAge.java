package org.example.ShowAge;

import java.util.ArrayList;
import java.util.List;

public class ShowAge {
    List<String> lista_meses = new ArrayList<>() { {add("enero");add("febrero");add("marzo");add("abril");add("mayo");add("junio");add("julio");add("agosto");add("septiembre");add("octubre");add("noviembre");add("diciembre");} };
    public ShowAge(Integer diaActual, Integer mesActual, Integer yearActual, Integer yourDay, Integer yourMonth, Integer yourYear, Integer diasPasados, Integer mesesPasados, Integer yearsPasados){
        Fecha actual = new Fecha();
        actual.dias = diaActual;
        actual.meses = mesActual;
        actual.years = yearActual;
        Fecha nacimiento = new Fecha();
        nacimiento.dias = yourDay;
        nacimiento.meses = yourMonth;
        nacimiento.years = yourYear;
        Fecha pasado = new Fecha();
        pasado.dias = diasPasados;
        pasado.meses = mesesPasados;
        pasado.years = yearsPasados;
        System.out.println("La fecha de hoy es: " + actual.dias + " de " + lista_meses.get(actual.meses-1) + " de " + actual.years);
        System.out.println("Tu fecha de nacimiento es: " + nacimiento.dias + " de " + lista_meses.get(nacimiento.meses-1) + " de " + nacimiento.years);
        System.out.println("Han pasado " + pasado.years + " años, " + pasado.meses + " meses y " + pasado.dias + " días entre las dos fechas.");
    }
}