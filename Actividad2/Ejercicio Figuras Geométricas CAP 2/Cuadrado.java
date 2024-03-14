package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;

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

