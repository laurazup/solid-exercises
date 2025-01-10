package bonus;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Banco banco = new Banco();

        int menu = 0;

            do {
                System.out.println("== Banco do Zup ==");
                System.out.println("1 -- Crie a sua Conta");
                System.out.println("2 -- Listar as Contas");
                System.out.println("3 -- Sair");
                System.out.print("Escolha uma opção: ");
                menu = scanner.nextInt();

                switch (menu){
                    case 1:
                        banco.criarConta();
                        break;
                    case 2:
                        banco.listarContas();
                        break;
                    case 3:
                        System.out.println("Saindo do Sistema");
                        break;
                    default:
                        System.out.println("Opção não existe!");
                        break;
                }
            }
                while (menu != 3);
                scanner.close();
    }
}
