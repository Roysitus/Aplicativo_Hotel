
package Clases;
/*
Esto dice wilder
*/
public class Usuario {
    
    private String usuario;
    private String email;
    private String password;
    private String nombre;
    private String apellido;

    public Usuario() {
        
    }

    public Usuario(String usuario, String email, String password, String nombre, String apellido) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", email=" + email + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
