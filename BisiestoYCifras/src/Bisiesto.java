import java.util.Scanner;
 
public class Bisiesto {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
 
        // Pido el año
        System.out.println("Introduce un año");
        int anio = sn.nextInt();
 
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
 
    }
 
}