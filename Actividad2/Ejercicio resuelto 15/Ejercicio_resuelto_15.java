package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_resuelto_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Peso bola A: ");
        double PesoBolaA = entrada.nextDouble();
        System.out.print("Peso bola B: ");
        double PesoBolaB = entrada.nextDouble();
        System.out.print("Peso bola C: ");
        double PesoBolaC = entrada.nextDouble();
        System.out.print("Peso bola D: ");
        double PesoBolaD = entrada.nextDouble();
        
        if (PesoBolaA!=PesoBolaB && PesoBolaB==PesoBolaC){
            if (PesoBolaA<PesoBolaB){
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
            else{
                System.out.println("La esfera A es la diferente y es de mayor peso");
            }
        }

        else if (PesoBolaA!=PesoBolaB && PesoBolaA==PesoBolaC){
            if (PesoBolaA<PesoBolaB){
                System.out.println("La esfera B es la diferente y es de mayor peso");
            }
            else{
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        }

        else if (PesoBolaA==PesoBolaB && PesoBolaA!=PesoBolaC){
            if (PesoBolaC<PesoBolaB){
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
            else{
                System.out.println("La esfera C es la diferente y es de mayor peso");
            }
        }

        else if (PesoBolaA==PesoBolaB && PesoBolaA!=PesoBolaD){
            if (PesoBolaD<PesoBolaB){
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
            else{
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }
        }
    }
}
