
package Arreglos;

import Clases.*;

public class Arreglo_Cliente {
    
    static Cliente vector[] = new Cliente[100];
    static int indice = 0;

    public Arreglo_Cliente() {
    }
    
    public Cliente buscar_cliente(String nombre){
        Cliente bus = null;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getNombre().equals(nombre)){
                bus = vector[i];
                break;
            }
        }
        return bus;
    }
    
    public void agregar_cliente(Cliente c){
        vector[indice] = c;
        indice++;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public Cliente obtener(int pos){
        return vector[pos];
    }
    
    public int buscar_posicion(String nombre){
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getNombre().equals(nombre)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public String listar(){
        String cadena="";
        for (int i = 0; i < indice; i++) {
            cadena += vector[i].informacion_cliente()+"\n"+"\n";
        }
        return cadena;
    }
    
}
