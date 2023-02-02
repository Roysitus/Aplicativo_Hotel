
package TiposHabitaciones;

import Clases.Habitacion;
/*
Esto dice vicente
*/
public class HabitacionMatrimonial extends Habitacion implements Informacion_de_habitaciones{
    
    private double precio;
    private String descripcion;
    private boolean habilitado;

    public HabitacionMatrimonial() {
        
    }

    public HabitacionMatrimonial(double precio, String descripcion,String tipo, int nro_adultos, int nro_ninos) {
        super(tipo, nro_adultos, nro_ninos);
        this.precio = precio;
        this.descripcion = descripcion;
        this.habilitado = true;
    }

   

    @Override
    public String informacion_habitacion() {
        String cadena = "";
        cadena += super.informacion_habitacion() + "\n" +
                "Precio de la habitacion: " + this.precio + "\n" +
                "Descripcion : " + this.descripcion + "\n" +
                "Se encuentra [ Desocupado(true)  /-/  Ocupado(false) ]" + this.habilitado + "\n";
        return cadena;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
     
    
}
