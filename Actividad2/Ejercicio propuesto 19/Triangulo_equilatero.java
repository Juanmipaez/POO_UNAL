package POO_UNAL.Taller_2.EjercicioPropuesto19;

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

    public void MostrarPerimetro(){
        System.out.println("Perimetro Triangulo Equilatero: "+perimetro);
    }

    public void MostrarAltura(){
        System.out.println("Altura Triangulo Equilatero: "+altura);
    }

    public void MostrarArea(){
        System.out.println("Area Triangulo Equilatero: "+area);
    }

}
