package POO_UNAL.Taller_3.FigurasGeometricasGUI;

public class Rombo {
    double DiagonalA;
    double Lado;

    public Rombo(double DiagonalA, double Lado){
        this.DiagonalA = DiagonalA;
        this.Lado = Lado;
    }

    double CalcularDiagonalB(){
        return Math.sqrt( (4*Lado*Lado) - (DiagonalA*DiagonalA) );
    }

    double CalcularArea(){
        return ((DiagonalA*CalcularDiagonalB())/2);
    }

    double CalcularPerimetro(){
        return 4*Lado;
    }
    
}
