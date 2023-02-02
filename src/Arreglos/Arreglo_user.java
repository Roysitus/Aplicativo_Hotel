
package Arreglos;

import Users.User_;

public class Arreglo_user {
    
    static User_ vector [] = new User_[100];
    static int indice = 0;
    
    public User_ buscar_usuario(String usuario){
        User_ bus = null;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getUsuario().equals(usuario)){
                bus = vector[i];
                break;
            }
        }
        return bus;
    }
    
    public void agregar_user(User_ us){
        vector[indice] = us;
        indice ++;
    }
    
     public int tamaño(){
        return indice;
    }
    public User_ obtner(int pos){
        return vector[pos];
    }
    public int buscar_posicion(String user){
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getUsuario().equals(user)){
                pos = i;
                break;
            }
        }
        return pos;
    }
}
