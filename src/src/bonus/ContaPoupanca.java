package bonus;

public class ContaPoupanca implements Contas{

    private String titular;
    private String numeroConta;
    private double saldo;
    private  Notificacao notificacao;

    public ContaPoupanca(String titular, String numeroConta, String conta, double saldo, Notificacao notificacao) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.notificacao = notificacao;
    }

    @Override
    public void extrato() {
        System.out.println("Titular " + this.titular);
        System.out.println("Número da Conta " + this.numeroConta);
        System.out.println("Saldo " + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Seu saldo agora é " + saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Seu saldo agora é " + saldo);
    }

    @Override
    public void saldo() {
        System.out.println("Seu saldo é " + saldo);
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
}
