# Exercícios para praticar SOLID!

## Exercício 1: Single Responsibility Principle (SRP)

### Enunciado:
Você foi contratado por um banco para criar um sistema que gere relatórios financeiros. Atualmente, a classe RelatorioFinanceiro faz duas coisas: gera o relatório e envia por e-mail. Refatore o código para que ele siga o Princípio da Responsabilidade Única (SRP).

Sobre (SRP): O Princípio da Responsabilidade Única (SRP, do inglês Single Responsibility Principle) é um princípio de orientação a objetos que define que uma classe deve ter apenas uma responsabilidade

Código inicial (errado):
```java
public class RelatorioFinanceiro {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void enviarPorEmail() {
        System.out.println("Enviando relatório por e-mail...");
    }
}
```

### Tarefa:

- Separe as responsabilidades em classes diferentes.
- Crie uma classe para gerar o relatório e outra para enviar o e-mail.
------------------------------------------------------------------------------------------------------------------------------------------
# Resumo do projeto:
* classe RelatorioFinanceiro: Serve para mostrar ao usuario o enviar email e gerar relatorio financeiro.
* classe EnviarPorEmail; envia o email.
* classe GerarRelatorio: gera o relatorio.