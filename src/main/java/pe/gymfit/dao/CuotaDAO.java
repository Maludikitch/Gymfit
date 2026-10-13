package pe.gymfit.dao;

import java.util.List;
import java.util.Optional;
import pe.gymfit.modelo.Cuota;

public interface CuotaDAO {

    Optional<Cuota> buscarPorId(int idCuota);

    List<Cuota> listarPendientes(int idSocio);

    void actualizarPago(Cuota cuota);
}
