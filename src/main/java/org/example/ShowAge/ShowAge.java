package org.example.ShowAge;

import java.util.ArrayList;
import java.util.List;

public class ShowAge {
    public static void main(String[] args){
        Parametres DiaActual = new Parametres();
        Parametres MesActual = new Parametres();
        Parametres YearActual = new Parametres();
        Parametres yourDay = new Parametres();
        Parametres yourMonth = new Parametres();
        Parametres yourYear = new Parametres();
        Parametres DiasPasados = new Parametres();
        Parametres MesesPasados = new Parametres();
        Parametres YearsPasados = new Parametres();

        DiaActual.dias = 28;
        MesActual.meses = 9;
        YearActual.years = 2023;
        yourDay.dias = 14;
        yourMonth.meses = 6;
        yourYear.years = 2000;
        DiasPasados.dias = 14;
        MesesPasados.meses = 3;
        YearsPasados.years = 23;
        // Valores de prueba, se van a borrar una vez que se junten todos los programas.
        List<String> lista = new ArrayList<>() { {
            add("enero");
            add("febrero");
            add("marzo");
            add("abril");
            add("mayo");
            add("junio");
            add("julio");
            add("agosto");
            add("septiembre");
            add("octubre");
            add("noviembre");
            add("diciembre");
        } };

        System.out.println("La fecha de hoy es: " + DiaActual.dias + " de " + lista.get(MesActual.meses-1) + " de " + YearActual.years);
        System.out.println("La fecha que ingresaste es: " + yourDay.dias + " de " + lista.get(yourMonth.meses-1) + " de " + yourYear.years);
        System.out.println("Han pasado " + YearsPasados.years + " años, " + MesesPasados.meses + " meses y " + DiasPasados.dias + " días entre las dos fechas.");
    }
}
