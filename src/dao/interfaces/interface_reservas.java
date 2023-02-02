
package dao.interfaces;

import TiposReservas.Reservas;
import java.util.List;

public interface interface_reservas {
    public boolean crear(Reservas r);
    public boolean actualizar(Reservas r);
    public boolean borrar(String nro_reserva);
    public List<Reservas> obtener();
}
