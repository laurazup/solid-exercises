package principioSegregacaoInterface;

public class AtendenteBanco implements Atendente {
    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}