import java.util.Scanner;
public class IntroAge {
    public static void main(String[]args){
        Parametres diaActual = new Parametres();
        Parametres mesActual = new Parametres();
        Parametres yearActual = new Parametres();
        Parametres validacionYourYear = new Parametres();
        Parametres validacionYourDay = new Parametres();
        Scanner entrada = new Scanner(System.in);

        validacionYourYear.valid = true;
        validacionYourDay.valid = true;
        diaActual.dias = 18;
        mesActual.meses = 9;
        yearActual.years = 2023;
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
                        System.out.println("La fecha actual es: "+ diaActual.dias +"/"+ mesActual.meses +"/"+ yearActual.years);
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
