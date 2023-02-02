
package Arreglos;

import Admin.Admin_;

public class Arreglo_admin {
    
    public static Admin_ vector [] = new Admin_[100];
    
    static int indice = 0;

    public Arreglo_admin() {
    }
    
    public void generar_admin(){
        if(indice == 0){
        Admin_ ad = new Admin_("alexchinchano@gmail.com","bask3t*16","Alex","Chinchano",""); // AC0000
        agregar_admin(ad);
        }
    }

    public Admin_ buscar_usuario(String usuario){
        System.out.println(""+vector[0].informacion_admin());
        Admin_ bus = null;
        for (int i = 0; i < indice; i++) {
            if(vector[i].getUsuario().equals(usuario)){
                bus = vector[i];
                break;
            }
        }
        return bus;
    }
    
    public void agregar_admin(Admin_ ad){
        vector[indice] = ad;
        indice++;
    }
    
    public int tamaño(){
        return indice;
    }
    public Admin_ obtner(int pos){
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
