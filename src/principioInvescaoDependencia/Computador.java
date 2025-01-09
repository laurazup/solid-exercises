package principioInvescaoDependencia;

public class Computador {
    private DispositivoEntrada dispositivoEntrada;

    // Injeção de dependência via construtor
    public Computador(DispositivoEntrada dispositivoEntrada){
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo(){
        dispositivoEntrada.usar();
    }
}