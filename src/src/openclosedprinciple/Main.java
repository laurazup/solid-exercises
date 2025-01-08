package openclosedprinciple;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        System.out.println("Soma dos números é " + calculadora.calcular(5,3,soma));
        System.out.println("Subtração dos números é " + calculadora.calcular(5,3,subtracao));
        System.out.println("Multiplicação dos números é " + calculadora.calcular(5,3,multiplicacao));
        System.out.println("Divisão dos números é " + calculadora.calcular(5,3,divisao));

    }
}
