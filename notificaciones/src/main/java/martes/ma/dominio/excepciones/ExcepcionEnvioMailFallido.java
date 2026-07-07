package martes.ma.dominio.excepciones;

public class ExcepcionEnvioMailFallido extends RuntimeException{
    public ExcepcionEnvioMailFallido(String message)
    {
        super(message);
    }
}
