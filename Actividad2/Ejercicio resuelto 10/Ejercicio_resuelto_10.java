package POO_UNAL.Taller_2.EjercicioResuelto10;
import java.util.Scanner;

public class Ejercicio_resuelto_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de inscripcion: ");
        String NumeroInscripcion = entrada.nextLine();
        System.out.print("Nombre: ");
        String Nombre = entrada.nextLine();
        System.out.print("Estrato: ");
        int Estrato = entrada.nextInt();
        System.out.print("Patrimonio: ");
        double Patrimonio = entrada.nextDouble();
        
        Estudiante Estudiante1 = new Estudiante(NumeroInscripcion, Nombre, Estrato, Patrimonio);

        if (Patrimonio>2000000 && Estrato>3){
            Estudiante1.PagoDeMatricula += 0.03*Patrimonio; 
        }
        System.out.println("El estudiante con numero de inscripcion "+Estudiante1.NumeroInscripcion+" y nombre "+Estudiante1.Nombre+" debera pagar "+Estudiante1.PagoDeMatricula);
    }
}
