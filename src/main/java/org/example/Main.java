package org.example;
import org.example.Parametros.Fecha;
import org.IntroAge;
import java.util.Scanner;


import org.example.ShowAge.ShowAge;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Variables locales
        Integer diaA;
        // Ingresar los datos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el día actual: ");
        diaA = entrada.nextInt();
        IntroAge newData = new IntroAge(diaA);
    }
}
