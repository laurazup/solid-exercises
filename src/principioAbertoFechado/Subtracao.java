package principioAbertoFechado;

public class Subtracao implements Operacao {
    @Override
    public int calcular (int numero1, int numero2){
        return numero1 - numero2;
    }
}