package principioAbertoFechado;

import java.util.HashMap; //implementação concreta da interface Map que usa tabelas hash para armazenar os dados.
import java.util.Map; //É uma interface que define o comportamento de coleções baseadas em pares de chave-valor.

public class Calculadora {
    private Map<String, Operacao> operacoesRegistradas = new HashMap<>();

    //Método para registrar novas operações
    public void registrarOperacao (String nomeOperacao, Operacao operacao){
        operacoesRegistradas.put(nomeOperacao, operacao);
    }

    // Método para calcular usando a operação registrada
    public int executarOperacao (String nomeOperacao, int numero1, int numero2){
        Operacao operacao = operacoesRegistradas.get(nomeOperacao);
        if (operacao == null) {
            throw new IllegalArgumentException("Operação não registrada: " + nomeOperacao);
        }
        return operacao.calcular(numero1, numero1);
    }

}