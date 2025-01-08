# Exercícios para praticar SOLID!

## Exercício 1: Single Responsibility Principle (SRP)

### Enunciado:
Você foi contratado por um banco para criar um sistema que gere relatórios financeiros. Atualmente, a classe RelatorioFinanceiro faz duas coisas: gera o relatório e envia por e-mail. Refatore o código para que ele siga o Princípio da Responsabilidade Única (SRP).

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

## Exercício 2: Open/Closed Principle (OCP)

### Enunciado:
Você está desenvolvendo uma calculadora para o banco que realiza operações básicas como soma e subtração. No entanto, o gerente pediu para adicionar uma nova operação: multiplicação. Refatore o código para que ele siga o Princípio Aberto/Fechado (OCP), permitindo adicionar novas operações sem modificar o código existente.

Código inicial (errado):
```java
public class Calculadora {
    public int calcular(int a, int b, String operacao) {
        if (operacao.equals("soma")) {
            return a + b;
        } else if (operacao.equals("subtracao")) {
            return a - b;
        }
        return 0;
    }
}
```

### Tarefa:
- Crie uma interface Operacao.
- Implemente classes separadas para cada operação (Soma, Subtração, Multiplicação).
- Refatore a classe Calculadora para usar a interface.

## Exercício 3: Liskov Substitution Principle (LSP)

### Enunciado:
Você está criando um sistema para calcular áreas de formas geométricas. Atualmente, a classe Quadrado herda de Retangulo, mas isso está causando problemas porque o comportamento de Quadrado não é consistente com o de Retangulo. Refatore o código para que ele siga o Princípio da Substituição de Liskov (LSP).

Código inicial (errado):
```java
public class Retangulo {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }
}

public class Quadrado extends Retangulo {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura;
    }
}
```

### Tarefa:
- Crie uma interface Forma com o método getArea().
- Implemente classes separadas para Retangulo e Quadrado, sem herança direta entre elas.

## Exercício 4: Interface Segregation Principle (ISP)

### Enunciado:
Você está desenvolvendo um sistema para gerenciar funcionários de um banco. Atualmente, a interface Funcionario força todos os funcionários a implementarem métodos que nem todos utilizam. Refatore o código para que ele siga o Princípio da Segregação de Interfaces (ISP).

Código inicial (errado):
```java
public interface Funcionario {
    void programar();
    void atenderCliente();
}

public class Desenvolvedor implements Funcionario {
    public void programar() {
        System.out.println("Programando...");
    }

    public void atenderCliente() {
        // Não faz sentido para um desenvolvedor
    }
}

public class Atendente implements Funcionario {
    public void programar() {
        // Não faz sentido para um atendente
    }

    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}
```

### Tarefa:
- Separe a interface Funcionario em interfaces menores, como Programador e Atendente.
- Faça com que cada classe implemente apenas a interface que faz sentido para ela.

## Exercício 5: Dependency Inversion Principle (DIP)

### Enunciado:
Você está criando um sistema para gerenciar dispositivos de entrada de um computador. Atualmente, a classe Computador depende diretamente da classe Teclado, o que dificulta a substituição por outros dispositivos, como um mouse. Refatore o código para que ele siga o Princípio da Inversão de Dependência (DIP).

Código inicial (errado):
```java
public class Teclado {
    public void digitar() {
        System.out.println("Digitando...");
    }
}

public class Computador {
    private Teclado teclado;

    public Computador() {
        this.teclado = new Teclado();
    }
}
```

### Tarefa:
- Crie uma interface DispositivoEntrada com o método usar().
- Faça com que Teclado implemente essa interface.
- Modifique a classe Computador para depender da interface, e não da implementação concreta.

## Exercício Bônus: Projeto Final com SOLID

### Enunciado:
Crie um sistema para gerenciar contas bancárias que siga os princípios SOLID. O sistema deve:
- Permitir criar diferentes tipos de contas (Conta Corrente, Conta Poupança).
- Calcular taxas específicas para cada tipo de conta.
- Enviar notificações por e-mail ou SMS quando uma transação for realizada.

### Tarefa:
- Use o SRP para separar responsabilidades (ex.: cálculo de taxas, envio de notificações).
- Use o OCP para permitir adicionar novos tipos de contas sem modificar o código existente.
- Use o LSP para garantir que todas as contas possam ser tratadas de forma consistente.
- Use o ISP para criar interfaces específicas para cada funcionalidade.
- Use o DIP para que o sistema dependa de abstrações, e não de implementações concretas.
