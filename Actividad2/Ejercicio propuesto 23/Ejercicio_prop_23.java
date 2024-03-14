package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_prop_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar valor A: ");
        double ValorA = entrada.nextDouble();
        System.out.print("Ingresar valor B: ");
        double ValorB = entrada.nextDouble();
        System.out.print("Ingresar valor C: ");
        double ValorC = entrada.nextDouble();

        double determinante = (ValorB*ValorB) - (4*ValorA*ValorC);

        if (determinante<0){
            System.out.println("La ecuación de segundo grado no tiene solución en los numéros reales");
        }
        else{
            double solucion1 = (-1*ValorB + Math.sqrt(determinante))/(2*ValorA);
            System.out.println("Solución 1: "+solucion1);
            double solucion2 = (-1*ValorB - Math.sqrt(determinante))/(2*ValorA);
            System.out.println("Solución 1: "+solucion2);
        }
    }
}
