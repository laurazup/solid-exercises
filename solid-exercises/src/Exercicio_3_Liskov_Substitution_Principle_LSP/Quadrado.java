package Exercicio_3_Liskov_Substitution_Principle_LSP;

public class Quadrado implements Forma {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int area() {
        return largura * altura;
    }
}
