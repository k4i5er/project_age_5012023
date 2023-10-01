package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        Scanner entrada=new Scanner(System.in);
        String eleccionmes;
        System.out.println("Escriba el mes de nacimiento: ");
        eleccionmes=entrada.nextLine();

        for (int i = 0; i < meses.size(); i++) {
            //System.out.println(Meses.get(i));
            if (eleccionmes.toLowerCase().equals(meses.get(i))) {
                System.out.println(i+1);

            }
        }
    }
}
