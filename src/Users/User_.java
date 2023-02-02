package Users;

public class User_ {

    public static int getIncremento() {
        return incremento;
    }

    public static void setIncremento(int aIncremento) {
        incremento = aIncremento;
    }

    private String usuario;
    private String email;
    private String contraseña;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private static int incremento = 0;

    public User_() {
    }

    public User_(String email, String contraseña, String nombre, String apellido, String usuario) {
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = true;
    }
    
    public String generar(){
       return (""+nombre.charAt(0)+""+apellido.charAt(0)+"000"+incremento++).toUpperCase();
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
 
    public String informacion_user(){
        return "Usuario de la cuenta : " + this.usuario + "\n" +
                "Email: \t" + this.email + "\n" +
                "Contraseña: \t" + this.contraseña + "\n" +
                "Nombre y apellidos: " + this.nombre + " " + this.apellido + "\n";
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
