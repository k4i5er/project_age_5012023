// Fecha.java
package org.example.Parametros;

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


    public static Boolean esBisiesto(Integer anio){
        return anio % 100 == 0 && anio % 4 == 0;
    }
}
