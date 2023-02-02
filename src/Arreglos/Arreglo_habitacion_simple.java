
package Arreglos;

import TiposHabitaciones.HabitacionSimple;

public class Arreglo_habitacion_simple implements Metodos{
    
    static HabitacionSimple vector[] = new HabitacionSimple[20];
    static int indice = 0;
    static int iniciar = 0;

    public Arreglo_habitacion_simple() {
         if(iniciar == 0){
            Incializar_habitaciones();
            iniciar ++;
        }
    }
    
    public HabitacionSimple buscar_habitacion(String nro){
        HabitacionSimple bus = null;
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
            HabitacionSimple hm = new HabitacionSimple(80.0," 1 cama ","Simple",1,0);
            agregar_habitacion_simple(hm);
        }
    }
    
    public void agregar_habitacion_simple(HabitacionSimple m){
        vector[indice] = m;
        indice++;
    }
    
    @Override
    public int tamaño(){
        return indice;
    }
    
    public HabitacionSimple obtener(int pos){
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
    
    @Override
    public String listar(){
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            cadena += vector[i].informacion_habitacion() + "\n" + "\n";
        }
        return cadena;
    }

}
