package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;

public class Circulo {
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    double CalcularPerimetro(){
        return (2*Math.PI*radio);
    }
    double CalcularArea(){
        return (Math.PI*Math.pow(radio,2));
    }
}
