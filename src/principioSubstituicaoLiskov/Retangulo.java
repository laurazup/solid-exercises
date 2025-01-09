package principioSubstituicaoLiskov;

public class Retangulo implements Forma{
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura){
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}