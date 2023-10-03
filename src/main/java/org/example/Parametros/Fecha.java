// Fecha.java
package org.example.Parametros;

import java.util.List;

public class Fecha{
            List<String> Meses;

        public static void fecha(String mes) {
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        }


    }
}

    public class AnioBisiesto{
        public static Anio(String[] anioB){
            int year=2004;
    public Fecha(){
        System.out.println("Está naciendo una nueva instancia...");
    }
    public static Integer nombreDeMes(String mes){
        String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        for (int i=0; i<meses.length; i++){
            if (mes.equals(meses[i])){
                return i+1;
            }
        }
        return -1;

    }

    public static Integer numeroDeMes(Integer numero){
        Integer[] numMes={1,2, 3, 4, 5,6, 7, 8, 9, 10, 11, 12};
        for (int i=0; i<numMes.length; i++){
            if (numero.equals(numMes[i])){
                return i+1;

            }
        }
        return -1;
    }
        public static  int esBisiesto(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400==0)){
                return 1;
            } else {
                return 0;
            }
        }



=======
    public static Boolean esBisiesto(Integer anio){
        if(anio % 100 == 0 && anio %4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
