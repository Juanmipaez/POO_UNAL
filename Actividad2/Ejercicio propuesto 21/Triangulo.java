package POO_UNAL.Taller_2.EjercicioPropuesto21;

public class Triangulo {
    private double lado1,lado2,lado3;
    private double semiperimetro;
    private double area;
    private double perimetro;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.perimetro = lado1+lado2+lado3;
        this.semiperimetro = perimetro/2;
        this.area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
    }

    public void MostrarSemiperimetro(){
        System.out.println("Semiperimetro Triangulo: "+semiperimetro);
    }

    public void MostrarPerimetro(){
        System.out.println("Perimetro Triangulo: "+perimetro);
    }

    public void MostrarArea(){
        System.out.println("Area Triangulo: "+area);
    }

}
