package POO_UNAL.Taller_2.EjercicioResuelto12;
import java.util.Scanner;

public class Ejercicio_resuelto_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese numero horas trabajadas: ");
        double HorasTrabajadas = entrada.nextDouble();
        System.out.print("Ingrese valor por hora normal: ");
        double ValorHoraNormal = entrada.nextDouble();
        
        Trabajador Trabajador1 = new Trabajador(nombre, HorasTrabajadas, ValorHoraNormal);
        System.out.println("El trabajador "+ Trabajador1.Nombre+" devengó: $"+Trabajador1.Salario());
    }
}
