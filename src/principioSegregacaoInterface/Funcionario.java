package principioSegregacaoInterface;

public interface Funcionario {
    void programar();
    void atenderCliente();
}

public class Desenvolvedor implements Funcionario {
    public void programar() {
        System.out.println("Programando...");
    }

    public void atenderCliente() {
        // Não faz sentido para um desenvolvedor
    }
}

public class Atendente implements Funcionario {
    public void programar() {
        // Não faz sentido para um atendente
    }

    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}