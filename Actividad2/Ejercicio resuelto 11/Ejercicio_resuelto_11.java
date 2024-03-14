package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_resuelto_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        System.out.print("Ingrese numero 1: ");
        int Numero1 = entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        int Numero2 = entrada.nextInt();
        System.out.print("Ingrese numero 3: ");
        int Numero3 = entrada.nextInt();

        if(Numero1>Numero2 && Numero2>Numero3){
            System.out.println("El mayor entre "+Numero1+", "+Numero2+" y "+Numero3+" es "+Numero1);
        }
        else if(Numero2>Numero1 && Numero2>Numero3){
            System.out.println("El mayor entre "+Numero1+", "+Numero2+" y "+Numero3+" es "+Numero2);
        }
        else if(Numero3>Numero2 && Numero3>Numero1){
            System.out.println("El mayor entre "+Numero1+", "+Numero2+" y "+Numero3+" es "+Numero3);
        }
    }

}
