package pe.gymfit.dao;

public class DatosException extends RuntimeException {

    public DatosException(String msg, Throwable causa) {
        super(msg, causa);
    }
}
