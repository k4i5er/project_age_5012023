package org.example;
import org.example.Parametros.Fecha;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        String mes;
        Integer numero;
        int  anio;
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
        if (Fecha.esBisiesto(anio)){
            System.out.println("El año "+anio+" es Bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }

    }
}