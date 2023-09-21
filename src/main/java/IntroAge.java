import java.util.Scanner;
public class IntroAge {
    public static void main(String[]args){
        Parametres diaActual = new Parametres();
        Parametres mesActual = new Parametres();
        Parametres yearActual = new Parametres();
        Parametres validacion = new Parametres();
        Scanner entrada = new Scanner(System.in);

        validacion.valid = true;
        diaActual.dias = 18;
        mesActual.meses = 9;
        yearActual.years = 2023;
        while (!validacion.valid){
            System.out.println("Introduce tu año de nacimiento: ");
            int yourYears = entrada.nextInt();
            if (typeof yourYears == 'string'){
                validacion.valid = false;
            }
            else{
                System.out.println("Introduce tu mes de nacimiento: ");
                int yourMonth = entrada.nextInt();
                if (yourMonth == String){
                    validacion.valid = false;
                }
                else{
                    System.out.println("Introduce tu día de nacimiento: ");
                    int yourDay = entrada.nextInt();
                    if (yourDay)
                }
            }


        }


        System.out.println("Tu fecha de nacimiento es: " + yourDay + "/" + yourMonth + "/" + yourYears);
        System.out.println("La fecha actual es: "+ diaActual.dias +"/"+ mesActual.meses +"/"+ yearActual.years);
    }
}
