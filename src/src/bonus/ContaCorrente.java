package bonus;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }
}
