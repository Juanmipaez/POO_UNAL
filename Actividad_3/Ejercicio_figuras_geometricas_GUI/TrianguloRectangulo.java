package POO_UNAL.Taller_3.FigurasGeometricasGUI;

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

    String TipoTriangulo(){
        if (base==altura && base==CalcularHipotenusa()){
            return"Es un triángulo equilatero";
        }
        else if(base!=altura && altura!=CalcularHipotenusa() && base!=CalcularHipotenusa()){
            return "Es un triángulo escaleno";
        }
        else{
            return "Es un triángulo isóceles";
        }
    }

}