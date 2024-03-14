package POO_UNAL.Taller_2.EjercicioPropuesto18;

public class Empleado {
    private String nombres;
    private String codigo_empleado;
    private double horas_trabajadas_al_mes;
    private double pago_por_hora_trabajada;
    private double porcentaje_retencion_en_la_fuente;
    private double salario_bruto;
    private double salario_neto;

    public Empleado(String nombres, String codigo_empleado, double horas_trabajadas_al_mes, double pago_por_hora_trabajada, double porcentaje_retencion_en_la_fuente){
        this.nombres = nombres;
        this.codigo_empleado = codigo_empleado;
        this.horas_trabajadas_al_mes = horas_trabajadas_al_mes;
        this.pago_por_hora_trabajada = pago_por_hora_trabajada;
        this.porcentaje_retencion_en_la_fuente = porcentaje_retencion_en_la_fuente;
        this.salario_bruto = horas_trabajadas_al_mes*pago_por_hora_trabajada;
        this.salario_neto = salario_bruto - ((porcentaje_retencion_en_la_fuente*salario_bruto)/100);
    }


    public void MostrarCodigo(){
        System.out.println("Codigo del empleado: "+ codigo_empleado);
    }

    public void MostrarNombres(){
        System.out.println("Nombres del empleado: "+ nombres);
    }

    public void MostrarSalarioBruto(){
        System.out.println("Salario Bruto del emplado: "+ salario_bruto);
    }
    public void MostrarSalarioNeto(){
        System.out.println("Salario Neto del emplado: "+ salario_neto);
    }

}
