package bonus;

public abstract class Conta {
    private static int contador = 1;
    private int id;
    private double saldo;

    public Conta(double saldoInicial) {
        this.id = contador++;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.println("Seu saldo atual agora é: " + saldo);
        } else {
            System.out.println("Esse valor para depositar não existe!");
        }
    }

    public void sacar(double valor){
        if (valor <= saldo){
            System.out.println("Seu saldo atual agora é: " + saldo);
        } else {
            System.out.println("Esse valor para saque não está disponivel!");
        }
    }

    public void extrato(){
        System.out.println("ID da Conta: " + id);
        System.out.println("Tipo da Conta: " + getTipo());
        System.out.println("Saldo Atual: " + saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract String getTipo();
}
