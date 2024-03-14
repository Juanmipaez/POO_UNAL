package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;

public class TrianguloRectangulo{
    double base, altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double CalcularArea() {
        return (base * altura / 2);
    }

    double CalcularHipotenusa(){
        return (Math.sqrt( (base*base)+(altura*altura) ) );
    }

    double CalcularPerimetro() {
        return (base + altura + CalcularHipotenusa());
    }

    public void TipoTriangulo(){
        if (base==altura && base==CalcularHipotenusa()){
            System.out.println("Es un triángulo equilatero");
        }
        else if(base!=altura && altura!=CalcularHipotenusa() && base!=CalcularHipotenusa()){
            System.out.println("Es un triángulo escaleno");
        }
        else{
            System.out.println("Es un triángulo isóceles");
        }
    }

}