package org.example.Parametros;

public class AnioBisiesto {
    public static void main(String[] args) {
        int year = 2004;
        int resultado = esBisiesto(year);

        if (resultado == 1) {
            System.out.println(year + " es un año bisiesto");

        } else {
            System.out.println(year + " no es un año bisiesto");
        }
    }

    public static int esBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
