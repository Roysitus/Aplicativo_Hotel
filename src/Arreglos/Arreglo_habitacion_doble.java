
package Arreglos;

import TiposHabitaciones.HabitacionDoble;

public class Arreglo_habitacion_doble implements Metodos{
    
    static HabitacionDoble vector[] = new HabitacionDoble[20];
    static int indice = 0;
    static int iniciar = 0;

    public Arreglo_habitacion_doble() {
         if(iniciar == 0){
            Incializar_habitaciones();
            iniciar ++;
        }
    }
    
    public HabitacionDoble buscar_habitacion(String nro){
        HabitacionDoble bus = null;
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
            HabitacionDoble hm = new HabitacionDoble(80.0," 2 camas ","Doble",2,2);
            agregar_habitacion_doble(hm);
        }
    }
    
    public void agregar_habitacion_doble(HabitacionDoble m){
        vector[indice] = m;
        indice++;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public HabitacionDoble obtener(int pos){
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
