package Exercicio_1_Single_Responsibility_Principle_SRP;
import Exercicio_1_Single_Responsibility_Principle_SRP.GerarRelatorio;
import Exercicio_1_Single_Responsibility_Principle_SRP.EnviarPorEmail;
import java.util.Scanner;
public class RelatorioFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.print("Digite 1 para Gerar Relatorio, 2 para Enviar Por Email e 3 para sair ");
            escolha = scanner.nextInt();
            if (escolha == 1){
                GerarRelatorio usuario = new GerarRelatorio();
                usuario.gerar();
            } else if (escolha == 2){
                EnviarPorEmail usuario = new EnviarPorEmail();
                usuario.enviar();
                }
            } while (escolha != 3);
    }
}
