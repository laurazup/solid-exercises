package dependencinversionprinciple;

public class Computador {
    private DispositivoEntrada dispositivoEntrada;

    public Computador(DispositivoEntrada dispositivoEntrada){
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public DispositivoEntrada getDispositivoEntrada() {
        return dispositivoEntrada;
    }

    public void setDispositivoEntrada(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo() {
        dispositivoEntrada.usar();
    }
}
