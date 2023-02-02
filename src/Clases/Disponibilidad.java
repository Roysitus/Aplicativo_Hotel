
package Clases;

public class Disponibilidad {
    
    private String fecha;
    private boolean disponible;
    private boolean reservada;
    private double precio;

    public Disponibilidad() {
    }

    public Disponibilidad(String fecha, boolean disponible, boolean reservada, double precio) {
        this.fecha = fecha;
        this.disponible = disponible;
        this.reservada = reservada;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Disponibilidad{" + "fecha=" + fecha + ", disponible=" + disponible + ", reservada=" + reservada + ", precio=" + precio + '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
