
package dao.clases;

import Conexion.Conectar;
import TiposReservas.Reservas;
import dao.interfaces.interface_reservas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class reservasCAD extends Conectar implements interface_reservas{

    @Override
    public boolean crear(Reservas u) {
        int tamaño = obtener().size();
        u.setCuenta(tamaño);
        u.setNroReserva(u.generar());
        System.out.println(""+u.getNroReserva());
        conectar();
        String sql = "insert into reserva (nro_reserva, nro_habitacion, nro_noches, fecha_ingreso, fecha_salida, servicio, tipo) values('"+u.getNroReserva()+"','"+u.getNroHabitacion()+"','"+u.getNroNoches()+"','"+u.getFecha_ingreso()+"','"+u.getFecha_salida()+"','"+u.getServicio()+"','"+u.getTipo()+"')";
        try{
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        }catch(Exception e){
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException ex){
                Logger.getLogger(reservasCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Reservas u) {
        conectar();
        String sql = "update reserva set nro_habitacion='"+u.getNroHabitacion()+"', nro_noches='"+u.getNroNoches()+"', fecha_ingreso='"+u.getFecha_ingreso()+"', fecha_salida='"+u.getFecha_salida()+"', servicio='"+u.getServicio()+"', tipo='"+u.getTipo()+"' where nro_reserva='"+u.getNroReserva()+"'";
        try{
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        }catch(Exception e){
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException ex){
                Logger.getLogger(reservasCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String nro_reserva) {
        conectar();
        String sql = "delete from reserva where nro_reserva='"+nro_reserva+"'";
        try{
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        }catch(Exception e){
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException ex){
                Logger.getLogger(reservasCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Reservas> obtener() {
        conectar();
        List<Reservas> consumos = new ArrayList<>();
        
        String sql = "select * from reserva";
        try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Reservas d = new Reservas(rs.getString("nro_habitacion"), rs.getInt("nro_noches"), rs.getString("fecha_ingreso"), rs.getString("fecha_salida"), rs.getString("servicio"), rs.getString("tipo"), rs.getString("nro_reserva"));
                consumos.add(d);
            }
        }catch(Exception e){
        }finally{
            try{
                conexion.close();
            }catch(SQLException ex){
                Logger.getLogger(reservasCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Reservas buscar(String nroReserva){
        for(Reservas ad : obtener()){
            if(ad.getNroReserva().equals(nroReserva)){
                return ad;
            }
        }
        return null;
    }
}
