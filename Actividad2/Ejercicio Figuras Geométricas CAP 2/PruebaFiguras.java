package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese radio del circulo: ");
        double radio_circulo = entrada.nextDouble();
        System.out.print("Ingrese lado del cuadrado: ");
        double lado_cuadrado = entrada.nextDouble();
        System.out.print("Ingrese base del rectangulo: ");
        double baseRectangulo = entrada.nextDouble();
        System.out.print("Ingrese altura del rectangulo: ");
        double alturaRectangulo = entrada.nextDouble();
        System.out.print("Ingrese base del triangulo rectangulo: ");
        double baseTriangRect = entrada.nextDouble();
        System.out.print("Ingrese altura del triangulo rectangulo: ");
        double altuTrianRect = entrada.nextDouble();
        System.out.print("Ingrese una de las diagonales del rombo: ");
        double diagonal1_rombo = entrada.nextDouble();
        System.out.print("Ingrese uno de los lados del rombo: ");
        double ladoRombo = entrada.nextDouble();
        System.out.print("Ingrese base mayor del trapecio: ");
        double Basemayor = entrada.nextDouble();
        System.out.print("Ingrese base menor del trapecio: ");
        double Basemenor = entrada.nextDouble();
        System.out.print("Ingrese altura del trapecio: ");
        double altura = entrada.nextDouble();
        System.out.println();

        Circulo circulo1 = new Circulo(radio_circulo);
        Cuadrado cuadrado1 = new Cuadrado(lado_cuadrado);
        Rectangulo rectangulo1 = new Rectangulo(baseRectangulo,alturaRectangulo);
        TrianguloRectangulo trianguloRectangulo1 = new TrianguloRectangulo(baseTriangRect,altuTrianRect);
        Rombo rombo1 = new Rombo(diagonal1_rombo, ladoRombo);
        TrapecioIsoceles trapecio1 = new TrapecioIsoceles(altura, Basemayor, Basemenor);

        System.out.println("Perimetro del circulo: "+ circulo1.CalcularPerimetro());
        System.out.println("Area del circulo: "+ circulo1.CalcularArea());
        System.out.println("Perimetro del cuadrado: "+ cuadrado1.CalcularPerimetro());
        System.out.println("Area del cuadrado: "+ cuadrado1.CalcularArea());
        System.out.println("Perimetro del rectangulo: "+ rectangulo1.CalcularPerimetro());
        System.out.println("Area del rectangulo: "+ rectangulo1.CalcularArea());
        System.out.println("Area del triangulo-rectangulo: "+ trianguloRectangulo1.CalcularArea());
        System.out.println("Perimetro del triangulo-rectangulo: "+ trianguloRectangulo1.CalcularPerimetro());
        trianguloRectangulo1.TipoTriangulo();
        System.out.println("Area del rombo: "+ rombo1.CalcularArea());
        System.out.println("Perimetro del rombo: "+ rombo1.CalcularPerimetro());
        System.out.println("Area del trapecio: "+ trapecio1.CalcularArea());
        System.out.println("Perimetro del trapecio: "+ trapecio1.CalcularPerimetro());
        
    }
}
