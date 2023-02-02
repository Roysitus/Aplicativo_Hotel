/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author USUARIO
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo_habitacion_simple obj_1 = new Arreglo_habitacion_simple();
        Arreglo_habitacion_doble obj_2 = new Arreglo_habitacion_doble();
        Arreglo_habitacion_matrimonial obj_3 = new Arreglo_habitacion_matrimonial();
        System.out.println(obj_1.listar()+"\n"+obj_2.listar()+"\n"+obj_3.listar());
    }
    
}
