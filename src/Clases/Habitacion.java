
package Clases;
/*
Esto dice vicente
*/
public class Habitacion{
    
    private String numero;
    private String tipo;
    private int nro_adultos;
    private int nro_ninos;
    static int cuenta = 0;
    public Habitacion() {
    }

    public Habitacion(String tipo, int nro_adultos, int nro_ninos) {
        this.numero = "H00"+cuenta++;
        this.tipo = tipo;
        this.nro_adultos = nro_adultos;
        this.nro_ninos = nro_ninos;
    }

    
    public String informacion_habitacion(){
        String cadena="";
        cadena = "Numero de Habitacion: "+ this.numero + "\n" +
                "Tipo de Habitacion: " + this.tipo + "\n" +
                "Cantidad de Adultos: " + this.nro_adultos + "\n" +
                "Cantidad de niños: " + this.nro_ninos;
        return cadena;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNro_adultos() {
        return nro_adultos;
    }

    public void setNro_adultos(int nro_adultos) {
        this.nro_adultos = nro_adultos;
    }

    public int getNro_ninos() {
        return nro_ninos;
    }

    public void setNro_ninos(int nro_ninos) {
        this.nro_ninos = nro_ninos;
    }
    
}
