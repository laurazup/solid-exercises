package interfacesegregationprinciple;

public class Funcionario implements Atendente{

    @Override
    public void atenderCliente() {
        System.out.println("Está Atendendo a Cliente!");
    }
}
