package martes.ma.dominio;

import java.util.Set;

import lombok.Setter;
@Setter
public class NotificadorEmail implements Notificador{
    private Set<Interesado> interesados;
    private EmailAdapter adaptadorDeEmails;
    @Override
    public void notificarInteresados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notificarInteresados'");
    }
    
}
