
package Clases;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String pais;
    private String ciudad;
    private String sexo;
    private boolean habilitado;

    public Cliente(String nombre, String apellido, String pais, String ciudad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.ciudad = ciudad;
        this.sexo = sexo;
        this.habilitado = true;
    }
    
    public String informacion_cliente(){
        return "El nombre del cliente es: " + this.nombre + "\n" +
                "El apellido del cliente es: " + this.apellido + "\n" +
                "El pais del cliente es: " + this.pais + "\n" + 
                "La ciudad es : " + this.ciudad + "\n" +
                "El sexo del cliente es: " + this.sexo + "\n" +
                "Se encuentra [Habilitado - Desabilitado]: " + this.habilitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
}
