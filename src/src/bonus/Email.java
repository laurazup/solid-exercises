package bonus;

public class Email implements Notificacao{

    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail " + mensagem);
    }
}
