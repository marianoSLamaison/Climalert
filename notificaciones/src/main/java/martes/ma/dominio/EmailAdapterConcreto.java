package martes.ma.dominio;

import org.springframework.mail.javamail.JavaMailSender;

import martes.ma.dominio.excepciones.ExcepcionEnvioMailFallido;

public class EmailAdapterConcreto implements EmailAdapter{
    JavaMailSender mailSenderJava;
    public void enviarEmail(String remitente, String destinatario, String asunto, String cuerpo) throws ExcepcionEnvioMailFallido{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarEmail'");
    }
    
}
