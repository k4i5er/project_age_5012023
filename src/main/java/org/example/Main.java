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
@@ -17,14 +35,11 @@ public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el nombre de un mes: ");
        mes = sc.nextLine(); // name = input('Escribe tu nombre')
        numero=sc.nextInt();
        //numero=sc.nextInt();
        //Fecha f = new Fecha();
        if (Fecha.nombreDeMes(mes) != -1) {
        System.out.println("El número de mes correspondiente a " + mes + " es " + Fecha.nombreDeMes(mes));
        } else if (Fecha.numeroDeMes(numero) !=-1){
        System.out.println("El numero" + numero + " corresponde a "+ Fecha.nombreDeMes(mes) );


        } else {
        System.out.println("No se encontró el nombre del mes " + mes);
        System.exit(0);
        }
@@ -37,4 +52,5 @@ public static void main(String[] args) {
        }

        }
        }
        }
        >>>>>>> features/validate_input_data