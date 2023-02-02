
package Arreglos;


public class Arreglo_reserva_simple implements Metodos{
    
//    static Reservas_simple r_simple[] = new Reservas_simple[20];
    
    static int indice = 0;
    
    public Arreglo_reserva_simple() {
    }
    
//    public Reservas_simple buscar_reserva(String nro){
//        Reservas_simple bus = null;
//        for (int i = 0; i < indice; i++) {
//            if(r_simple[i].getNroReserva().equals(nro)){
//                bus = r_simple[i];
//                break;
//            }
//        }
//        return bus;
//    }
//    
//     public void agregar_reserva_simple(Reservas_simple m){
//        r_simple[indice] = m;
//        indice++;
//    }
//    
    
    @Override
    public int tamaño(){
        return indice;
    }
    
//    public Reservas_simple obtener(int pos){
//        return r_simple[pos];
//    }
//    
//    public int buscar_posicion(String nro){
//        int pos = -1;
//        for (int i = 0; i < indice; i++) {
//            if(r_simple[i].getNroReserva().equals(nro)){
//                pos = i;
//                break;
//            }
//        }
//        return pos;
//    }
//    
//    @Override
//    public String listar(){
//        String cadena = "";
//        for (int i = 0; i < indice; i++) {
//            cadena += r_simple[i].informacion_reseva() + "\n" + "\n";
//        }
//        return cadena;
//    }

    @Override
    public String listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
