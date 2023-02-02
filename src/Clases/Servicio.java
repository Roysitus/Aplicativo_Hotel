
package Clases;

public class Servicio {
    
    private String nombre;
    private String descripcion;
    private double costo;

    public Servicio() {
        
    }

    public Servicio(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", costo=" + costo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
