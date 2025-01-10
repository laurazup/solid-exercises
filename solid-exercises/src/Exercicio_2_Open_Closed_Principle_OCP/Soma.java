package Exercicio_2_Open_Closed_Principle_OCP;

public class Soma implements Operacao{

    @Override
    public int calcular(int a, int b) {
        return a + b ;
    }
}
