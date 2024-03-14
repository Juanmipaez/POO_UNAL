package POO_UNAL.Taller_2.EjercicioPropuesto19;
import java.util.Scanner;

public class Ejercicio_prop_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese longitud lado del triangulo: ");
        double lado = entrada.nextDouble();
        Triangulo_equilatero Triangulo1 = new Triangulo_equilatero(lado);
        Triangulo1.MostrarPerimetro();
        Triangulo1.MostrarAltura();
        Triangulo1.MostrarArea();
    }
}
