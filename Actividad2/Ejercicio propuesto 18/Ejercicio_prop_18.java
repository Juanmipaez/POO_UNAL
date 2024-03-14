package POO_UNAL.Taller_2.EjercicioPropuesto18;
import java.util.Scanner;

public class Ejercicio_prop_18 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombres del empleado: ");
        String nombres = entrada.nextLine();
        System.out.print("Ingrese codigo del empleado: ");
        String codigo_empleado = entrada.nextLine();
        System.out.print("Ingrese numero de horas trabajadas en el mes: ");
        double horas_trabajadas_al_mes = entrada.nextDouble();
        System.out.print("Ingrese pago por hora trabajada: ");
        double pago_por_hora_trabajada = entrada.nextDouble();
        System.out.print("Ingrese porcentaje de retencion en la fuente: ");
        double porcentaje_retencion_en_la_fuente = entrada.nextDouble();
        System.out.println();


        Empleado Empleado1 = new Empleado(nombres, codigo_empleado,horas_trabajadas_al_mes, pago_por_hora_trabajada, porcentaje_retencion_en_la_fuente);
        Empleado1.MostrarCodigo();
        Empleado1.MostrarNombres();
        Empleado1.MostrarSalarioBruto();
        Empleado1.MostrarSalarioNeto();
    }
}
