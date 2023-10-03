package org.example;
import org.example.Parametros.Fecha;

import java.util.ArrayList;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> meses;
        meses = new ArrayList<>();
        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.add("junio");
        meses.add("julio");
        meses.add("agosto");
        meses.add("septiembre");
        meses.add("octubre");
        meses.add("noviembre");
        meses.add("diciembre");

        Scanner entrada = new Scanner(System.in);
        String eleccionmes;
        System.out.println("Escriba el mes de nacimiento: ");
        eleccionmes = entrada.nextLine();
        switch (eleccionmes) {
            case "1" -> System.out.println("Enero");
            case "2" -> System.out.println("Febrero");
            case "3" -> System.out.println("Marzo");
            case "4" -> System.out.println("Abril");
            case "5" -> System.out.println("Mayo");
            case "6" -> System.out.println("Junio");
            case "7" -> System.out.println("Julio");
            case "8" -> System.out.println("Agosto");
            case "9" -> System.out.println("Septiembre");
            case "10" -> System.out.println("Octubre");
            case "11" -> System.out.println("Noviembre");
            case "12" -> System.out.println("Diciembre");
        }
        for (int i = 0; i < meses.size(); i++) {
            //System.out.println(Meses.get(i));
            if (eleccionmes.toLowerCase().equals(meses.get(i))) {
                System.out.println(i + 1);
            }
        }
    }
}
    public static void main(String[] args) {
        String name;
        String mes;
        Integer numero;
        Integer  anio;
        Integer dia;
        System.out.println("Hola, Bienvenido a mi programa");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre de un mes: ");
        mes = sc.nextLine(); // name = input('Escribe tu nombre')
        numero=sc.nextInt();
        //Fecha f = new Fecha();
        if (Fecha.nombreDeMes(mes) != -1) {
            System.out.println("El número de mes correspondiente a " + mes + " es " + Fecha.nombreDeMes(mes));
        } else if (Fecha.numeroDeMes(numero) !=-1){
            System.out.println("El numero" + numero + " corresponde a "+ Fecha.nombreDeMes(mes) );


            System.out.println("No se encontró el nombre del mes " + mes);
            System.exit(0);
        }
        System.out.println("Ingresa un año: ");
        anio = sc.nextInt();
        if (Fecha.esBisiesto(anio) == true){
            System.out.println("El año "+anio+" es Bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }

    }
}