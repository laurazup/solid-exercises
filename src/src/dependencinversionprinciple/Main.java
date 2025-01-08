package dependencinversionprinciple;

public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();


        Computador computador1 = new Computador(teclado);
        Computador computador2 = new Computador(mouse);

        computador1.usarDispositivo();
        computador2.usarDispositivo();
    }
}
