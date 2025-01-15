package bonus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    private List<Conta> contas;
    private Scanner scanner;

    public Banco() {
        this.contas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void criarConta(){
        System.out.println("== Oi! Aqui é a IA do Banco ==");

        System.out.print(" - Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print(" - Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print(" - Digite o seu RG: ");
        String rg = scanner.nextLine();

        System.out.print(" - Digite a data de hoje: ");
        String data = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCriada = LocalDate.parse(data, formatter);

        Cliente cliente = new Cliente(nome,cpf,rg, dataCriada);

        System.out.println("Qual vai ser o Tipo da Conta?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // quebra de linha

        System.out.println("Vai depositar algum dinheiro na sua conta? (S/N)");
        var simNao = scanner.nextLine();

        double saldoInicial = 0.0;
        if (simNao.equalsIgnoreCase("S")){
            System.out.println("Qual o valor que deseja?");
            saldoInicial = scanner.nextDouble();
        } else {
            System.out.println("Não vai depositar nenhum dinheiro no momento!");
        }

        Conta conta = null;
        if (escolha == 1){
            conta = new ContaCorrente(saldoInicial, cliente);
        }
        else if (escolha == 2){
            conta = new ContaPoupanca(saldoInicial, cliente);
        }
        else {
            System.out.println("Esse tipo de conta não existe!");
            return;
        }

        contas.add(conta);
        System.out.println("Bem-Vindo ao Banco da Zup. Conta criada com sucesso!");
    }

    public void listarContas(){
        if (contas.isEmpty()){
            System.out.println("Nenhuma Conta Encontrada!");
        } else {
            for (Conta conta : contas){
                conta.extrato();
            }
        }
    }
}
