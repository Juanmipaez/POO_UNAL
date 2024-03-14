package POO_UNAL.Taller_2;
import java.util.Scanner;

public class Ejercicio_resuelto_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Color de la bolita: ");
        String Color = entrada.nextLine().toUpperCase();
        System.out.print("Valor de la compra: ");
        double ValorDeCompra = entrada.nextDouble();
        double PorcentajeDeDescuento;
        double ValorAPagar;
        

        if (Color.equals("BLANCO")){
            PorcentajeDeDescuento = 0;
        }
        else if (Color.equals("VERDE")){
            PorcentajeDeDescuento = 0.1;
        }
        else if (Color.equals("AMARILLO")){
            PorcentajeDeDescuento = 0.25;
        }
        else if (Color.equals("AZUL")){
            PorcentajeDeDescuento = 0.5;
        }
        else{
            PorcentajeDeDescuento = 1;
        }
        ValorAPagar = (1-PorcentajeDeDescuento)*ValorDeCompra;
        System.out.println("El cliente deberá pagar: $ "+ ValorAPagar);
    }
}
