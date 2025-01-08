package principioAbertoFechado;

public class Calculadora {
    public int calcular(int a, int b, String operacao) {
        if (operacao.equals("soma")) {
            return a + b;
        } else if (operacao.equals("subtracao")) {
            return a - b;
        }
        return 0;
    }
}