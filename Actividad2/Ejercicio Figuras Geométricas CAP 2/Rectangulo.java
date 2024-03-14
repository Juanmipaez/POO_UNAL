package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;

public class Rectangulo {
    double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    double CalcularPerimetro(){
        return ((2*base)+(2*altura));
    }
    double CalcularArea(){
        return (base*altura);
    }
}

