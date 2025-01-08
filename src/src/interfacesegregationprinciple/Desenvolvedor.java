package interfacesegregationprinciple;

public class Desenvolvedor implements Programador{
    @Override
    public void programar() {
        System.out.println("O Desenvolvedor está programando!");
    }
}
