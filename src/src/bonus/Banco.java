package bonus;

public class Banco {
    public Contas criarConta(String tipoConta, String titular, String numeroConta,  double saldoInicial, Notificacao notificacao){
        if (tipoConta.equalsIgnoreCase("Corrente")){
            return new ContaCorrente(tipoConta, titular, numeroConta, saldoInicial, notificacao);
        }
        if (tipoConta.equalsIgnoreCase("Poupança")){
            return new ContaPoupanca(tipoConta, titular, numeroConta, saldoInicial, notificacao);
        }
        else {
            throw new IllegalArgumentException("Tipo de conta não existe!");
        }
    }

}
