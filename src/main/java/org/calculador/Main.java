package org.calculador;
import java.util.ArrayList;
public class Main {
    ArrayList<Integer> fecha;
    public static void main(String[] args) {
        this.fecha = CalcularEdad.calcular();
        System.out.println({fecha});
    }
}