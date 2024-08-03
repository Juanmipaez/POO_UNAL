package POO_UNAL.Taller_3.EjercicioPropuesto18GUI;

public class Empleado {
    private String nombres;
    private String codigoEmpleado;
    private double horasTrabajadasAlMes;
    private double pagoPorHoraTrabajada;
    private double porcentajeRetencionEnLaFuente;
    private double salarioBruto;
    private double salarioNeto;

    public Empleado(String nombres, String codigoEmpleado, double horasTrabajadasAlMes, double pagoPorHoraTrabajada, double porcentajeRetencionEnLaFuente){
        this.nombres = nombres;
        this.codigoEmpleado = codigoEmpleado;
        this.horasTrabajadasAlMes = horasTrabajadasAlMes;
        this.pagoPorHoraTrabajada = pagoPorHoraTrabajada;
        this.porcentajeRetencionEnLaFuente = porcentajeRetencionEnLaFuente;
        calcularSalarios();
    }

    private void calcularSalarios() {
        salarioBruto = horasTrabajadasAlMes * pagoPorHoraTrabajada;
        salarioNeto = salarioBruto - ((porcentajeRetencionEnLaFuente * salarioBruto) / 100);
    }

    public String MostrarNombres() {
        return nombres;
    }

    public String MostrarCodigoEmpleado() {
        return codigoEmpleado;
    }

    public double MostrarSalarioBruto() {
        return salarioBruto;
    }

    public double MostarSalarioNeto() {
        return salarioNeto;
    }
}
