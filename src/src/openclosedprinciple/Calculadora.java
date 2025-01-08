package openclosedprinciple;

public class Calculadora {
    public int calcular(int a, int b, Operacao operacao){
        return operacao.tabuada(a,b);
    }
}
