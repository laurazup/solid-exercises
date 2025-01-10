package Exercicio_4_Interface_Segregation_Principle_ISP;
//Deixei com outro nome pois se não, não daria para criar a interface com este nome.
public class Atendentes implements Atendente{

    @Override
    public void atendente() {
        System.out.println("Atendendo cliente...");
    }
}