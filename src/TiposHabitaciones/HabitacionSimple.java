
package TiposHabitaciones;

import Clases.Habitacion;
/*
Esto dice vicente
*/
public class HabitacionSimple extends Habitacion implements Informacion_de_habitaciones{
    
    private double precio;
    private String descipcion;
    private boolean habilitado;

    public HabitacionSimple() {
    }

    public HabitacionSimple(double precio, String descipcion, String tipo, int nro_adultos, int nro_ninos) {
        super(tipo, nro_adultos, nro_ninos);
        this.precio = precio;
        this.descipcion = descipcion;
        this.habilitado = true;
    }

    @Override
    public String informacion_habitacion() {
        String cadena = "";
        cadena += super.informacion_habitacion() + "\n" +
                "Precio de la habitacion: " + this.precio + "\n" +
                "Descripcion : " + this.descipcion + "\n" +
                "Se encuentra [ Desocupado(true)  /-/  Ocupado(false) ]" + this.habilitado + "\n";
        return cadena;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
