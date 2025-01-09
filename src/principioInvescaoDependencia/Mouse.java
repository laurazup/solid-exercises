package principioInvescaoDependencia;

public class Mouse implements DispositivoEntrada{
    @Override
    public void usar() {
        System.out.println("Mouse conectado: Pronto para uso");
    }
}