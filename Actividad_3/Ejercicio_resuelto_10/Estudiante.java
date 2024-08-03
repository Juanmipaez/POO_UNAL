package POO_UNAL.Taller_3.EjercicioResuelto10GUI;

public class Estudiante {
    String Nombre;
    int Estrato;
    double NumeroInscripcion, Patrimonio;
    double PagoDeMatricula = 50000;

    public Estudiante(double NumeroInscripcion,String Nombre, int Estrato, double Patrimonio){
        this.NumeroInscripcion = NumeroInscripcion;
        this.Nombre = Nombre;
        this.Estrato = Estrato;
        this.Patrimonio = Patrimonio;
    }

}
