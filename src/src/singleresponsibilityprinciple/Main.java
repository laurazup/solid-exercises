package singleresponsibilityprinciple;

public class Main {
    public static void main(String[] args) {

        GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        RelatorioFinanceiro relatorioFinanceiro = new RelatorioFinanceiro();

        geradorDeRelatorio.gerarRelatorio();
        enviadorDeEmail.enviarEmail();
        relatorioFinanceiro.relatorioDeFinancas();
    }
}