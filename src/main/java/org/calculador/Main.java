package org.calculador;
import java.util.ArrayList;
public class Main {
    static ArrayList<Integer> fecha;
    public static void main(String[] args) {

        fecha = CalcularEdad.calcular();
        System.out.println(fecha);
    }
}