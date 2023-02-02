
package TiposReservas;

public class Reservas {

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int aCuenta) {
        cuenta = aCuenta;
    }

    
    private String nroReserva;
    private String nroHabitacion;
    private int nroNoches;
    private String fecha_ingreso;
    private String fecha_salida;
    private String servicio;
    private String tipo;
    private boolean habilitado;
    private static int cuenta = 0;

    public Reservas() {
    }

    public Reservas(String nroHabitacion, int nroNoches, String fecha_ingreso, String fecha_salida, String servicio, String tipo, String nro_reserva) {
        this.nroReserva = nro_reserva;
        this.nroHabitacion = nroHabitacion;
        this.nroNoches = nroNoches;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.servicio = servicio;
        this.habilitado = false;
        this.tipo = tipo;
    }
    
    public String generar(){
        return "RV00"+cuenta++;
    }
    
    public String toString(){
        String cadena = "";
        cadena = "Numero de Reserva: " + this.nroReserva + "\n" +
                "Numero de Habitacion : " + this.nroHabitacion + "\n" +
                "Numero de Noches : " + this.nroNoches + "\n" +
                "Fecha de Ingreso : " + this.fecha_ingreso + "\n" +
                "Fecha de Salida : " + this.fecha_salida + "\n" +
                "Servicio adquirido: " + this.servicio + "\n";
        return cadena;
    }

    public String getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(String nroReserva) {
        this.nroReserva = nroReserva;
    }

    public String getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(String nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getNroNoches() {
        return nroNoches;
    }

    public void setNroNoches(int nroNoches) {
        this.nroNoches = nroNoches;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
