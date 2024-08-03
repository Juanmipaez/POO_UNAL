package POO_UNAL.Taller_3.EjercicioPropuesto19GUI;

public class Triangulo_equilatero {
    private double lado;
    private double perimetro;
    private double altura;
    private double area;

    public Triangulo_equilatero(double lado){
        this.lado = lado;
        this.perimetro = 3*lado;
        this.altura = (Math.sqrt(3)*lado)/2;
        this.area=(lado*altura)/2;
    }

    public double MostrarPerimetro(){
        return perimetro;
    }

    public double MostrarAltura(){
        return altura;
    }

    public double MostrarArea(){
        return area;
    }

}
