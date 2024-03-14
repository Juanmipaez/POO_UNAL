package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_resuelto_14 {
    public static void main(String[] args) {

        double VentasD1, VentasD2, VentasD3;
        double SalarioBase, SalarioD1, SalarioD2, SalarioD3, VentasTotales;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ventas Dpto 1: ");
        VentasD1 = entrada.nextDouble();
        System.out.print("Ventas Dpto 2: ");
        VentasD2 = entrada.nextDouble();
        System.out.print("Ventas Dpto 3: ");
        VentasD3 = entrada.nextDouble();
        System.out.print("Salario base: ");
        SalarioBase = entrada.nextDouble();
        VentasTotales = (VentasD1+VentasD2+VentasD3);

        SalarioD1 = (VentasD1>(VentasTotales*0.33)) ? SalarioBase*1.2 : SalarioBase;
        SalarioD2 = (VentasD2>(VentasTotales*0.33)) ? SalarioBase*1.2 : SalarioBase;
        SalarioD3 = (VentasD3>(VentasTotales*0.33)) ? SalarioBase*1.2 : SalarioBase;

        System.out.println("Salario vendedores Dpto 1: $"+SalarioD1);
        System.out.println("Salario vendedores Dpto 2: $"+SalarioD2);
        System.out.println("Salario vendedores Dpto 3: $"+SalarioD3);
    }
}
