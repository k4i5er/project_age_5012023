package org.example;
import org.example.Parametros.Fecha;

import java.util.Scanner;


import org.example.ShowAge.ShowAge;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        /*
            Proyecto:
            Elaborar un programa que pida la edad al usuario
            en años, meses y días, así como su fecha de nacimiento
            en años, meses y días y devuelva su edad en esos mismos
            términos
         */
<<<<<<< HEAD

=======
        new ShowAge(3,10,2023,14,6,2000,13,3,23);
        }
>>>>>>> features/show_age
    }
=======
        String name;
        String mes;
        Integer numero;
        Integer  anio;
        Integer dia;
        System.out.println("Hola, Bienvenido a mi programa");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre de un mes: ");
        mes = sc.nextLine(); // name = input('Escribe tu nombre')
        //numero=sc.nextInt();
        //Fecha f = new Fecha();
        if (Fecha.nombreDeMes(mes) != -1) {
            System.out.println("El número de mes correspondiente a " + mes + " es " + Fecha.nombreDeMes(mes));
        } else {
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
>>>>>>> features/validate_input_data
