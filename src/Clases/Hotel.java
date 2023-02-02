
package Clases;

public class Hotel {
    
    private String nombreH;
    private String categoria;
    private String direccion;
    private String telefono;
    private String ciudad;

    public Hotel() {
        
    }

    public Hotel(String nombreH, String categoria, String direccion, String telefono, String ciudad) {
        this.nombreH = nombreH;
        this.categoria = categoria;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombreH=" + nombreH + ", categoria=" + categoria + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad=" + ciudad + '}';
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
