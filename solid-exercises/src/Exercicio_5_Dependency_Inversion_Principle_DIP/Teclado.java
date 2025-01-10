package Exercicio_5_Dependency_Inversion_Principle_DIP;

public class Teclado implements DispositivoEntrada {
    @Override
    public void usar() {
        System.out.println("Digitando...");
    }
}
