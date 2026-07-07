package martes.ma.dominio;

import martes.ma.dominio.excepciones.ExcepcionEnvioMailFallido;

public interface EmailAdapter {
    public void enviarEmail(String remitente, String destinatario, String asunto, String cuerpo) throws ExcepcionEnvioMailFallido;
}
