package org.example.Parametros;

public class Fecha {
    public static void fecha(String mes) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        for (int i = 1; i <= meses.length; i++) {
            if (mes.equals(meses[i - 1])) {
                System.out.println("El mes ingresado es válido.");
                return;
            }
        }
        System.out.println("El mes ingresado no es válido.");
    }
}
