
package dao.interfaces;

import Admin.Admin_;
import java.util.List;

public interface interface_administrador {
    public boolean crear(Admin_ a);
    public boolean actualizar(Admin_ a);
    public boolean borrar(String usuario);
    public List<Admin_> obtener();
}
