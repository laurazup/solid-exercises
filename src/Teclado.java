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