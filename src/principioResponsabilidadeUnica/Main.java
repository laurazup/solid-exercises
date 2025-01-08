package principioResponsabilidadeUnica;

public class Main {
    public static void main(String[] args) {
        // classes responsáveis
        GeradorRelatorioFinanceiro gerador = new GeradorRelatorioFinanceiro();
        EnviarPorEmail enviador = new EnviarPorEmail();

        gerador.gerarRelatorio();

        enviador.enviarPorEmail();
    }
}