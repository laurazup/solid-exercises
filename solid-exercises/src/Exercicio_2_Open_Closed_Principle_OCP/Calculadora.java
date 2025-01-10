package Exercicio_2_Open_Closed_Principle_OCP;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacao;
        System.out.print("Digite soma para somar, subtracao para subtrair e multiplicacao para multiplicar ");
        operacao = scanner.next();
        if (operacao.equals("soma")) {
            Soma usuario = new Soma();
            usuario.calcular(scanner.nextInt(),scanner.nextInt());
        } else if (operacao.equals("subtracao")) {
          Subtracao usuario = new Subtracao();
          usuario.calcular(scanner.nextInt(), scanner.nextInt());
        }else if (operacao.equals("multiplicacao")){
            Multiplicacao usuario = new Multiplicacao();
            usuario.calcular(1,2);}
    }
}