package dao.clases;

import Conexion.Conectar;
import Users.User_;
import Users.Usuario;
import dao.interfaces.interface_usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuarioCAD extends Conectar implements interface_usuario {

    @Override
    public boolean crear(User_ u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setUsuario(u.generar());
        System.out.println(""+u.getUsuario());
        conectar();
        String sql = "insert into usuario (usuario, email, password, nombre, apellido) values('" + u.getUsuario() + "','" + u.getEmail() + "','" + u.getContraseña() + "','" + u.getNombre()+ "','" + u.getApellido()+ "')";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(User_ u) {
        conectar();
        String sql = "update usuario set email='" + u.getEmail() + "', password='" + u.getContraseña() + "', nombre='" + u.getNombre() + "', apellido='" + u.getApellido()+ "' where usuario='" + u.getUsuario()+ "'";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from usuario where usuario='" + usuario + "'";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<User_> obtener() {
        conectar();
        List<User_> consumos = new ArrayList<>();
        
        String sql = "select * from usuario";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                User_ d = new User_(rs.getString("email"), rs.getString("password"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("usuario"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public User_ buscar(String usuario){
        for(User_ ad : obtener()){
            if(ad.getUsuario().equals(usuario)){
                return ad;
            }
        }
        return null;
    }

}
