package bonus;

public class ContaCorrente implements Contas{

    private String titular;
    private String numeroConta;
    private double saldo;
    private Notificacao notificacao;
    private Banco banco;


    public ContaCorrente(String titular, String numeroConta, String tipoConta, double saldo, Notificacao notificacao) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.notificacao = notificacao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void extrato() {
        System.out.println("Titular " + getTitular());
        System.out.println("Número da Conta " + getNumeroConta());
        System.out.println("Saldo " + getSaldo());
    }



    public void sacar(double valor) {
        if (valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Seu saldo agora é " + saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar!");
        }
    }


    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Seu saldo agora é " + saldo);
    }


    public void saldo() {

    }
}
