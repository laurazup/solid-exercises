package principioSegregacaoInterface;

public class Main {
    public static void main(String[] args) {
        Programador desenvolvedor = new Desenvolvedor();
        desenvolvedor.programar();

        Atendente atendente = new AtendenteBanco();
        atendente.atenderCliente();
    }
}