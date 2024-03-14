package POO_UNAL.Taller_2.EjercicioPropuesto21;
import java.util.Scanner;

public class Ejercicio_prop_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor lado 1: ");
        double lado1 = entrada.nextDouble();
        System.out.print("Ingrese valor lado 2: ");
        double lado2 = entrada.nextDouble();
        System.out.print("Ingrese valor lado 3: ");
        double lado3 = entrada.nextDouble();
        Triangulo Triangulo1 = new Triangulo(lado1,lado2,lado3);
        Triangulo1.MostrarSemiperimetro();
        Triangulo1.MostrarPerimetro();
        Triangulo1.MostrarArea();
    }
}
