package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_resuelto_7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese numero A: ");
        double NumeroA = entrada.nextDouble();
        System.out.print("Ingrese numero B: ");
        double NumeroB = entrada.nextDouble();

        if(NumeroA>NumeroB){
            System.out.println("A es mayor que B");
        }
        else if(NumeroA==NumeroB){
            System.out.println("A es igual a B");
        }
        else{
            System.out.println("A es menor que B");
        }   
    }
}
