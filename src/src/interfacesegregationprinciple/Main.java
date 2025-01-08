package interfacesegregationprinciple;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Funcionario funcionario = new Funcionario();

        desenvolvedor.programar();
        funcionario.atenderCliente();
    }
}
