package POO_UNAL.Taller_2.EjercicioPropuesto22;
import java.util.Scanner;

public class Ejercicio_prop_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar nombre del empleado: ");
        String NombreEmpleado = entrada.nextLine();
        System.out.print("Ingresar salario por hora: ");
        double SalarioPorHora = entrada.nextDouble();
        System.out.print("Ingresar numero de horas trabajadas en el mes: ");
        double HorasTrabajadasMensual = entrada.nextDouble();

        Empleado empleado1 = new Empleado(NombreEmpleado,HorasTrabajadasMensual,SalarioPorHora);
        
        if (empleado1.CalcularSalarioMensual() > 450000){
            System.out.println("El empleado "+empleado1.nombre+" tuvo un sueldo este mes de: $"+empleado1.CalcularSalarioMensual());
        }
        else{
            System.out.println("El empleado se llama "+empleado1.nombre);
        }
        
    }
}
