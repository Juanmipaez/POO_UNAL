package POO_UNAL.Taller_3.FigurasGeometricasGUI;

public class Cuadrado {
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    double CalcularPerimetro(){
        return (4*lado);
    }
    double CalcularArea(){
        return (lado*lado);
    }
}

