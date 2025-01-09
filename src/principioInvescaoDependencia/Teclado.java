package principioInvescaoDependencia;

public class Teclado implements DispositivoEntrada {
    @Override
    public void usar() {
        System.out.println("Teclado conectado: Pronto para uso");
    }
}