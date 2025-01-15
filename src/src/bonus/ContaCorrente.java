package bonus;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldoInicial, Cliente cliente) {
        super(saldoInicial, cliente);
    }

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }
}
