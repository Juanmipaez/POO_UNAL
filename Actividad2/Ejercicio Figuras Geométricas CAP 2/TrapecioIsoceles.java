package POO_UNAL.Taller_2.Figuras_geometricas_Cap2;

public class TrapecioIsoceles {
    double altura;
    double BaseMayor, BaseMenor;


    public TrapecioIsoceles( double altura, double BaseMayor, double BaseMenor){
        this.altura = altura;
        this.BaseMayor = BaseMayor;
        this.BaseMenor = BaseMenor;
    }

    double CalcularLado(){
        double lado = Math.sqrt( Math.pow(Math.abs(BaseMayor-BaseMenor)/2,2) + (altura*altura) );
        return lado; 
    }

    double CalcularArea(){
        return (0.5*(BaseMayor+BaseMenor)*altura);
    }
    
    double CalcularPerimetro(){
        return (2*CalcularLado())+BaseMayor+BaseMenor;
    }

}
