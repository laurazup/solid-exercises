package Exercicio_3_Liskov_Substitution_Principle_LSP;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite 1 para retangulo, 2 para quadrado e 3 para sair");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                Retangulo usuario = new Retangulo();
                System.out.println("Digite a base");
                usuario.largura = scanner.nextInt();
                System.out.println("Digite a altura");
                usuario.largura = scanner.nextInt();
                usuario.area();
            }
            if (opcao == 2){
                Quadrado usuario = new Quadrado();
                System.out.println("Digite a base: ");
                usuario.largura = scanner.nextInt();
                usuario.altura = usuario.largura;
                usuario.area();
            }

        }while (opcao != 3);
    }
}