
package dao.interfaces;

import Users.User_;
import java.util.List;

public interface interface_usuario {
    public boolean crear(User_ u);
    public boolean actualizar(User_ u);
    public boolean borrar(String usuario);
    public List<User_> obtener();
}
