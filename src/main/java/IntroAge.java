import java.util.Scanner;
public class IntroAge {
    // Atributos
    Integer diaActual;
    Integer mesActual;
    Integer yearActual;
    Parametres validacionYourYear = new Parametres();
    Parametres validacionYourDay = new Parametres();
    public IntroAge(Integer diaAct, String diaPal, Integer mesAct, Integer anioAct){
        this.diaActual = diaAct;
        this.mesActual = mesAct;


        validacionYourYear.valid = true;
        validacionYourDay.valid = true;
        /*diaActual.dias = 18;
        mesActual.meses = 9;
        yearActual.years = 2023;*/
        System.out.print("Por favor introduce la fecha actual...\nAño actual: ");
        int actualYear = entrada.nextInt();
        System.out.print("Introduce el mes actual: ");
        int actualMonth = entrada.nextInt();
        System.out.print("Introduce el día actual: ");
        int actualDay = entrada.nextInt();
        while (!validacionYourYear.valid){
            System.out.println("Introduce tu año de nacimiento: ");
            int yourYears = entrada.nextInt();
            if ((Object)yourYears instanceof Integer){
                System.out.println("Introduce tu mes de nacimiento: ");
                int yourMonth = entrada.nextInt();
                while (!validacionYourDay.valid){
                    System.out.println("Introduce tu día de nacimiento: ");
                    int yourDay = entrada.nextInt();
                    if ((Object)yourDay instanceof Integer){
                        System.out.println("A partir de aquí ya es chamba del equipo de Calculate");
                        System.out.println("Tu fecha de nacimiento es: " + yourDay + "/" + yourMonth + "/" + yourYears);
                        System.out.println("La fecha actual es: "+ actualDay +"/"+ actualMonth +"/"+ actualYear);
                    }
                    else{
                        validacionYourDay.valid = false;
                    }
                }
            }
            else{
                validacionYourYear.valid = false;

            }


        }

    }
}
