
package Arreglos;

import TiposHabitaciones.HabitacionMatrimonial;

public class Arreglo_habitacion_matrimonial implements Metodos{
    
    static HabitacionMatrimonial vector[] = new HabitacionMatrimonial[10];
    static int indice = 0;
    static int iniciar = 0;

    public Arreglo_habitacion_matrimonial() {
        if(iniciar == 0){
            Incializar_habitaciones();
            iniciar ++;
        }
    }
    
    public HabitacionMatrimonial buscar_habitacion(String nro){
        HabitacionMatrimonial bus = null;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getNumero().equals(nro)){
                bus = vector[i];
                break;
            }
        }
        return bus;
    }
    
    public void Incializar_habitaciones(){
        for (int i = 0; i < vector.length; i++) {
            HabitacionMatrimonial hm = new HabitacionMatrimonial(80.0," 1 cama extra grande ","Matrimonial",2,0);
            agregar_habitacion_matrimonial(hm);
        }
    }
    
    public void agregar_habitacion_matrimonial(HabitacionMatrimonial m){
        vector[indice] = m;
        indice++;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public HabitacionMatrimonial obtener(int pos){
        return vector[pos];
    }
    
    public int buscar_posicion(String nro){
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getNumero().equals(nro)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public String listar(){
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            cadena += vector[i].informacion_habitacion() + "\n" + "\n";
        }
        return cadena;
    }
}
