package org.example.Parametros;

public class Fecha {
    public static void fecha(String mes) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        for (int i = 1; 1 = n; i++) {

        }

    }
}

public class AnioBisiesto{
        public static Anio(String[] anioB){
            int year=2004;

            int resultado = esBisiesto(year);

            if (resultado ==1) {
                System.out.println(year + "es un año bisiesto");
            } else {
                System.out.prinln(year + "no es un año bisiesto");
            }
        }

        public static  int esBisiesto(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400==0)){
                return 1;
            } else {
                return 0;
            }

}



