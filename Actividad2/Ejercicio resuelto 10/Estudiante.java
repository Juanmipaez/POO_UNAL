package POO_UNAL.Taller_2.EjercicioResuelto10;

public class Estudiante {
    String NumeroInscripcion,Nombre;
    int Estrato;
    double Patrimonio;
    double PagoDeMatricula = 50000;

    public Estudiante(String NumeroInscripcion,String Nombre, int Estrato, double Patrimonio){
        this.NumeroInscripcion = NumeroInscripcion;
        this.Nombre = Nombre;
        this.Estrato = Estrato;
        this.Patrimonio = Patrimonio;
    }

}
