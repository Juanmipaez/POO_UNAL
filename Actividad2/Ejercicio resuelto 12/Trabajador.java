package POO_UNAL.Taller_2.EjercicioResuelto12;

public class Trabajador {
    String Nombre;
    double NumeroHorasTrabajadas, ValorHoraNormal;

    public Trabajador(String Nombre, double NumeroHorasTrabajadas, double ValorHoraNormal){
        this.Nombre = Nombre;
        this.NumeroHorasTrabajadas = NumeroHorasTrabajadas;
        this.ValorHoraNormal = ValorHoraNormal;
    }

    public double Salario(){
        if (NumeroHorasTrabajadas<40){
            return NumeroHorasTrabajadas*ValorHoraNormal;
        }
        else if (40<=NumeroHorasTrabajadas && NumeroHorasTrabajadas<=48){
            return 40*ValorHoraNormal + 2*ValorHoraNormal*(NumeroHorasTrabajadas-40);
        }
        else{
            return 40*ValorHoraNormal + 2*ValorHoraNormal*8 + 3*ValorHoraNormal*(NumeroHorasTrabajadas-48);
        }
    }
}
