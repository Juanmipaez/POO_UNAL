package POO_UNAL.Taller_2.EjercicioPropuesto24;

import java.util.Scanner;

public class Ejercicio_prop_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        System.out.print("Ingrese peso esfera 1: ");
        double PesoEsfera1 = entrada.nextDouble();
        System.out.print("Ingrese peso esfera 2: ");
        double PesoEsfera2 = entrada.nextDouble();
        System.out.print("Ingrese peso esfera 3: ");
        double PesoEsfera3 = entrada.nextDouble();

        Esferas esfera1 = new Esferas(PesoEsfera1);
        Esferas esfera2 = new Esferas(PesoEsfera2);
        Esferas esfera3 = new Esferas(PesoEsfera3);

        if(esfera1.peso>esfera2.peso && esfera2.peso>esfera3.peso){
            System.out.println("La esfera con mayor peso es: Esfera1. Peso: "+esfera1.peso);
        }
        else if(esfera2.peso>esfera1.peso && esfera2.peso>esfera3.peso){
            System.out.println("La esfera con mayor peso es: Esfera2. Peso: "+esfera2.peso);
        }
        else if(esfera3.peso>esfera2.peso && esfera3.peso>esfera1.peso){
            System.out.println("La esfera con mayor peso es: Esfera3. Peso: "+esfera3.peso);
        }
        
    }
}
