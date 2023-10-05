package org.calculador;
import java.util.ArrayList;
public class CalcularEdad {
    ArrayList<Integer> tiempoPasado;

    public ArrayList<Integer> calcular(Integer diaActual, Integer mesActual, Integer yearActual, Integer yourDay, Integer yourMonth, Integer yourYear,
                                       Integer diasPasados, Integer mesesPasados, Integer yearsPasados, Integer buleano) {

        diaActual = 21;
        mesActual = 9;
        yearActual = 2023;
        yourDay = 12;
        yourMonth = 7;
        yourYear = 2003;
        buleano = 1;

        if (mesActual > yourMonth || mesActual == yourMonth && diaActual > yourDay) {
            yearsPasados = yearActual - yourYear;
            mesesPasados = mesActual - yourMonth;
            diasPasados = diaActual - yourDay;
            this.tiempoPasado.add(yearsPasados);
            this.tiempoPasado.add(mesesPasados);
            this.tiempoPasado.add(diasPasados);
            return tiempoPasado;
        }
        else{
            yearsPasados = yearActual - yourYear - 1;
            mesesPasados = 12 - (yourMonth - mesActual);
            this.tiempoPasado.add(yearsPasados);
            this.tiempoPasado.add(mesesPasados);
            if (yourMonth == 1 || yourMonth == 3 || yourMonth == 5 || yourMonth == 7 || yourMonth == 8 || yourMonth == 10 || yourMonth == 12){
                diasPasados = 31 - (diaActual - yourDay);
                this.tiempoPasado.add(diasPasados);
                return tiempoPasado;
            }
            else if (yourMonth == 2){
                if (buleano == 1){
                    diasPasados = 29 - (diaActual - yourDay);
                    this.tiempoPasado.add(diasPasados);
                    return tiempoPasado;
                }
                else{
                    diasPasados = 28 - (diaActual - yourDay);
                    this.tiempoPasado.add(diasPasados);
                    return tiempoPasado;
                }
            }
            else{
                diasPasados = 30 - (diaActual - yourDay);
                this.tiempoPasado.add(diasPasados);
                return tiempoPasado;
            }
        }
    }
}