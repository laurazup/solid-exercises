package bonus;

public class Sms implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS " + mensagem);
    }
}
