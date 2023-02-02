package dao.clases;

import Admin.Admin_;
import Conexion.Conectar;
import dao.interfaces.interface_administrador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administradorCAD extends Conectar implements interface_administrador {

    @Override
    public boolean crear(Admin_ u) {
        int tamaño = obtener().size();
        u.setCuenta(tamaño);
        u.setUsuario(u.generar());
        System.out.println("" + u.getUsuario());
        conectar();
        String sql = "insert into administrador (usuario, email, contraseña, nombre, apellido) values('" + u.getUsuario() + "','" + u.getEmail() + "','" + u.getContraseña() + "','" + u.getNombre() + "','" + u.getApellido() + "')";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Admin_ u) {
        conectar();
        String sql = "update administrador set email='" + u.getEmail() + "', contraseña='" + u.getContraseña() + "', nombre='" + u.getNombre() + "', apellido='" + u.getApellido() + "' where usuario= '" + u.getUsuario() + "'";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from administrador where usuario='" + usuario + "'";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Admin_> obtener() {
        conectar();
        List<Admin_> consumos = new ArrayList<>();

        String sql = "select * from administrador";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Admin_ d = new Admin_(rs.getString("email"), rs.getString("contraseña"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("usuario"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Admin_ buscar(String usuario){
        for(Admin_ ad : obtener()){
            if(ad.getUsuario().equals(usuario)){
                return ad;
            }
        }
        return null;
    }

}
