package bonus;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public String getTipo(){
        return "Conta Poupança";
    }
}
