// Fecha.java
package org.example.Parametros;

public class Fecha{
    public Fecha(){
        System.out.println("Está naciendo una nueva instancia...");
    }
<<<<<<< HEAD
    public static Integer nombreDeMes(String mes){
        String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        for (int i=0; i<meses.length; i++){
            if (mes.equals(meses[i])){
                return i+1;
            }
        }
        return -1;

    }


=======
    public static Integer nombreDeMes(String mes) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                return i + 1;
            }
        }
        return -1;
    }
>>>>>>> 6d606d2d64df1c5735f5ab6b19497cc007db56ec
    public static Boolean esBisiesto(Integer anio){
        return anio % 100 == 0 && anio % 4 == 0;
    }
<<<<<<< HEAD
}
=======
 }
>>>>>>> 6d606d2d64df1c5735f5ab6b19497cc007db56ec
