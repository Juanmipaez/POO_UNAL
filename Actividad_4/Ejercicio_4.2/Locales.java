package Inmuebles;

public class Locales extends Inmueble {
    enum tipo {interno, calle}
    protected tipo TipoLocal;

    public Locales(int IdentificadorInmobiliario, int AreaM2, String Direccion, tipo TipoLocal){
        super(IdentificadorInmobiliario, AreaM2, Direccion);
        this.TipoLocal = TipoLocal;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: "+TipoLocal);
    }
}
