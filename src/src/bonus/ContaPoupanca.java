package bonus;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldoInicial, Cliente cliente) {
        super(saldoInicial, cliente);
    }

    @Override
    public String getTipo(){
        return "Conta Poupança";
    }
}
