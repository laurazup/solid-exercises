package bonus;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        Notificacao email = new Email();
        Notificacao sms = new Sms();

        Contas contaCorrente = banco.criarConta("Corrente", "Jõao","1123453-1", 1000.00, email);

        contaCorrente.extrato();

    }
}
