// Fecha.java
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
public class Fecha{
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

    public static Boolean esBisiesto(Integer anio){
        if(anio % 100 == 0 && anio %4 == 0){
            return true;
        } else {
            return false;
        }
    }
}

