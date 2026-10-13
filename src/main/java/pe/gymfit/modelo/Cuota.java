package pe.gymfit.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author malek
 */
public class Cuota {

    private int idCuota;
    private int idMembresia;
    private BigDecimal monto;
    private LocalDate fechaVencimiento;
    private EstadoCuota estado = EstadoCuota.PENDIENTE;
    private MedioPago medio;
    private LocalDateTime fechaPago;

    public Cuota(int idCuota, int idMembresia, BigDecimal monto, LocalDate vence) {
        this.idCuota = idCuota;
        this.idMembresia = idMembresia;
        this.monto = monto;
        this.fechaVencimiento = vence;
    }

    public boolean estaPendiente() {
        return estado == EstadoCuota.PENDIENTE;
    }

    public void marcarPagada(MedioPago medio) {
        this.estado = EstadoCuota.PAGADA;
        this.medio = medio;
        this.fechaPago = LocalDateTime.now();
    }

    public int getIdCuota() {
        return idCuota;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public EstadoCuota getEstado() {
        return estado;
    }

    public MedioPago getMedio() {
        return medio;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void cargarPago(EstadoCuota estado, MedioPago medio, LocalDateTime fechaPago) {
        this.estado = estado;
        this.medio = medio;
        this.fechaPago = fechaPago;
    }
}
