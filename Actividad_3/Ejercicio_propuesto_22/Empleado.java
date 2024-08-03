package POO_UNAL.Taller_3.EjercicioPropuesto22GUI;

public class Empleado {
    String nombre;
    double horas_trabajadas_al_mes;
    double pago_por_hora_trabajada;


    public Empleado(String nombre, double horas_trabajadas_al_mes, double pago_por_hora_trabajada){
        this.nombre = nombre;
        this.horas_trabajadas_al_mes = horas_trabajadas_al_mes;
        this.pago_por_hora_trabajada = pago_por_hora_trabajada;
    }

    double CalcularSalarioMensual(){
        return horas_trabajadas_al_mes*pago_por_hora_trabajada;
    }

    public String MostrarNombre(){
        return nombre;
    }

}
